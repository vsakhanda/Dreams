package Eight;

//  1. Створити програму в якій потрібно створити масив з 10 елементів та заповнити його випадковими числами
//  2. Вивести його на консоль
//  3.   Знайти мінімальне значення
//  4.   Знайти максимальне значення
//  5.    Знайти середнє значення
//  6.    Знайти суму всіх елементів


import java.util.Arrays;
import java.util.Random;


public class EightHomework {

    private final static int range = 100;

    public static void main(String[] args) {
        int[] homeWork = new int[10];
    System.out.println(homeWork.length);

        Random random = new Random();
        for (int i=0; i<10; i++){

            homeWork[i] = random.nextInt(range);
        }
        System.out.println(Arrays.toString(homeWork));
        Arrays.sort(homeWork);
        System.out.println(Arrays.toString(homeWork)); //Сортування від найменщого до найбільшого

        int min =homeWork[0];
        for (int i = 0; i < homeWork.length; i++) {
            //Compare elements of array with min
            if(homeWork[i] <min)
                min = homeWork[i];
        }
        System.out.println("3. Min = " + min);

        int max =homeWork[0];
        for (int i = 0; i < homeWork.length; i++) {
            //Compare elements of array with max
            if(homeWork[i] >max)
                max = homeWork[i];
        }
        System.out.println("4. Max = " + max);

        int sum = homeWork[0];
        //Loop through the array
        for (int i = 0; i < homeWork.length; i++) {
                sum = sum + homeWork[i];
        }
        System.out.println("5. Середнє значення = " + sum/homeWork.length);
        System.out.println("6. Сума значень = " + sum);
    }
}