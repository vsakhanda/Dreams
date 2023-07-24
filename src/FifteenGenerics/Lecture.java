package FifteenGenerics;

// Generic
// https://docs.oracle.com/javase/tutorial/java/generics/types.html

public class Lecture <E> {

    public static void main(String[] args) {
        Box box = new Box();
//        box.setItem("3333");
//        System.out.println(box.getItem());
//        box.setItem(213);
//        System.out.println(box.getItem());
//        int mass[] ={1,2,33};
//        box.setItem(mass);
//        System.out.println(box.getItem());
//        Human human = new Human("Odyssey", 23);
//        box.setItem(human);
//        System.out.println(box.getItem());
        box.setKey("11");
        box.setValue(123);
        System.out.println(box.getKey() + "   " + box.getValue());

        Integer[] intArray = {1,2,3,4,5,6};
        String[] strArray = {"a","b","c","d"};
        Human [] humanArray = {new Human("Odin", 1), new Human("Thor", 2)};

    printArray(intArray);
    printArray(strArray);
    printArray(humanArray);

    NumericBox<Integer> intBox = new NumericBox<>(10);
  //  NumericBox<String> intBox2 = new NumericBox<>("10");


    }
// Генерічний метод
        private static <E> void printArray(E [] array){
            for (E element : array) {
                System.out.println(element + " ");
            }
            System.out.println();
        }
}
