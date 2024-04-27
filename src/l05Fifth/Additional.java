package l05Fifth;

public class Additional {



    private static String method1() {
        String test = "test";
        return test;
    }

    private static void method2() {
        System.out.println(method1()+method1() );
    }

    public static void main(String[] args) {

        method2();

    }

}
