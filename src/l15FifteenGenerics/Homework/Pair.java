package l15FifteenGenerics.Homework;

public class Pair {

    static int index = 0; // Index for First element
    static int index1 = 3; //Index for Second element


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
