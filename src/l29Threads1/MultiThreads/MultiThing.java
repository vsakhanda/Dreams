package l29Threads1.MultiThreads;

public class MultiThing extends Thread {


    private final int threadNumber;
    public MultiThing (int threadNumber){
        this.threadNumber = threadNumber;
    };
    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(i + " from thread " + threadNumber + " Extends Thread!");
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
