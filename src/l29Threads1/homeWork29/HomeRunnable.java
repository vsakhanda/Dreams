package l29Threads1.homeWork29;

public class HomeRunnable implements Runnable {

        private final int runnableCount;

        public HomeRunnable(int runnableCount) {
            this.runnableCount = runnableCount;
        }
        @Override
        public void run() {
            System.out.println("Потік Runnable запущено " + runnableCount);
        }

}
