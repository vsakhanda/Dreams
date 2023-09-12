package l31PracticeThread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;

public class poolTask {

            /*
        1 ExecutorService / Semaphore
        Припустимо, у нас є басейн із обмеженою кількістю ліжок (наприклад, 3), і клієнти приходять, щоб взяти ліжка для відпочинку.
        Ми хочемо забезпечити, щоб одночасно було доступно обмежене число ліжок, а інші клієнти повинні чекати, поки ліжка звільняться.
         */

    private static final int BEDS_COUNT = 3;
    private static final int CLIENTS_COUNT = 6;

    private static final Semaphore semaphore = new Semaphore(BEDS_COUNT);
    private static final ExecutorService executor = Executors.newFixedThreadPool(CLIENTS_COUNT);

    public static void main(String[] args) {
        for (int i = 1; i <= CLIENTS_COUNT; i++) {
            executor.submit(new Client(i));
        }

        executor.shutdown();
    }
    static class Client implements Runnable {

        private final int id;

        public Client(int id) {
            this.id = id;
        }

        @Override
        public void run() {
            System.out.println("Client " + id + " is waiting for bed");
            try {
                semaphore.acquire(); // клієнт чекає для доступного ліжка
                System.out.println("Client " + id + " has taken a bed");

                Thread.sleep(5000);

                System.out.println("Client " + id + " has left the bed.");

                semaphore.release(); // звільняє ліжко і йде додому
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

