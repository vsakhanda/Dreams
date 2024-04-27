package l29Threads1.homeWork29;

//Створити 2 потоки, які паралельно виводять на консоль числа від 1 до 10 та пишуть назву потоку

public class homeWork29 {

   //
    public static void main(String[] args) throws InterruptedException {

        Counter counter = new Counter();
        int countNumber = 5;
        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < countNumber; i++) {
                System.out.println("Thread 1 ");
                counter.increment();
               // System.out.println("Thread " + Thread.currentThread().getName() +" та " + " Значення: " + counter
             ;
            }
        });

        Thread thread2 = new Thread(() -> {
            for (int i = 0; i < countNumber; i++) {
                System.out.println("Thread 2 ");
                counter.increment();
            }
        });

        thread1.start();
        thread2.start();
    //    HomeThreads thread2 = new HomeThreads(2);
    //    runThreads(thread2);


        /*
           Методи join() в Java використовуються для затримки поточного потоку виконання до того моменту, коли потік,
           на якому було викликано метод join(), завершиться.

            В контексті вашого попереднього коду, thread1.join(); і thread2.join(); використовуються для того,
            щоб головний потік (той, який запустив thread1 і thread2) затримався і дочекався завершення виконання цих двох потоків, перш ніж вивести на екран поточне значення counter.

            Якщо ви приберете ці рядки з коду, то System.out.println("Final count: " + counter.getCount());
            може виконатися перед тим, як обидва потоки завершать своє виконання. У такому випадку, ви побачите значення count на даний момент,
             а не кінцеве значення після завершення всіх потоків.
         */
        thread1.join();
        thread2.join();
      /*  System.out.println("Element: " + counter.getCount() + " by " + counter.increment());

        System.out.println("Element: " + counter.getCount() + " by " +counter.increment());*/
        System.out.println("Final count: " + counter.getCount());

       // HomeThreads thread1 = new HomeThreads(1);
       // runThreads(thread2);

    }


    private static void runThreads(Thread ... threads) {
        for(Thread thread : threads) {
            thread.start();
        }
    }



}
