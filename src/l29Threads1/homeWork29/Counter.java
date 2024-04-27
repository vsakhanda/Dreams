package l29Threads1.homeWork29;

public class Counter {

    private int count = 0;

/*
    public void increment() {
        count++;
    }
    */

    public synchronized void increment() {
        System.out.println("Значення: " + count++);
        //return 0;
    }
/*
    public void increment() {
        synchronized(this) {
            count++;
        }
    }*/

    public int getCount() {
        return count;
    }




}
