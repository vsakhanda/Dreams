package l24Exceptions.homeWork;

import java.util.Scanner;

public class taskTwoAlternative {
    public static void twoAlternative() {
        System.out.println("Альтернативний метод розпочато");
        while (true) {
            System.out.println("Внесіть число для привведення його в степінь : ");
            Scanner scanner3 = new Scanner(System.in);
            int b = scanner3.nextInt();
            if (b >= 0) {
                int result = b * b;
                scanner3.nextLine();
                System.out.println( "Степінь числа " + b + " = " +  result);
                break;
            } else {
                System.out.println(" Необхідено ввести значення більше 0 ");
                scanner3.nextLine();
            }
        }
        System.out.println("Метод 3 завершено");

    }
}
