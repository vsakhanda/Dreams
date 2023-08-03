package l15FifteenGenerics.InterfaceWithGenerics;

import l15FifteenGenerics.Human;

public class Main {

    public static void main(String[] args){
        Comparable<String> text = new Text("wwww");
        Comparable<String> text2 = new Text("123123123");
        text2.compareTo("qwe");



        Integer[] intArray = {1,2,3,4,5,6};
        String[] strArray = {"a","b","c","d"};
        Human[] humanArray = {new Human("Odin", 1), new Human("Thor", 2)};

        GenericSwap.swap(intArray, 1,5);
        GenericSwap.swap(strArray,0,2);
        GenericSwap.swap(humanArray,0,1);
    }

}
