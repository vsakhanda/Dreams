package l19collection3;

import java.util.*;

public class Lecture19 {

    public static void main(String[] args) {
       // maps();
        workDirectWithHashMap();
        workWithMapMethods();
        workDirectWithTreeMap();
        workDirectWithLinkedHashMap();
        treeMapInDetails();

    }

        public static void maps(){

        Map<Integer, Alian> alianHashMap = new HashMap<>();
        Map<Integer, Alian> alianTreeMap = new TreeMap<>();
        Map<Integer, Alian> alianLinkedHashMap = new LinkedHashMap<>();

        Alian xenomorth = new Alian();
        xenomorth.setName("Banana-shaped");
        xenomorth.setSurname("Facehugger");
        xenomorth.setGalactic("Wide range");
        xenomorth.setHeight(8);


        Alian asteromorth = new Alian();
        asteromorth.setName("Humanoid");
        asteromorth.setSurname("Humanoid");
        asteromorth.setGalactic("All Tomorrows");
        asteromorth.setHeight(5);

        Alian reptoid = new Alian();
        reptoid.setName("Gordon");
        reptoid.setSurname("Shamway");
        reptoid.setGalactic("Real");
        reptoid.setHeight(8);


        alianHashMap.put(111, xenomorth);
        alianHashMap.put(221, asteromorth);
        alianHashMap.put(331, reptoid);

        alianTreeMap.put(112, xenomorth);
        alianTreeMap.put(222, asteromorth);
        alianTreeMap.put(323, reptoid);

        alianLinkedHashMap.put(113, xenomorth);
        alianLinkedHashMap.put(233, asteromorth);
        alianLinkedHashMap.put(333, reptoid);

        // Метод для відображення ключів, що є в таблиці
        System.out.println("Keys for HashMap");
        Set<Integer> keys = alianHashMap.keySet();
        System.out.println("Ключі: " + keys);

        System.out.println("Keys for TreeMap");
        Set<Integer> keys1 = alianTreeMap.keySet();
        System.out.println("Ключі: " + keys1);

        System.out.println("Keys for LinkedHashMap");
        Set<Integer> keys2 = alianLinkedHashMap.keySet();
        System.out.println("Ключі: " + keys2);


        System.out.println("Hash map");
        // Ітератор
        Iterator<Map.Entry<Integer, Alian>> iterator = alianHashMap.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<Integer, Alian> entry = iterator.next();
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
        System.out.println("Tree map");
        // Ітератор
        Iterator<Map.Entry<Integer, Alian>> iteratort = alianTreeMap.entrySet().iterator();
        while (iteratort.hasNext()) {
            Map.Entry<Integer, Alian> entry = iteratort.next();
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
        System.out.println("Linked Hash Map");
        // Ітератор
        Iterator<Map.Entry<Integer, Alian>> iteratorl = alianLinkedHashMap.entrySet().iterator();
        while (iteratorl.hasNext()) {
            Map.Entry<Integer, Alian> entry = iteratorl.next();
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
        workWithMapMethods();
        System.out.println("***** ");

/*        Map<Key, String> map = new HashMap<>();
        Key key1 = new Key("key1");
        Key key2 = new Key("key2");

        map.put(key1, "value1");
        map.put(key2, "value2");

        System.out.println("size of map is: " + map.size());
        System.out.println("value of key1: " + map.get(key1));
        System.out.println("value of key2: " + map.get(key2));

        */
    }


    private static void workWithMapMethods() {
            System.out.println("*** Methods ***");
            Map<String, Integer> hashMap = new HashMap<>();
            hashMap.put("One", 1);  // Додаємо пару ключ-значення
            hashMap.put("Two", 5);  // Додаємо пару ключ-значення
            hashMap.put("Three", 4);  // Додаємо пару ключ-значення
            Integer value = hashMap.get("One");  // Отримуємо значення за ключем
            boolean containsKey = hashMap.containsKey("One");  // Перевіряємо наявність ключа
            int size = hashMap.size();  // Отримуємо кількість пар ключ-значення
            System.out.println("Кількість елементів в МАР = " + hashMap.size());
            // Ітератор
            Iterator<Map.Entry<String, Integer>> iterator3 = hashMap.entrySet().iterator();
            while (iterator3.hasNext()) {
                Map.Entry<String, Integer> entry = iterator3.next();
                System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
            }

            // Цикл for
            for (Map.Entry<String, Integer> entry : hashMap.entrySet()) {
                System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
            }
            hashMap.remove("One");  // Видаляємо пару ключ-значення за ключем
            System.out.println("*** End Methods ***");
        }

    /*
 HashMap дозволяє null як ключі та значення, і що порядок вставки елементів не зберігається.
*/
    private static void workDirectWithHashMap() {
        System.out.println("*** HashMap дозволяє null як ключі та значення, ***");
        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("One", 1);
        hashMap.put("Two", 2);
        hashMap.put("Three", 4);
        hashMap.get("Three");
        System.out.println(hashMap);
        System.out.println(hashMap.get("Three"));
    }

    /*
       LinkedHashMap також дозволяє null як ключі та значення, але відрізняється тим,
       що він зберігає порядок вставки елементів.
     */
    private static void workDirectWithLinkedHashMap() {
        System.out.println("*** LinkedHashMap також дозволяє null як ключі та значення ***");
        Map<String, Integer> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("One", 1);
        linkedHashMap.put("Two", 2);
        System.out.println(linkedHashMap);
    }

    /*
       TreeMap автоматично сортує пари ключ-значення за ключем.
     */
    private static void workDirectWithTreeMap() {
        System.out.println("*** TreeMap автоматично сортує пари ключ-значення за ключем. ***");
        Map<String, Integer> treeMap = new TreeMap<>();
        treeMap.put("One", 1);
        treeMap.put("Two", 2);
        System.out.println(treeMap);
    }

    private static void treeMapInDetails() {

        /*
        lowerKey(K key): Повертає найбільший ключ, менший, ніж заданий.
        lowerEntry(K key): Повертає запис з найбільшим ключем, меншим, ніж заданий.
        floorKey(K key): Повертає найбільший ключ, менший або рівний заданому.
        floorEntry(K key): Повертає запис з найбільшим ключем, меншим або рівним заданому.
        ceilingKey(K key): Повертає найменший ключ, більший або рівний заданому.
        ceilingEntry(K key): Повертає запис з найменшим ключем, більшим або рівним заданому.
        higherKey(K key): Повертає найменший ключ, більший, ніж заданий.
        higherEntry(K key): Повертає запис з найменшим ключем, більшим, ніж заданий.
        firstEntry(): Повертає запис з найменшим ключем в цій мапі, або null, якщо мапа порожня.
        lastEntry(): Повертає запис з найбільшим ключем в цій мапі, або null, якщо мапа порожня.
         */

        TreeMap<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(10, "Ten");
        treeMap.put(20, "Twenty");
        treeMap.put(26, "Twenty26");
        treeMap.put(30, "Thirty");
        treeMap.put(40, "Forty");
        treeMap.put(50, "Fifty");

        System.out.println(treeMap.higherKey(25));  // Prints: 30
        System.out.println(treeMap.floorKey(25));   // Prints: 20
        System.out.println(treeMap.ceilingKey(25)); // Prints: 30
        System.out.println(treeMap.lowerKey(25));   // Prints: 20
        System.out.println(treeMap.firstEntry());   // Prints: 10=Ten
        System.out.println(treeMap.lastEntry());    // Prints: 50=Fifty
    }

}

