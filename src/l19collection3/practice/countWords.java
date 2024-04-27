package l19collection3.practice;


import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class countWords {

    public static Map<String, Integer> countWords(String text) { //Завдання №5 - Підрахунок слів в Мапі
        String[] words = text.split(" "); //Визначаємо змінну words
        HashMap<String, Integer> wordCount = new HashMap<>();  // Ініціалізуємо Мапу, яка приймає ключ в текстовому форматі - наші слова, та кількість слів - число

        for (String word : words) {
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }
        System.out.println(wordCount);
        return wordCount;
    }

    public static boolean mapCompaire(Map<String, Integer> map1, Map<String, Integer> map2) {  //Завдання №6 - порівняння Мап
        if(map1.size() != map2.size()) {
            return false;
        }
        for(String key : map1.keySet()) {
            if(!map1.get(key).equals(map2.get(key))) {
                return false;
            }
        }
        return true;
    }


    // 7     Завдання №7: Напишіть програму, яка перевертає мапу. Вхідна мапа повинна мати рядки як ключі та цілі числа як значення.

    public static Map<Integer, HashSet<String>> transposition(Map<String, Integer> map1) {
        Map<Integer, HashSet<String>> outPutMap = new HashMap();

        for ( Map.Entry<String, Integer> entry : map1.entrySet() ) {
  //          outPutMap.entrySet(entry.getValue(), entry.getKey()); // якось треба додати в масив HashSet всі елементи. Можливо цикл, можливо визначити HashSet
        }
        System.out.println(outPutMap);
        return outPutMap;

        /*
// Вар2
        for ( Map.Entry<K, V> entry : map.entrySet() ) {
            newMap.put(entry.getValue(), entry.getKey());
        }
        return newMap;

// Вар1
        Map<Type1,Type2> oldmap = getOldMap();
        Map<Type2,Type1> newmap = new HashMap<Type2,Type1>();
        for(Entry<Type1,Type2> entry : oldmap.entrySet()) {
            newmap.put(entry.getValue(),entry.getKey();
        }
*/

    }


}
