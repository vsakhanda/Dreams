package l24Exceptions.homeWork;

/*1.   - Запросити з консолі число і огорнути цей функціонал у блоки обробки винятків. Try-Catch + Scanner
        - При вводі замість числа букв - показувати повідомлення про помилку на консоль. exception
        - За допомогою нескінченного циклу - запитувати число з консолі - поки не отримаємо його без помилок while

        2. Створити виняток який викидається коли число менше нуля. Scanner
        Створити функцію, яка приймає число і повертає його квадрат. Якщо число буде менше нуля - то викинути створений виняток.  Try-Catch Exception  */

import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class homeWork24 {

    public static void main(String[] args) {

        firstException();
//       secondException();
//        second();


    }

    public static void firstException() {
        System.out.println("Внесіть число : ");
        Scanner scanner = new Scanner(System.in);
        try {
            int a = scanner.nextInt();
            System.out.println("Ваше число : " + a);
        } catch (ArithmeticException e) {// exception description
            System.out.println("ділення на нуль"); // exception method
        } catch (NullPointerException npe) {// exception description
            System.out.println("null argument " + npe); // exception method
        } catch (InputMismatchException ime) {// exception description
            System.out.println("не коректне значення" + e); // exception method
            scanner.nextInt();
        }
    }


    public static void secondException() {
        System.out.println("SecondException Внесіть число для привведення його в степінь : ");
        try (Scanner scanner = new Scanner(System.in)) {
            int secondEx = scanner.nextInt();
            System.out.println(secondEx*secondEx);
        } catch (ArithmeticException e) {// exception description
            System.out.println("ділення на нуль"); // exception method
        } catch (NullPointerException npe) {// exception description
            System.out.println("null argument " + npe); // exception method
        } catch (NoSuchElementException nsee) {// exception description
            System.out.println("не коректне значення " + nsee);
        }
        System.out.println("SecondException. Завершення методу ");
    }


    // Через цикл if else
    public static void second() {


        while (true) {
            System.out.println("Внесіть число для привведення його в степінь : ");
            Scanner scanner = new Scanner(System.in);
            int b = scanner.nextInt();
            if (b >= 0) {
                int result = b * b;
                System.out.println(result);
                scanner.close();
                break;
            } else {
                System.out.println(" Необхідено ввести значення більше 0 ");
            }
        }
    }


    public static int scannerHomework(int a){
        Scanner scanner = new Scanner(System.in);
        scanner.nextInt();
        return a;
    }
}

