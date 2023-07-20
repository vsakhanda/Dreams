package Fifteen.Homework;

public class Pair<G> {

    static int index = 0; // First element
    static int index1 = 1; //Second element


    //
    public static <G> void getFirst(G [] array) {
        if (index < 0 || index >= array.length) {
            System.out.println("wrong index");
        } else {
            System.out.println("First element = " + array[index]);
        }
    }

    public static <G> void getSecond(G [] array){
            if(index1< 0 || index1 >= array.length){
                System.out.println("wrong index");
            } else {
                System.out.println("Second element = " + array[index1]);
            }
    }
}
