package Sixth;


// for
// while
// do while


public class SixLecture {

    public static void main(String[] args) {
        // Cycles
        System.out.println("for cycle");
        for (int i = 0; i <= 10; i++) {
            System.out.println(i);
            forCycle();
        }
        {
            System.out.println("while cycle");
            int i = 0;
            while (i <= 101) {
                System.out.println(i);
                i+=11;
            }
        {
            System.out.println("do while while");
            int j = 0;
            do {
            System.out.println(j);
                j++;
            } while (j <= 10);
        }
        }
    }

    public static void forCycle() {
        System.out.println("Show me the meaning");
    }
}