package l30Threads2.homeWork30;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.*;

/*

Створити поток який генерує числа від 1 до 10 і нескінченно їх виводить на консоль. Якщо згенероване число == 5 - то перервати роботу потоку
Створити callable поток, який повертає випадково згенероване число від 1 до 50. Зробити пул с 10 потоків для виклику цього методу.
*/
public class homework30 {

    private final static int range = 50;
    private final static int number = 5;


  public static void main(String[] args) throws InterruptedException, ExecutionException {

//      Створити поток який генерує числа від 1 до 10 і нескінченно їх виводить на консоль. Якщо згенероване число == 5 - то перервати роботу потоку

        System.out.println("Початок методу визначення випадкових числе через потоки");
        Thread thread1 = new Thread(() -> {
            int randomNumber = 0;
            while (true) {
                randomNumber = random();
                if(randomNumber == number) {
                    break;
                } else {
                    System.out.println("Випадкове значення: " + randomNumber);
                }
            }
            System.out.println("згенероване число == 5  Зупиняємо Thread.");
        });

        thread1.start();
//Створити callable поток, який повертає випадково згенероване число від 1 до 50. Зробити пул с 10 потоків для виклику цього методу.




        ExecutorService executorService = Executors.newFixedThreadPool(10);
        List<Callable<Integer>> callables= new ArrayList<>();

      System.out.println("****");
      System.out.println("callable потік");


        for (int i = 1; i<=10; i++) {
            callables.add(new ThreadCallable());
        }

        try {
            List<Future<Integer>> futures = executorService.invokeAll(callables);

            for (int i = 0; i < 10; i++) {
                Future<Integer> future = futures.get(i);
                System.out.println("Callable " + Thread.currentThread().getName() + " random number: " + future.get());
            }
        } finally {
            executorService.shutdown();
        }

    }

    private static int random () {
        Random random = new Random();
        int randomInt = random.nextInt(range);
        return randomInt;
    }

}

