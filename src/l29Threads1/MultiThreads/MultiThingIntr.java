package l29Threads1.MultiThreads;

public class MultiThingIntr implements Runnable {


    private final int threadNumber;

    public MultiThingIntr(int threadNumber) {
        this.threadNumber = threadNumber;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(i + " from thread " + threadNumber + " Implements Runnable!");
//            if (threadNumber == 3) {
//                throw new RuntimeException();
//            }

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

}
