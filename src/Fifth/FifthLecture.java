package Fifth;

public class FifthLecture {

    public static void main(String[] agrs) {

      //  ifMethod(5); // Відображає середній рядок в методі
      //  ifMethod(-5); // Не буде відображатись середній рядок в методі
      //  ifElseMethod( 3); // проходить через першу частину коду
      //  ifElseMethod(-2); // проходить через частину коду else
//        ifElseTimes(2);
//        ifElseTimes(0);
//        ifElseTimes(-3);
//
//        switchMetod(0);
//        switchMetod(3);
//        switchMetod(100);

        trenaryOperator( 1);
        trenaryOperator(10);




    }

    // ifelse method
// метод перевіряє на виконання певної умови в коді. в той час код виконується повністю.
// якщо у в методі буде визначено i більше нуля, то рядок виводиться, в іншому випадку центральний рядок не виводиться
    private static void ifMethod(int i){

        System.out.println("if method starts");
        if (i > 0) {
            System.out.println( "i =" + i + " is positive"); // Тіло методу - виділяти дужками
        }
        System.out.println("if method ends");

    }
// Виконується умова в тілі метода, після чого продовжується робота коду
    private static void ifElseMethod(int i) {
        System.out.println("ifElse method starts");
        if (i > 0) {
            System.out.println( "i = " + i + " is positive" );
        } else {
            System.out.println( "i = " + i + " i negative" );
        }
        System.out.println("ifElse method ends");


    }

    private static void ifElseTimes(int i) {
        System.out.println("ifElseTimes method starts");
        if (i > 0 ){
            System.out.println("i = " + i + " first condition. positive I");
        } else if (i == 0){
            System.out.println("i =" + i +  " is ZERO");
        } else {
            System.out.println("i =" + i + " is negative");
        }
        System.out.println("code after statement");
        System.out.println("ifElseTimes method ends");

    }


    private static void switchMetod(int i) {
        System.out.println("Switch method is start");
        switch (i) {
            case 0 :
                System.out.println("case 0");
                break;
            case 1 :
                System.out.println("case 1");
                break;
            case 2 :
                System.out.println("case 2");
                break;
            case 3 :
                System.out.println("case 3");
                break;
            case 4 :
                System.out.println("case 4");
                break;
            default:
                System.out.println("undefined");
                break;
        }
        System.out.println("Swith method ends");
    }

    private static void trenaryOperator(int i) {
        System.out.println(i > 3 ? "=true": "= false");
        System.out.println("ternary operation method ends");
    }

}
