package l30Threads2.NewThread.ThreadPool;

import java.util.concurrent.*;

public class threadPool {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(5);  // Створення пулу з 5 потоками

        for (int i = 0; i < 10; i++) {
            executorService.submit(() -> {
                System.out.println("Task executed by " + Thread.currentThread().getName());
            });
        }

        executorService.shutdown();  // Завершення роботи пулу потоків після виконання всіх завдань
    }

    //ScheduledExecutorService
    private static void schedule() {
        ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);

        // Запускає завдання з 3-секундною затримкою
        scheduler.schedule(() -> {
            System.out.println("Task executed after 3 seconds");
        }, 3, TimeUnit.SECONDS);

        // Запускає завдання з 2-секундною затримкою, а потім кожні 5 секунд
        scheduler.scheduleAtFixedRate(() -> {
            System.out.println("Repeating task");
        }, 2, 5, TimeUnit.SECONDS);

        // Для прикладу ми не викликаємо scheduler.shutdown(), щоб завдання могли виконуватися
    }

    //ForkJoinPool
    /*
    ForkJoinPool призначений для роботи з рекурсивними завданнями,
    де завдання може бути розділене на менші підзавдання, які потім можуть бути об'єднані для отримання кінцевого результату.
     */
    private static void forkJoinPool() {
        ForkJoinPool pool = new ForkJoinPool();
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        SumTask task = new SumTask(array, 0, array.length);
        int result = pool.invoke(task);
        System.out.println("Sum: " + result);
        pool.shutdown();
    }


    /*
    ForkJoinPool був введений в Java 7 як частина нової парадигми паралельного програмування, спрямованої на оптимізацію рекурсивного розбиття завдань на підзавдання. Його основна мета — ефективне використання ресурсів процесора для обчислювально важких завдань.

    Ось декілька причин, чому ForkJoinPool було введено окремо від Executors:

    Специфічна Семантика: ForkJoinPool працює за принципом "розділити і володарювати", де завдання розділяються на менші підзавдання д
    о тих пір, поки вони не досягнуть розміру, який можна обробити без подальшого розбиття. Ця семантика відрізняється від традиційних пулів потоків.

    Work-Stealing: Однією з ключових особливостей ForkJoinPool є алгоритм "work-stealing".
     Коли потік завершує свої завдання, він може "вкрасти" завдання від інших потоків, які ще працюють. Це допомагає забезпечити, що всі потоки в пулі завжди зайняті.

    Оптимізація для Рекурсивних Завдань: ForkJoinPool оптимізований для рекурсивних завдань, які можуть бути розділені на підзавдання.

    Специфічні Засоби: ForkJoinPool вводить такі засоби, як RecursiveTask і RecursiveAction,
     які специфічно розроблені для рекурсивного розбиття завдань.
     */
    static class SumTask extends RecursiveTask<Integer> {
        private final int[] array;
        private final int start;
        private final int end;

        SumTask(int[] array, int start, int end) {
            this.array = array;
            this.start = start;
            this.end = end;
        }

        @Override
        protected Integer compute() {
            if (end - start <= 2) {  // базовий випадок
                int sum = 0;
                for (int i = start; i < end; i++) {
                    sum += array[i];
                }
                return sum;
            } else {  // розділити завдання
                int mid = (start + end) / 2;
                SumTask leftTask = new SumTask(array, start, mid);
                SumTask rightTask = new SumTask(array, mid, end);
                leftTask.fork();  // запустити ліве підзавдання асинхронно
                return rightTask.compute() + leftTask.join();
            }
        }
    }


}
