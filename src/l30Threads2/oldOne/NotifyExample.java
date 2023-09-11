package l30Threads2.oldOne;

//notify() пробуджує один потік, який очікує на моніторі об'єкта,
// а notifyAll() пробуджує всі такі потоки
//     wait();
//     notify();

public class NotifyExample {

private static final Object lock = new Object();

public static void main(String[] args) {

    Thread waitingThread = new Thread(() -> {
        synchronized (lock) {
            try {
                System.out.println("Waiting...");
                lock.wait();
                System.out.println("Resumed");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    });

    Thread notifyingThread = new Thread(() -> {
        synchronized (lock) {
            lock.notify();
            System.out.println("Notified");
        }
    });

    waitingThread.start();
    notifyingThread.start();
}
}


/*
    waitingThread:

    NEW: Створено, але ще не запущено.
    RUNNABLE: Запущено і виконується. При цьому воно входить в синхронізований блок і отримує блокування об'єкта lock.
    WAITING: Після виклику lock.wait(), потік переходить в стан очікування і відпускає блокування об'єкта lock.
    BLOCKED: Після того, як notifyingThread викликає lock.notify(), waitingThread пробуджується і переходить в стан BLOCKED,
     оскільки він чекає, поки notifyingThread відпустить блокування об'єкта lock.
    RUNNABLE: Після того, як notifyingThread виходить з синхронізованого блоку, waitingThread знову отримує блокування lock і продовжує виконання.
    TERMINATED: Після завершення виконання коду в run().
    notifyingThread:

    NEW: Створено, але ще не запущено.
    RUNNABLE: Запущено і виконується. Після того, як waitingThread відпустив блокування об'єкта через wait(),
    notifyingThread входить в синхронізований блок і отримує блокування об'єкта lock.
    RUNNABLE: Після виклику lock.notify(), продовжує виконання в синхронізованому блоку.
    TERMINATED: Після завершення виконання коду в run().
     */