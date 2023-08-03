package l04Fourth;

import java.util.Scanner;

/**
 *Створити програму для обробки символьних рядків:
 * Створити зміну типу String
 * Показати цю зміну у верхньому та нижньому регістрах
 * Показати першу та останню літери
 */

public class FourthHomeWork {
    public static void main(String[] args) {

        String test = "Raw For homeWork";
        System.out.println(test.length());
        System.out.println(test.toUpperCase());
        System.out.println(test.toLowerCase());
        System.out.println(test.charAt(0));
        System.out.println(test.charAt(test.length()-1));

        /*
        Додатково виткористав метод Scanner для обробки рядка, який вводить користувач
         */

        Scanner myObj = new Scanner(System.in);
        System.out.println("Напишіть стрічку для обробки");

        String someScanner = myObj.nextLine();
        System.out.println("Довжина рядка = "+ someScanner.length());
        System.out.println("Рядок прописом = "+ someScanner.toUpperCase());
        System.out.println("Рядок в нижньому регістрі  = "+ someScanner.toLowerCase());
        System.out.println("Перша літера рядка = "+ someScanner.charAt(0));
        System.out.println("Остання літера рядка" + someScanner.charAt(test.length()-1));



    }
}