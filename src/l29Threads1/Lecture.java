package l29Threads1;

public class Lecture {

    public static void main(String[] args){

       MyThread thread1 = new MyThread(1);
       MyThread thread2 = new MyThread(2);

        runThreads(thread1, thread2);

    }


    private static void runThreads(Thread ... threads) {
        for(Thread thread : threads) {
            thread.start();
        }
    }

}


