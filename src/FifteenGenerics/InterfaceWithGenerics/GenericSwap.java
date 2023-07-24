package FifteenGenerics.InterfaceWithGenerics;

public class GenericSwap<T> {

    public static <T> void swap(T [] array, int index1, int index2){
//validation
        if((index1< 0 || index1 >= array.length)||(index2 <0 || index2 >= array.length)){
            System.out.println("wrong index");
        } else {
            T temp = array[index1];
            array[index1] = array[index2];
            array[index2] = temp;
        }
        printArray(array);
    }

    public static <T> void printArray(T [] array){
        for (T element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }


}
