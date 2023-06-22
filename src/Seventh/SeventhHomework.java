package Seventh;

/*
1. Створити метод який повертає куб заданого числа
2. Метод повинен вивести зірочку стільки разів, скільки передав користувач у метод
3. Метод повинен вивести переданий символ стільки разів, скільки передав користувач у метод
*/


import java.util.Scanner;

public class SeventhHomework {


    public static void main(String[] args) {

        cube();
        star();
        symbols();

        System.out.println("Відображення зірочок а допомогою рекурсії Початок");
        StringBuilder name21 = new StringBuilder("*");
        starRecursion(name21);
        System.out.println(name21);
        System.out.println("Відображення зірочок а допомогою рекурсії Завершення");
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
    // Вирішення за допомогою циклів
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
        System.out.println("_" +
                "Всі зірочки виведені ");
    }

//Вирішення за допомогою рекурсії

    private static StringBuilder starRecursion(StringBuilder name21) {
        if (name21.length() < 100) {
            starRecursion(name21.append("*"));
        };
        return name21;
    }


private static void symbols() {

        System.out.println(" Метод виводить переданий символ стільки разів скільки передав користувач");
        Scanner quantity = new Scanner(System.in);
        System.out.println("Введіть кількість кількість символів для відображення");
        int q = Integer.parseInt(quantity.next());
        System.out.println ("Кількість знаків " + q);
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



