package l30Threads2.NewThread.locks;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ConditionLockExample {


    private final Lock lock = new ReentrantLock();
    private final Condition condition = lock.newCondition();

    private boolean flag = false;

    public static void main(String[] args) {
        ConditionLockExample example = new ConditionLockExample();

        Thread waitingThread = new Thread(() -> {
            try {
                example.waitForFlag();
        } catch (InterruptedException e) {
                e.printStackTrace();
        }
        });
        Thread signalingThread = new Thread(example::setFlagTrue);
        waitingThread.start();
        signalingThread.start();
    }


    private void waitForFlag() throws InterruptedException {
        lock.lock();
        try {
            while (!flag) {
                condition.await();
            }
            System.out.println("Flag is true!");
        } finally {
            lock.unlock();
        }
    }

    private void setFlagTrue() {
        lock.lock();
        try {
            flag = true;
            condition.signalAll();  // Повідомляємо всім чекаючим потокам, що flag змінився
        } finally {
            lock.unlock();
        }
    }

}

