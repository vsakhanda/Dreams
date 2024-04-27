package l29Threads1.homeWork29;

public class HomeThreads extends Thread {
    private final int threadCount;

    public HomeThreads(int threadCount) {
        this.threadCount = threadCount;
    }


    // Оверайдимо за нашим бажанням метод run()
    @Override
    public void run() {
        System.out.println("Домашній потік запущено " + threadCount);
    }
}
