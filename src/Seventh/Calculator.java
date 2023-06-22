package Seventh;

/*
Структура програми:
1. Методи введення даних
    Числа +
    Функція +
2. Методи розрахунку (+, -, *, /) +
 */


import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        Scanner epxScanner = new Scanner(System.in);
        System.out.println("Введіть враз для розрахунку (без пробілів) приклад: 2*3. Допустимі функції (+, -, *, /)");
        String exps = epxScanner.nextLine();
        System.out.println("Вираз для розрахунку " + exps);





    }






}
/*
        Scanner calcScanner = new Scanner(System.in);
        System.out.println("Введіть перше число для розрахунку");
        int a = calcScanner.nextInt();
        System.out.println("Введіть друге число для розрахунку");
        int b = calcScanner.nextInt();
        System.out.println("Введіть функцію для розрахунку (+, -, *, /)");
        char function = calcScanner.next().charAt(0);
        System.out.println ("Ваші числа " + a + " та "+ b+ " необхідна дія " + function );


        double result;
        result = operation(function, a, b);
        System.out.println ("Вираз для розрахунку " + a + " "+ function + " " + b + " = " + result);
    }


    private static double operation(char function, double a, double b) {
        return switch (function) {
            case '+' -> add(a, b);
            case '-' -> minus(a, b);
            case '*' -> multiply(a, b);
            case '/' -> divide(a, b);
            default -> throw new RuntimeException("Wrong operator");
        };
    }
    public static double add(double a, double b) {
        return a + b;
    }

    public static double minus(double a, double b) {
        return a - b;
    }

    public static double multiply(double a, double b) {
        return a * b;
    }

    public static double divide(double a, double b) {
        return a / b;
    }

}




 */

