package Fourth;

import java.util.Scanner;

public class FourthLecture {
        public static void main(String[] args)    {
            FourthLecture fourthLecture = new FourthLecture();
            int a = 7;
            int b = 8;
            int result = fourthLecture.sum(a, b);
            int StaticSum = fourthLecture.StaticSum(a,b);
          System.out.println(result);
          System.out.println(StaticSum);

          String name = "Vladyslav";
          String secondName = "Vlad";
          System.out.println(name + " " + secondName );

        String test = "test";
        System.out.println(test.length());
        System.out.println(test.concat("Upper").concat("ElevenOOP_2"));
        System.out.println(test.toUpperCase());

/*
Метод створений для введеня тексту та його обробки

 */

            Scanner myObj = new Scanner(System.in);
            System.out.println("Enter стрічку для обробки");

            String someScanner = myObj.nextLine();
            System.out.println("Довжина рядка = "+ someScanner.length());
            System.out.println("Рядок прописом = "+ someScanner.toUpperCase());
            System.out.println("Рядок в нижньому регістрі  = "+ someScanner.toLowerCase());
            System.out.println("Перша літера рядка = "+ someScanner.charAt(0));
            System.out.println("Остання літера рядка" + someScanner.charAt(test.length()-1));




        }
    private int sum(int a, int b) {
        return a+b;
    }

    private int StaticSum(int a, int b) {
        return a*b;
    }


}
