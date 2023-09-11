package l30Threads2.NewThread.sync;


import java.util.concurrent.CountDownLatch;

/*
Ці утиліти допомагають координувати роботу між потоками,
коли проста синхронізація за допомогою synchronized або volatile не є достатньою.
 */
public class SyncLecture {

    public static void main(String[] args) {
        countDownLatch();
    }

    private static void countDownLatch() {
        CountDownLatch latch = new CountDownLatch(2);

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
    }

}
