package Seventeen_Collections.HomeWork17;

import java.util.ArrayList;
import java.util.LinkedList;

/*
1. Створити програму для збереження списку чисел з 10 елементів та іншого з 2 000 000 елементів. Для кожного підібрати свій тип
2. Зберегти у колекції список студентів (класс Студент теж створити)
3. Вивести цей список
4. Опціонально: написати реалізацію класу ArrayList або LinkedList
*/


import java.util.List;

public class HomeWork17 {
    public static void main(String[] args){


// 1. Створити програму для збереження списку чисел з 10 елементів та іншого з 2 000 000 елементів. Для кожного підібрати свій тип
        System.out.println("*****");
        System.out.println("Ten Element list start");
        List<Integer> tenElements = new ArrayList<>();
        tenElements.add(1);
        tenElements.add(2);
        tenElements.add(3);
        tenElements.add(4);
        tenElements.add(5);
        tenElements.add(6);
        tenElements.add(7);
        tenElements.add(8);
        tenElements.add(9);
        tenElements.add(10);

        for (int t=0; t< tenElements.size(); t++ ){
            System.out.println("Element from list *Ten Elements+ " + tenElements.get(t));
        }


        System.out.println("*****");
        System.out.println("Two millions list start");

        List<Integer> twoMillions = new ArrayList<>();
        for (int i = 0; i < 2000000; i++) {
            twoMillions.add(i);
        }
        System.out.println("Two millions list is added");


// 2. Зберегти у колекції список студентів (класс Студент теж створити)
        List<Student> studentArray = new ArrayList<>();

        Student alex = new Student("Alex", 28);
        Student vova = new Student("Vova", 38);
        Student dmytro = new Student("Dmytro", 33);

        studentArray.add(alex);
        studentArray.add(vova);
        studentArray.add(dmytro);

        List<StudentList> studentArrayList = new LinkedList<>();

        StudentList sula = new StudentList();
        sula.setName("Sula");
        sula.setSurname("Pawerovych");
        sula.setSubject("Physics");
        sula.setScore(98);

        StudentList mark = new StudentList();
        mark.setName("Mark");
        mark.setSurname("Avrelij");
        mark.setScore(100);
        mark.setSubject("Oratory");

        StudentList oleksa = new StudentList();
        oleksa.setName("Oleksa");
        oleksa.setSurname("Negrebeckyi");
        oleksa.setScore(99);
        oleksa.setSubject("Language");

        studentArrayList.add(sula);
        studentArrayList.add(mark);
        studentArrayList.add(oleksa);



// 3. Вивести список студентів
        System.out.println("*****");
        System.out.println("Перелік студентів з групи 1 Клас ArrayList");
        for (Student student : studentArray) {
            System.out.println("Student list: " + student);
        }

        System.out.println("*****" );
        System.out.println("Перелік студентів з групи 2 Клас LinkedList");

        System.out.println("Student list: ");
        for (StudentList studentList2 : studentArrayList) {
            System.out.println("Student list: " + studentList2);
        }

        System.out.println("Варіант 2 циклу відображення елементів для Класу LinkedList");
       for (int j =0; j < studentArrayList.size(); j++) {
           System.out.println(studentArrayList.get(j));}

        System.out.println("Завершення завдання з відображення студентів");
        System.out.println("*****");

//4. Optional Array list and Linked List
       System.out.println("4. Optional Array list and Linked List");
       ArrayListOne.ArrayListOne(10);
       System.out.println("*****");
       LinkedListOne.LinkedList(10);
       System.out.println("*****");

    }




}
