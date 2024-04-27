package l24Exceptions.homeWork;

/*1.   - Запросити з консолі число і огорнути цей функціонал у блоки обробки винятків. Try-Catch + Scanner
        - При вводі замість числа букв - показувати повідомлення про помилку на консоль. exception
        - За допомогою нескінченного циклу - запитувати число з консолі - поки не отримаємо його без помилок while

        2. Створити виняток який викидається коли число менше нуля. Scanner
        Створити функцію, яка приймає число і повертає його квадрат. Якщо число буде менше нуля - то викинути створений виняток.  Try-Catch Exception  */


import java.util.Scanner;

public class homeWork24 {

    public static void main(String[] args) {

        System.out.println("Виберіть метод для перевірки 1 , 2, чи 3 ");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        switch (a) {
            case 1 -> taskOne.firstException();
            case 2 -> taskTwo.secondException();
            case 3 -> taskTwoAlternative.twoAlternative();
            default -> {
                System.out.println("Не вірне значення, спробуйте ще");
                scanner.nextLine();
            }
        }
        scanner.close();


    }
}

