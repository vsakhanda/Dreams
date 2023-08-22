package l24Exceptions.homeWork;

import java.util.InputMismatchException;
import java.util.Scanner;

public class taskOne {

    public static void firstException() {
        System.out.println("Внесіть число, яке буде використовуватись в усіх завданнях : ");
        Scanner scanner1 = new Scanner(System.in);
        int a = scanner1.nextInt();
        // Перша задача з Exception
        try {
            System.out.println("Ваше число : " + a);
        } catch (ArithmeticException e) {// exception description
            System.out.println("ділення на нуль"); // exception method
        } catch (NullPointerException npe) {// exception description
            System.out.println("null argument " + npe); // exception method
        } catch (InputMismatchException ime) {// exception description
            System.out.println("не коректне значення" + ime); // exception method
            scanner1.nextLine();
        } finally {
            scanner1.close();
        }
        System.out.println("Перший метод завершено");
    }
}
