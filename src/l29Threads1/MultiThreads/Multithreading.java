package l29Threads1.MultiThreads;

public class Multithreading {

    public static void main(String[] agrs) {

        for (int i = 0; i <=3; i++){
            MultiThing myThing = new MultiThing(i);
            myThing.start();
        }

        for (int i = 0; i <=3; i++){
            MultiThingIntr myThing = new MultiThingIntr(i);
            Thread myThread = new Thread(myThing);
            myThread.start();
//            try {
//                myThread.join();
//            } catch (InterruptedException ignored){}
        }


    }
}
