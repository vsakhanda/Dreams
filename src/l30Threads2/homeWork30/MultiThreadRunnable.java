package l30Threads2.homeWork30;

import static l30Threads2.homeWork30.randomNumber.randomThreadNumber;

public class MultiThreadRunnable implements Runnable {
    @Override
    public void run() {

        try {
            randomThreadNumber();
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
//        for (int i = 1; i <= 5; i++) {
//            System.out.println(i + " from thread ");
////            if (threadNumber == 3) {
////                throw new RuntimeException();
////            }

        }
    }