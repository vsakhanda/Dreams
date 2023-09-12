package l30Threads2.NewThread.locks;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Locklecture {

    private final Lock lock = new ReentrantLock();
    private final Object lockObj = new Object();
    public static void main(String[] args) {
        Locklecture example = new Locklecture();

        Thread t1 = new Thread(example::doWork);
        Thread t2 = new Thread(example::doWork);

        t1.start();
        t2.start();
    }

    /*
  Відмінності від synchronized:

  Гнучкість: Lock дозволяє отримати більш гнучке блокування (наприклад, можливість переривання блокувань,
   спроба захоплення блокування протягом певного часу тощо).

  Ручне керування: З Lock вам потрібно вручну захоплювати та відпускати блокування,
   що збільшує ризик помилок (забути відпустити блокування), але надає більше контролю.

    synchronized, блокування захоплюється автоматично при вході в блок або метод і відпускається при виході.

    ReentrantLock ви можете використовувати Condition (ConditionLockExample) для більш гнучкої умовної синхронізації.
      З synchronized ви маєте обмежені можливості, такі як wait(), notify() та notifyAll().
   */
    private void doWork() {
        lock.lock();  // Захоплення блокування
        try {
            // Критичний розділ коду
            System.out.println("Critical section is executed by " + Thread.currentThread().getName());
        } finally {
            lock.unlock();  // Обов'язкове відпускання блокування в блоку finally
        }
    }

    /*
    Обидва підходи забезпечують взаємне виключення для критичного розділу коду. Вибір між ними залежить від конкретних потреб вашого застосунку.
     */
    private void doWorkSycn() {
        synchronized(lockObj) {
            System.out.println("Critical section is executed by " + Thread.currentThread().getName());
        }
    }
}
