package l17Seventeen_Collections.HomeWork17;

public class LinkedListOne {

    public static void LinkedList(int numberOfElementsLL) {

        if (numberOfElementsLL <= 100000) {
            System.out.println("Linked list begin");
            long startLinkedListAdd = System.currentTimeMillis();
            java.util.LinkedList<Integer> numberLinkedList = new java.util.LinkedList<>();
            for (int i = 0; i < numberOfElementsLL; i++) {
                numberLinkedList.add(i);
            }
            long endLinkedListAdd = System.currentTimeMillis();
            System.out.println("Linked list adding elements" + " " + (endLinkedListAdd - startLinkedListAdd));

            long startLinkedListGet = System.currentTimeMillis();
            for (int i = 0; i < numberLinkedList.size(); i++) {
                numberLinkedList.get(i);
            }
// Відображення непарних елементів в Linked List

            System.out.println("Непарні елементи в Linked List");
            // "Обгортка" елементів списку в цикл для парності елементів
            for(int i=0; i<numberLinkedList.size(); i++) {
                if(numberLinkedList.get(i) % 2 != 0) {
                    System.out.println(numberLinkedList.get(i));
                }
            }

            long endLinkedListGet = System.currentTimeMillis();
            System.out.println("Getting Linked list elements" + " " + (endLinkedListGet - startLinkedListGet));
            long startLinkedListDel = System.currentTimeMillis();
            for (int i = 0; i < numberLinkedList.size(); i++) {
                numberLinkedList.remove(i);
            }
            long endLinkedList = System.currentTimeMillis();
            System.out.println("Deleting Linked list elements" + " " + (endLinkedList - startLinkedListDel));
            System.out.println("linkedList total time" + " " + (endLinkedList - startLinkedListAdd));


            System.out.println("Operations with linked list ends");

        } else {
            System.out.println("Number of elements must be less then 100000");
        }
    }
}