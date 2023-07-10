package Twelve_OOP_3.StaticFields;

public class Test {

    static int staticVariable = initialize();

    static int result = 19;

    private static int initialize() {
        System.out.println("Створений статичний метод викликання");
        return 0;
    }

    static {
        System.out.println("Статичний блок виконання");
    }


    public static void staticMethod() {
        System.out.println("Створений статичний метод викликання");
    }
}
