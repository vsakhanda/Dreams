package l30Threads2.homeWork30;
/*

Створити поток який генерує числа від 1 до 10 і нескінченно їх виводить на консоль. Якщо згенероване число == 5 - то перервати роботу потоку
Створити callable поток, який повертає випадково згенероване число від 1 до 50. Зробити пул с 10 потоків для виклику цього методу.

*/

import java.util.Random;

public class homework30 {
    private final static int range = 10;

    public static void main(String[] args) {

        Random random;
        while (true) {
            random = new Random();
            int number = random.nextInt(range);
            System.out.println("Number = " + number);
        } while (5 == random.nextInt());
    }







}





        /*





        // First - потік з числами до моменту коли число ==5ю

     //   Thread1 th1 = new Thread1();
        Thread2 th2 = new Thread2();

    //    Thread t1 = new Thread(th1);
        Thread t2 = new Thread(th2);

//        t1.start();
//        t1.interrupt(); // Calling stop() method to kill runnable thread.
        t2.start();
    }

  *//*  public static class Thread1 implements Runnable
    {
        public void run()
        {
            System.out.println("First child thread");
        }
    }*//*
    public static class Thread2 implements Runnable
    {
        static Thread t2;
        public void run()
        {
            for(int i = 0; i <= 10; i ++)

            {
                System.out.println("Second child thread: " +i);
                if(i==5){
                    t2.stop();
                }
                     // Calling stop() method to kill running thread.
            }

        }}

}

*/