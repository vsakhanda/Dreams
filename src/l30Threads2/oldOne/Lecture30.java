package l30Threads2.oldOne;

public class Lecture30 {

    public static void main(String[] args) {

//        sleep();
//        tyield();
//        setPriority();
//
//        tdeamon();
//
//        exceptionHandler();
        threadJoin();

    }


    // sleep() - Призупинення потоку
    private static void sleep() {
        System.out.println("Start");
        try {
            Thread.sleep(1000);// Призупиняє потік на мілісекунди вказані в параметрі 1000 млс = 1 секунда.
        } catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("End");
    }


    // Thread.yeald() - можливість добровільно відмовитись від своїх ресурсів на користь інших потоків.

    public static void tyield() {
        Thread t1 = new Thread(() -> {
           for (int i = 0; i < 5; i++ ) {
               System.out.println("Thread 1 " + "_" +i );
              // Thread.yield(); // дає змогу іншим потокам виконуватися
               System.out.println("Thread 3 " + "_" +i);
           }
        });
        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
              System.out.println("Thread 2 " + "_" +i);
            //  Thread.yield(); // дає змогу іншим потокам виконуватися
              System.out.println("Thread 4 " + "_" + i );
            }
        });
        t1.start();
        t2.start();
    }

    // set priority -

    private static void setPriority() {
        Thread t1 = new Thread(() -> {
            System.out.println("Low priority Thread");
        });
        Thread t2 = new Thread(() -> {
            System.out.println("High priority Thread");
        });
        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.MAX_PRIORITY);

        t1.start();
        t2.start();

    }


    //deamon потоки -  дають можливість не завершувати свою роботу потоку, коли завершилась робота основного потоку.
    // Можливість роботи для фонових задач.


    public static void tdeamon() {
        Thread deamonThread = new Thread(() ->  {
            while(true) {
                try {
                    Thread.sleep(500);
                    System.out.println("Deamon Thread working");
                } catch (InterruptedException a) {
                    a.printStackTrace();
                }
            }
        });
        deamonThread.setDaemon(true); // Встановлює потік як deamon
        deamonThread.start();

        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Main Thread Ending");
    }


    // exceptionHandler

    private static void exceptionHandler() {
        Thread t1 = new Thread(() -> {
            throw new RuntimeException("Intentional Exception");
        });

        t1.setUncaughtExceptionHandler((thread, e) -> System.out.println(thread.getName() + " has thrown exception: " + e.getMessage()));

        t1.start();
    }

    // ThreadGroup - застарілий метод, що дозволяє групувати потоки

    // join - очікування завершення другого потоку

    private static void threadJoin() {
        Thread t1 = new Thread(() -> {
            System.out.println("Thread 1 started");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Thread 1 ended");
        });

        Thread t2 = new Thread(() -> {
            System.out.println("Thread 2 started");
            try {
                t1.join();  // Чекає, поки t1 завершить роботу
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Thread 2 ended");
        });

        t1.start();
        t2.start();
    }

    // планувальник потоів

}
