package l30Threads2.homeWork30;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class randomNumber {

    private final static int range = 5;

    public randomNumber(){
        Random random = new Random();
        int number = random.nextInt(range);
        System.out.println("Значення " + number);

    }


    public static void randomThreadNumber() throws InterruptedException {
        int randomN2 = ThreadLocalRandom.current().nextInt(range);
        System.out.println("Змінна: " +  randomN2 );
    }


}