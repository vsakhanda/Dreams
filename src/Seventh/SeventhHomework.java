package Seventh;

/*
Створити метод який повертає куб заданого числа
Метод повинен вивести зірочку стільки разів, скільки передав користувач у метод
Метод повинен вивести переданий символ стільки разів, скільки передав користувач у метод
*/


import java.util.Scanner;

public class SeventhHomework {


    public static void main(String[] args) {

 //       cube();
 //       star();
        symbols();
    }

    private static void cube() {

        System.out.println("Приведення до степеня");
        int p = 3;
        Scanner parityScanner = new Scanner(System.in);
        System.out.println("Введіть Ваше число приведення в степінь 3");
        int q = Integer.parseInt(parityScanner.next());
        System.out.println ("Ваше число " + q);
        System.out.println("Число "+ q + " в степені "+  p + " дорівнює = " + (Math.pow(q, p)) );
        System.out.println("Завершення розрахунку");
    }
private static void star() {

        System.out.println("Метод відобрежання зірочок");
        Scanner starScanner = new Scanner(System.in);
        System.out.println("Введіть кількість зірочок для відображення");
        int q = Integer.parseInt(starScanner.next());
        System.out.println ("Ваше число " + q);
        int i = 1;
        for(i =1; i<=q; i++) {
            System.out.println("*");
        }
        System.out.println("  " +
                "Всі зірочки виведені");
    }
private static void symbols() {

        System.out.println("Метод виводить переданий символ стільки разів скільки передав користувач");
        Scanner quantity = new Scanner(System.in);
        System.out.println("Введіть кількість кількість символів для відображення");
        int q = Integer.parseInt(quantity.next());
        System.out.println ("Ваше число " + q);
        Scanner symbol = new Scanner(System.in);
        System.out.println("Введіть символ для відображення");
        String s = symbol.nextLine();
        System.out.println ("Ваш символ " + s);
        int i = 1;
             for(i =1; i<=q; i++) {
                 System.out.println(s);
    }
        System.out.print("_" +
                "Відображення завершено");
    }
}






