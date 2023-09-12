package l30Threads2.NewThread.ThreadLocal;

public class ThreadLocalLecture {

    private static ThreadLocal<String> threadLocal = ThreadLocal.withInitial(() -> "Initial value");


    public static void main(String[] args) {
        new Thread(() -> {
           threadLocal.set("Thread 1 value");
           printThreadValue();
        }).start();

        new Thread(() -> {
            threadLocal.set("Thread 2 value");
            printThreadValue();
        }).start();

        printThreadValue();

    }

    private static void printThreadValue() {
        System.out.println(Thread.currentThread().getName() + ": " + threadLocal.get());
    }

}
