package Fourth;

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
        System.out.println(test.concat("Upper").concat("Eleven"));
        System.out.println(test.toUpperCase());
        }
    private int sum(int a, int b) {
        return a+b;
    }

    private int StaticSum(int a, int b) {
        return a*b;
    }


}
