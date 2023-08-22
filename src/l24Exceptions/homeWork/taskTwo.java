package l24Exceptions.homeWork;

import java.util.Scanner;

public class taskTwo {

    public static void secondException() {
        System.out.println("SecondException Внесіть число для привведення його в степінь : ");
        try (Scanner scanner2 = new Scanner(System.in)) {
            int secondEx = scanner2.nextInt();
            if (secondEx >= 0) {
                System.out.println("Степінь числа " + secondEx + " = " + secondEx*secondEx);
                scanner2.close();}
            else {
                throw new belowZeroException("Значення повинно бути більше 0", 401);
            }
        } catch (belowZeroException e) {// exception description
            System.out.println("Обмеження відпрацювало " + e);;// exception method
        }
        System.out.println("SecondException. Завершення методу ");
    }

}
