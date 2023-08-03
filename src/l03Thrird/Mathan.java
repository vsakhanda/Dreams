package l03Thrird;
// Перевірка функції Math


public class Mathan {
    public static void main(String[] args){
        double num = 1.001f;
        double num1 = 0.999f;
        num = Math.pow(num, 365);
        num1 = Math.pow(num1, 365);
//        int result = (int) Math.ceil(num);
//        int result1 = (int) Math.ceil(num1);
        System.out.println("Значення 1.001 в степені 365 " + num);
        System.out.println("Значення 0.999 в степені 365 " + num1);

    }

}
