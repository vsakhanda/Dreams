package l30Threads2.homeWork30;
/*

Створити поток який генерує числа від 1 до 10 і нескінченно їх виводить на консоль. Якщо згенероване число == 5 - то перервати роботу потоку
Створити callable поток, який повертає випадково згенероване число від 1 до 50. Зробити пул с 10 потоків для виклику цього методу.

*/

public class homework30 {


    public static void main(String[] args) {
        // First - потік з числами до моменту коли число ==5ю

        // new randomNumber();

        int a=5;
        homework30 myWork = new homework30();
        int Sum = first(a);
        System.out.printf("\nthe sum is :%d " , Sum);
        // Second
    }


    public static int first(int a) {
        a = 5;
        int i = 1;
        while (i <= a)
        {
            a += i;
            System.out.println("count:" + a);
            i = i++;
        }
        return a;
    }

//        int i = 0;
//        while (i < 7)
//        {
//            counter1(i);
//            System.out.println(i);
//        }


//        int stopnumber = 5;
//        MultiThreadRunnable myThing = new MultiThreadRunnable();
//        Thread myThread = new Thread(myThing);
//




//        myThread.start();

    private static void counter1(int i) {
        int j = i+1;
    }

//    Thread th = new Thread(() -> {
//        while(true)
//        {
//            //some operation
//        }
//    });
//th.start();
//
//if(condition)
//            th.restart();



    public static void second() {

    }



}
