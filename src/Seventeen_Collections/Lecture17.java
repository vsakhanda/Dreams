package Seventeen_Collections;

import java.util.ArrayList;
import java.util.LinkedList;

public class Lecture17 {

    public static void main(String[] args) {
// ARRAY LIST
        long startAdd = System.currentTimeMillis(); // відображення початку виконання операції
        ArrayList<Integer> numberArrayList = new ArrayList<>(); // New Array list initializing
        for (int i = 0; i < 100000; i++) { // Add Cycle for adding new element to array
            numberArrayList.add(i); // Adding command
        }
        long endAdd = System.currentTimeMillis();
        System.out.println("arraylist adding elements" + " " + (endAdd-startAdd));
        long startGet = System.currentTimeMillis(); // відображення початку виконання операції
        for (int i = 0; i < numberArrayList.size(); i++){
            numberArrayList.get(i);
        }
        long endGet = System.currentTimeMillis(); // відображення початку виконання операції
        System.out.println("arraylist start get elements" + " " + (startGet-endAdd));
        System.out.println("arraylist getting elements " + " " + (endGet-startGet));
        long startDel = System.currentTimeMillis(); // відображення початку виконання операції
        for (int i = 0; i< numberArrayList.size(); i++){
            numberArrayList.remove(i);
        }
        long endDel = System.currentTimeMillis(); // відображення початку виконання операції
        System.out.println("arraylist deleting elements " + " " + (endDel-startDel));
        long end = System.currentTimeMillis();
        System.out.println("arraylist total" + " " + (endDel-startAdd));

// LINKED LIST

        long startLinkedListAdd = System.currentTimeMillis();
        LinkedList<Integer> numberLinkedList = new LinkedList<>();
        for (int i = 0; i < 1000 ; i++){
            numberLinkedList.add(i);
        }
        long endLinkedListAdd = System.currentTimeMillis();
        System.out.println("Linked list adding elements" + " " + (endLinkedListAdd-startLinkedListAdd));
        long startLinkedListGet = System.currentTimeMillis();
        for (int i = 0; i < numberLinkedList.size(); i++){
            numberLinkedList.get(i);
        }
        long endLinkedListGet = System.currentTimeMillis();
        System.out.println("Getting Linked list elements" + " " + (endLinkedListGet-startLinkedListGet));
        long startLinkedListDel = System.currentTimeMillis();
        for (int i = 0; i< numberLinkedList.size(); i++) {
            numberLinkedList.remove(i);
        }
        long endLinkedList = System.currentTimeMillis();
        System.out.println("Deleting Linked list elements" + " " + (endLinkedList-startLinkedListDel)) ;
        System.out.println("linkedList total time" + " " + (endLinkedList-startLinkedListAdd) );
    }
}
