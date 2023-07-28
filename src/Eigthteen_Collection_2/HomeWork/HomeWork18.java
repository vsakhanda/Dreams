package Eigthteen_Collection_2.HomeWork;
//
//1. У циклі на 1000 повтореннь сгенерувати випадкові числі діапазоном від 1 до 50 за зберегти їх у різні типи колекцій сет
//2. Вивести всі 3 варіанти на консоль
//


import java.util.*;
import java.util.HashSet;

public class HomeWork18 {

    private final static int range = 50; // Діапазоном від 1 до 50 елементів
    private final static int lenght = 10; // Кількість повторень взяв 10

    public static void main(String[] args) {


        // Створюємо самив для внесення даних. Довжина масиву винесена в параметр та буде відповідати кількості циклів формування випадкових чисел.
        String[] mainArray = new String[lenght];
        System.out.println("Початковий масив");
        // Викликаємо функцію випадкових чисел. результат вносимо в початковий масив
        Random random = new Random();
        for (int i=0; i<lenght; i++){
            mainArray[i] = String.valueOf(random.nextInt(range));
        }
        // Для перевірки відображеємо всі елементи масиву
        System.out.println("Масив, що повертається " + Arrays.asList(mainArray));
        // Працюємо з Сетами
        // HashSet
        Set<String> newSetName = new HashSet<>(Arrays.asList(mainArray));
        System.out.println("Розмір масиву HashSet " + newSetName.size());
        for (String element : newSetName) {
            System.out.println("HashSet element: " + element);
        }
        // LinkedHashSet
        Set<String> newLinkedSetName = new LinkedHashSet<>(Arrays.asList(mainArray));
        System.out.println("Розмір масиву LinkedSetName " + newLinkedSetName.size());
        for (String element1 : newLinkedSetName) {
            System.out.println("LinkedSetName element: " + element1);
        }
        //TreeSet
        Set<String> newTreeSetName = new TreeSet<>(Arrays.asList(mainArray));
        System.out.println("Розмір масиву TreeSetName " + newTreeSetName.size());
        for (String element2 : newTreeSetName) {
            System.out.println("TreeSetName element: " + element2);
        }

        System.out.println("HS size " + newSetName.size());
        System.out.println("LHS size " + newLinkedSetName.size());
        System.out.println("TS size " + newTreeSetName.size());


    }
}


