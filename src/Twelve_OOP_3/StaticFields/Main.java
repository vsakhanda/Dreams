package Twelve_OOP_3.StaticFields;

public class Main {

    public static void main(String[] args) {
        Test.staticMethod();
        Test.result = 20;

        System.out.println(Test.result);
    }

}
