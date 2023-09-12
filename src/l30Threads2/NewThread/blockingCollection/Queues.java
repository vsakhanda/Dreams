package l30Threads2.NewThread.blockingCollection;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.SynchronousQueue;

public class Queues {

    public static void main(String[] args) {
      //  blockQueue();
        syncQueue();
    }

    private static void blockQueue() {
        BlockingQueue<Integer> queue = new ArrayBlockingQueue<>(10);

        new Thread(() -> {
            try {
                for (int i = 0; i < 20; i++ ){
                    queue.put(i);
                    System.out.println("Produced:  " +  i);
                    Thread.sleep(1000);
                }
            } catch (InterruptedException e ) {
                e.printStackTrace();
            }

        }).start();

    }

    private static void syncQueue() {
        SynchronousQueue<Integer> queue = new SynchronousQueue<>();

        // Producer
        new Thread(() -> {
            try {
                for (int i = 0; i < 5; i++) {
                    queue.put(i);
                    System.out.println("Produced: " + i);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();

        // Consumer
        new Thread(() -> {
            try {
                for (int i = 0; i < 5; i++) {
                    int value = queue.take();
                    System.out.println("Consumed: " + value);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();
    }
}

