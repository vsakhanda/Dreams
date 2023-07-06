package Fifth;

import java.util.Scanner;


//Створити 3 програми:
//програму для знаходження більшого з двох чисел +
//програму для знаходження меншого з двох чисел +
//програму для перевірка заданого числа на парність
public class FifthHomeWork {
    public static void main(String[] args) {

        CompaireBigger(4, 7); //програму для знаходження більшого з двох чисел
        CompaireSmoller(4,8); //програму для знаходження меншого з двох чисел
        parityScanner(); //програму для перевірка заданого числа на парність з використанням сканеру та виклику методу перевіпкм на парність
    }
    // Програма визначає яке з двох чисел більше
    public static void CompaireBigger(int q, int f) {
        System.out.println("Compairing for bigger method starts");
        if (q <= f) {
            System.out.println(f + " bigger then " + q);
        } else {
            System.out.println(q + " bigger then" + f);
        }
        System.out.println("Compairing bigger method ends");
    }
    // Програма визначає яке з двох чисел є меншим
    public static void CompaireSmoller(int q, int f) {
        System.out.println("Compairing for smaller method starts");
        if (q >= f) {
            System.out.println(f + " smaller then " + q);
        } else {
            System.out.println(q + " smaller then " + f);
        }
        System.out.println("Compairing smaller method ends");
    }
    //Метод аналізу з використання else
    public static void parity(int q) {
        System.out.println("Початок перевірки на парність");
        if (q%2 == 0) {
            System.out.println(q + " Число парне");
        } else {
            System.out.println(q + " Число не парне");
        }
        System.out.println("Завершення перевірки на парність");
    }
    public static void parityScanner()
    {
        Scanner parityScanner = new Scanner(System.in);
        System.out.println("Введіть число для перевірки на парність");
        int q = Integer.parseInt(parityScanner.next());
        System.out.println ("Ваше число " + q);
        parity(q);
    }
}
