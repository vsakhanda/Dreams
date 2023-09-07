package l29Threads1;

    public class MyThread extends Thread{
        private final int threadCount;

        public MyThread(int threadCount) {
            this.threadCount = threadCount;
        }


        // Оверайдимо за нашим бажанням метод run()
        @Override
        public void run() {
            System.out.println("Потік запущено " + threadCount);
        }


    }
