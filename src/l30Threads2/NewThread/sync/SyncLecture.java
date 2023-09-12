package l30Threads2.NewThread.sync;


import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.Semaphore;

/*
Ці утиліти допомагають координувати роботу між потоками,
коли проста синхронізація за допомогою synchronized або volatile не є достатньою.
 */
public class SyncLecture {

    public static void main(String[] args) {
        countDownLatch();
        cyclicBarrier();
        semaphore();
    }

    private static void countDownLatch() {
        CountDownLatch latch = new CountDownLatch(2);
        System.out.println("Count down start");
        new Thread(() -> {
            System.out.println("Task 1 is running");
            latch.countDown();
        }).start();

        new Thread(() -> {
            System.out.println("Task 2 is running");
            latch.countDown();
        }).start();

        try {
            latch.await();  // Головний потік чекає, поки обидва завдання не завершаться
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Both tasks are done");
        System.out.println("Count down ends");
    }


/*    CyclicBarrier
    Це синхронізаційний допоміжник, який дозволяє групі потоків чекати один одного, щоб досягти спільної бар'єрної точки.

    Ініціалізація: Коли ви створюєте CyclicBarrier, ви вказуєте кількість потоків,
    які повинні досягти бар'єрної точки, перш ніж потоки можуть продовжити виконання.
    У нашому прикладі ми вказали 2, тому що у нас два потоки, які будуть досягати бар'єру.*/


    private static void cyclicBarrier(){
        System.out.println("cyclicBarrier start");
        CyclicBarrier barrier = new CyclicBarrier(2, () -> {
            System.out.println("Both tasks reached the barrier");
        });

        new Thread(() -> {
            System.out.println("Task 1 is approaching the barrier");
            try {
                barrier.await();
            } catch (InterruptedException | BrokenBarrierException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Task 1 passed the barrier");
        }).start();

        new Thread(() -> {
            System.out.println("Task 2 is approaching the barrier");
            try {
                barrier.await();
            } catch (InterruptedException | BrokenBarrierException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Task 2 passed the barrier");
        }).start();
        System.out.println("cyclicBarrier ends");
    }




//    Semaphore
//    Семафор контролює доступ до ресурсу за допомогою лічильника.
//    Якщо лічильник більший за нуль, доступ дозволено; якщо він нульовий, доступ заборонено.

    private static void semaphore() {
        System.out.println("semaphore start");
        Semaphore semaphore = new Semaphore(1);  // Тільки один потік може мати доступ одночасно

        new Thread(() -> {
            try {
                semaphore.acquire();
                System.out.println("Task 1 is running");
                System.out.println("Thread 1 in semaphore ends");
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                semaphore.release();
            }
        }).start();

        new Thread(() -> {
            try {
                semaphore.acquire();
                System.out.println("Task 2 is running");
                System.out.println("Thread 2 in semaphore ends");
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                semaphore.release();
            }
        }).start();
        System.out.println("semaphore ends");
    }


}
