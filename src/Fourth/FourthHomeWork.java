package Fourth;
/**
 *Створити програму для обробки символьних рядків:
 * Створити зміну типу String
 * Показати цю зміну у верхньому та нижньому регістрах
 * Показати першу та останню літери
 */

public class FourthHomeWork {
    public static void main(String[] args) {

        String test = "Raw For Fome work";
        System.out.println(test.length());
        System.out.println(test.toUpperCase());
        System.out.println(test.toLowerCase());
        System.out.println(test.charAt(0));
        System.out.println(test.charAt(test.length()-1));


    }
}