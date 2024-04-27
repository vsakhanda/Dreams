package l19collection3.practice;

//practice
 /*   Завдання №1: Створіть HashMap, яка зберігає імена студентів та їх оцінки за екзамен. Додайте декілька записів в цю мапу і виведіть її на екран.

    Завдання №2: Використовуючи мапу з попереднього завдання, напишіть метод, який приймає ім'я студента як вхідний параметр і видаляє його з мапи.

    Завдання №3: Створіть LinkedHashMap з рядками як ключами та значеннями. Додайте декілька записів і виведіть мапу,
     щоб показати, що вона зберігає порядок вставки.

    Завдання №4: Створіть TreeMap з рядками як ключами та значеннями. Додайте декілька записів і виведіть мапу, щоб показати,
     що вона автоматично сортує записи за ключами.

    Завдання №5: Напишіть програму, яка підраховує кількість входжень кожного слова в тексті. Використайте HashMap, де ключі - це слова,
    а значення - кількість їх входжень.

    Завдання №6: Напишіть метод, який перевіряє, чи дві мапи є ідентичними. Метод повинен приймати дві мапи як вхідні параметри і повертати true,
     якщо вони ідентичні, і false в іншому випадку.

    Завдання №7: Напишіть програму, яка перевертає мапу. Вхідна мапа повинна мати рядки як ключі та цілі числа як значення.
    Вихідна мапа повинна мати цілі числа як ключі та множини рядків як значення.
    // input ("a"=1, "b" = 2 , "c" = 3, "d"=3)  -> {1=[a], 2=[b], 3-[c,d]}
    Map<String,Integer> firstInputMap = new HashMap();
    Map<Integer, HashSet<String>> outPutMap = new HashMap();
*/

import org.jetbrains.annotations.NotNull;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class practice {

    static Map<String, Integer> studentList;
    static String KeyId = "Luca Brazi";
    static String test = "test is test in only test is";
    static String test2 = "test is test in only test is now";


    public static void main(String[] args) {

        oneHashMap();  // Додавання елементів в HashMap Завдання №1:
        System.out.println("Додавання елементів #1");
        print1();  // Відображення елементів в масиві в будь який момент часу - Перший варіант через цикл for
        print2(); // Відображення елементів в масиві в будь який момент часу - Другий варіант через цикл while
        toDeleteHash(KeyId);
        System.out.println("Видалення елементів #2");
        print1();  // Відображення елементів в масиві в будь який момент часу - Перший варіант через цикл for
        print2(); // Відображення елементів в масиві в будь який момент часу - Другий варіант через цикл while
        oneLinkedHashMap();
        System.out.println("Додавання LinkedHashMap #3");
        print1();  // Відображення елементів в масиві в будь який момент часу - Перший варіант через цикл for
        print2(); // Відображення елементів в масиві в будь який момент часу - Другий варіант через цикл while
        oneTreeMap();
        System.out.println("Додавання TreeMap #4");
        print1();  // Відображення елементів в масиві в будь який момент часу - Перший варіант через цикл for
        print2(); // Відображення елементів в масиві в будь який момент часу - Другий варіант через цикл while
        System.out.println("Підрахунок кількості слів входження #5");
        System.out.println("Вираз 1: " + countWords.countWords(test));
        System.out.println("Вираз 2: " +countWords.countWords(test2));
        System.out.println("Порівняння структури МАП #6");
        System.out.println("МАПА 1");
        Map<String,Integer> firstOne = countWords.countWords(test);
        System.out.println("МАПА 2");
        Map<String,Integer> secondOne = countWords.countWords(test2);
        System.out.println("Результат порівняння");
        System.out.println(firstOne.equals(secondOne));
        System.out.println(countWords.mapCompaire(firstOne,secondOne));
        System.out.println("Трансформація МАПИ");
        countWords.transposition(firstOne);
    }

    public static void oneHashMap() {
        //  Iterator<Map.Entry<String, Integer>> iteratorName = studentList.entrySet().iterator(); // Визначаємо ітератор та прирівнюємо його до нашого списку. entrySet()
        studentList = new HashMap<>();
        studentList.put("Sergio Tachini", 98);
        studentList.put("Karl Lagerfeld", 95);
        studentList.put("Luca Brazi", 89);
    }

    public static void oneTreeMap() {
        //  Iterator<Map.Entry<String, Integer>> iteratorName = studentList.entrySet().iterator(); // Визначаємо ітератор та прирівнюємо його до нашого списку. entrySet()
        studentList = new TreeMap<>();
        studentList.put("Sergio Tachini", 11);
        studentList.put("Karl Lagerfeld", 12);
        studentList.put("Luca Brazi", 10);
    }
    public static void oneLinkedHashMap() {
        //  Iterator<Map.Entry<String, Integer>> iteratorName = studentList.entrySet().iterator(); // Визначаємо ітератор та прирівнюємо його до нашого списку. entrySet()
        studentList = new TreeMap<>();
        studentList.put("Sergio Tachini", 55);
        studentList.put("Karl Lagerfeld", 55);
        studentList.put("Luca Brazi", 55);
    }
    private static void print2() {
        System.out.println("Другий метод через Iterator");
        Iterator<Map.Entry<String, Integer>> iteratorName = studentList.entrySet().iterator(); // Визначаємо ітератор та прирівнюємо його до нашого списку. entrySet()
        while (iteratorName.hasNext()) { // Ствоерюємо цикл While
            Map.Entry<String, Integer> entryName = iteratorName.next();// В тілі циклу прописуємо умову для МАПА
            System.out.println("Key: " + entryName.getKey() + // функція getKey дозволяє отримати інформацію про ключ мапи
                    " " + entryName.getValue()); // функція getValue дозволяє отримати інформацію про значення для ключа
        }
    }
    private static void print1() {
        System.out.println("Перший метод через цикл for");
        for (Map.Entry<String, Integer> entry : studentList.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
    }
        public static void toDeleteHash(@NotNull String KeyId){
            studentList.remove(KeyId);  // Видаляємо пару ключ-значення за ключем
            }
    }