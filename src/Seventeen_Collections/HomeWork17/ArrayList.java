package Seventeen_Collections.HomeWork17;

public class ArrayList {

    public static void ArrayList(int numberOfElementsAL) {

        if (numberOfElementsAL<10000) {
            System.out.println("Array list begin");
            long startAdd = System.currentTimeMillis();
            java.util.ArrayList<Integer> numberArrayList = new java.util.ArrayList<>(); // New Array list initializing
            for (int i = 0; i <numberOfElementsAL;  i++) { // Add Cycle for adding new element to array
                numberArrayList.add(i); // Adding command
            }
            long endAdd = System.currentTimeMillis();
            System.out.println("arraylist adding elements" + " " + (endAdd - startAdd));
            long startGet = System.currentTimeMillis(); // відображення початку виконання операції
            for (int i = 0; i < numberArrayList.size(); i++) {
                numberArrayList.get(i);
            }

// Відображення парних числе в масиві Array list
            System.out.println("Парні елементи в Array List");
            for(int i=0; i<numberArrayList.size(); i++) {
                if(numberArrayList.get(i) % 2 == 0) {
                    System.out.println(numberArrayList.get(i));
                }
            }


            long endGet = System.currentTimeMillis(); // відображення початку виконання операції
            System.out.println("arraylist start get elements" + " " + (startGet - endAdd));
            System.out.println("arraylist getting elements " + " " + (endGet - startGet));
            long startDel = System.currentTimeMillis(); // відображення початку виконання операції
            for (int i = 0; i < numberArrayList.size(); i++) {
                numberArrayList.remove(i);
            }
            long endDel = System.currentTimeMillis(); // відображення початку виконання операції
            System.out.println("arraylist deleting elements " + " " + (endDel - startDel));
            long end = System.currentTimeMillis();
            System.out.println("arraylist total" + " " + (endDel - startAdd));
            System.out.println("Array list ends");
        }
    else {
            System.out.println("Number of elements must be less then 100000");
        }
}
}



