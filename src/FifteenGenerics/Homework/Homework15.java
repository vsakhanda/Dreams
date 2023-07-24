package FifteenGenerics.Homework;

//     Створити інтерфейс звіра, реалізувати його класами собака / кіт / папуга.
//     Створити масив звірів і викликати метод voice.

//Створіть параметризований клас Pair, який приймає два параметри типу.
// Клас повинен мати методи getFirst() та getSecond(), які повертають перший та другий елементи відповідно.
// Протестуйте клас Pair, створюючи об'єкти з різними типами даних (наприклад, цілі числа, рядки, об'єкти) та отримуючи їх значення.


import FifteenGenerics.Human;

public class Homework15 {

    public static void main(String[] args){

        Integer[] intArray = {1,2,3,4,5,6};
        String[] strArray = {"a","b","c","d"};
        Human[] humanArray = {new Human("Odin", 1), new Human("Thor", 2)};

        System.out.println("*****");
        Pair.getFirst(intArray);
        Pair.getFirst(strArray);
        Pair.getFirst(humanArray);
        System.out.println("*****");
        Pair.getSecond(intArray);
        Pair.getSecond(strArray);
        Pair.getSecond(humanArray);
        System.out.println("*****");


    }
}
