package l19collection3.homework;

//Мапа потрібна містити інформацію про 10 будь-яких слів українською мовою і її переклад на: англійску, японську, німецьку. Коли користувач дає мапі слово українською - то потрібен отримати у результаті переклад на ці 3 мови


import java.util.*;

public class Homework19 {


    public static void main(String[] args){

        Scanner wordTranslate = new Scanner(System.in);
        System.out.println("Виберіть одне з визнаених слів для перекладу");
        System.out.println("один, два, три, дерево, дім, кінь, садок, лекція, вишня, програма");
        String word = String.format(wordTranslate.next());
        System.out.println("Слово для перекладу: " + word);

        translateEasy(word);
        translateEnglish(word);
        translateJapan(word);
        translateGerman(word);

    }

    private static void translateGerman(String word){
            System.out.println("*** Переклад на Німецьку мову ***");

            Map<String, String> hashMap = new HashMap<>();
            hashMap.put("один", "eins");
            hashMap.put("два", "zwei");
            hashMap.put("три", "drei");
            hashMap.put("дерево", "baum");
            hashMap.put("дім", "Haus");
            hashMap.put("кінь", "pferd");
            hashMap.put("садок", "garten");
            hashMap.put("лекція", "vorlesung");
            hashMap.put("вишня", "kirsche");
            hashMap.put("програма", "programm");
//            System.out.println(hashMap);
            System.out.println(hashMap.get(word));
        }

    private static void translateJapan(String word) {
        System.out.println("*** Переклад на японську мову ***");
        Map<String, String> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("один", "一 (Ichi)");
        linkedHashMap.put("два", "二 (ni)");
        linkedHashMap.put("три", "三つ (mittsu)");
        linkedHashMap.put("дерево", "木 (ki)");
        linkedHashMap.put("дім", "家 (Ie)");
        linkedHashMap.put("кінь", "馬 (Uma)");
        linkedHashMap.put("садок", "公園 (kōen)");
        linkedHashMap.put("лекція", "講義 (kōgi)");
        linkedHashMap.put("вишня", "チェリー(Cherī)");
        linkedHashMap.put("програма", "プログラム(puroguramu)");
//        System.out.println(linkedHashMap);
        System.out.println(linkedHashMap.get(word));
    }


    private static void translateEnglish(String word) {
            System.out.println("*** Переклад на Англійську мову ***");
            Map<String, String> treeMap = new TreeMap<>();
            treeMap.put("один", "one");
            treeMap.put("два", "two");
            treeMap.put("три", "three");
            treeMap.put("дерево", "tree");
            treeMap.put("дім", "house");
            treeMap.put("кінь", "horse");
            treeMap.put("садок", "garden");
            treeMap.put("лекція", "lecture");
            treeMap.put("вишня", "cherry");
            treeMap.put("програма", "program");
//            System.out.println(treeMap);
            System.out.println(treeMap.get(word));
    }

    private static void translateEasy(String word) {
        System.out.println("*** Переклад на всі мови з використанням словника***");
        Map<String, vocabulary> wordMap = new HashMap<>();

        vocabulary one = new vocabulary();
        one.setEnglish("one");
        one.setJapan("' 一 ' (Ichi)");
        one.setGerman(" eins");

        vocabulary two = new vocabulary();
        two.setEnglish("two");
        two.setJapan("' =二 '(ni)");
        two.setGerman(" zwei");

        vocabulary three = new vocabulary();
        three.setEnglish("three");
        three.setJapan("=三つ (mittsu)");
        three.setGerman(" eins");

        vocabulary tree = new vocabulary();
        tree.setEnglish("tree");
        tree.setJapan("=木 (ki)");
        tree.setGerman("baum");

        vocabulary house = new vocabulary();
        house.setEnglish("house");
        house.setJapan("=家 (Ie)");
        house.setGerman("Haus");

        vocabulary horse = new vocabulary();
        horse.setEnglish("horse");
        horse.setJapan("=馬 (Uma)");
        horse.setGerman("pferd");

        vocabulary lecture = new vocabulary();
        lecture.setEnglish("lecture");
        lecture.setJapan("=講義 (kōgi)");
        lecture.setGerman("vorlesung");

        vocabulary garden = new vocabulary();
        garden.setEnglish("garden");
        garden.setJapan("公園 (kōen)");
        garden.setGerman("garten");

        vocabulary cherry = new vocabulary();
        cherry.setEnglish("cherry");
        cherry.setJapan("チェリー(Cherī)");
        cherry.setGerman("kirsche");

        vocabulary program = new vocabulary();
        program.setEnglish("program");
        program.setJapan("プログラム(Puroguramu)");
        program.setGerman("programm");

        wordMap.put("один", one);
        wordMap.put("два", two);
        wordMap.put("дерево", tree);
        wordMap.put("три", three);
        wordMap.put("дім", house);
        wordMap.put("кінь", horse);
        wordMap.put("садок", garden);
        wordMap.put("лекція", lecture);
        wordMap.put("вишня", cherry);
        wordMap.put("програма", program);


        System.out.println(wordMap.get(word));

    }


    }


