package l30Threads2.NewThread.atomic;

/*
Atomic змінні в Java представляють собою класи,
які підтримують атомарні операції на змінних/об'єктах без необхідності використання synchronized або Lock.
Ці змінні використовують атомарні операції, надані апаратним рівнем (часто за допомогою CAS - compare-and-swap).
 */


import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

public class AtomicLecture {

    private static final AtomicInteger counter = new AtomicInteger(2);
    private static AtomicReference<String> atomicReference =new AtomicReference<>();

    public static void main(String[] args) throws InterruptedException{
        atomicInteger();
        atomicReference();

    }

    private static void atomicInteger() throws InterruptedException {
        Thread t1 = new Thread(() -> {
            for (int i = 0; i< 1000; i++) {
                counter.incrementAndGet();
            }
        });
        Thread t2 = new Thread(() -> {
           for (int i =0; i<1000; i++) {
               counter.incrementAndGet();
           }
        });

        t1.start();
        t2.start();
        t1.join();
        t2.join();

        System.out.println("Final counter value: " + counter.get());

    }
    private static void atomicReference() throws InterruptedException {
        Thread t1 = new Thread(() -> {
            String previousValue = atomicReference.getAndSet("New value 1");  // атомарно отримує поточне значення і встановлює нове
            System.out.println(previousValue);
        });

        Thread t2 = new Thread(() -> {
            String previousValue = atomicReference.getAndSet("New value 2");  // атомарно отримує поточне значення і встановлює нове
            System.out.println(previousValue);
        });

        t1.start();
        t2.start();
        t1.join();
        t2.join();

        System.out.println("Final counter value: " + counter.get());
    }





}
