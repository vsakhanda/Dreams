package l22StreamAPIPart2;


    /*
        практика :
       1. Відфільтрувати парні значення в Map<String, Integer>, а потім відсортувати їх у зростаючому порядку.
       2. Знайти середнє значення чисел в Set<Integer>.
       3. Створити метод, який повертає Optional<String>, і отримати значення з нього або повернути "немає значення", якщо значення відсутнє.
       4. Знайдіть перший парний елемент в List<Integer>
       5. Знайдіть будь-який непарний елемент в Set<Integer>




     */

import java.util.*;

public class Practice {

    public static void main(String[] args){

        first();
        second();


    }

    public static void first(){

       // Відфільтрувати парні значення в Map<String, Integer>, а потім відсортувати їх у зростаючому порядку.
        Map<String, Integer> map = new HashMap<>();
        map.put("a",1);
        map.put("b",2);
        map.put("c",3);
        map.put("d",4);


        map.values().stream().filter(n -> n%2==0).sorted().forEach(System.out::println);
/*

 1. Отримуємо значення з MAP
 2. Створення Стріму .stream()
 3. Виконуємо фільтрацію та записуєму умови фільтрації .filter(n -> n%2==0)
 4. Виконуємо сортування .sorted()
 5. Виводимо елемент на екран .forEach(System.out::println);
*/

    }

    public static void second(){

//  2. Знайти середнє значення чисел в Set<Integer>.

        Set<Integer> number = new HashSet<>(Arrays.asList(5,2,4,1,3,6));

        number.stream().mapToInt(Integer::intValue).average().ifPresent(System.out::println);

    }


}
