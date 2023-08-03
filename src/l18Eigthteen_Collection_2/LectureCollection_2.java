package l18Eigthteen_Collection_2;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class LectureCollection_2 {

    public static void main(String[] args) {

        Set<String> setName = new HashSet(); // додається Set з типом HashSet
        setName.add("One"); // add an element
        setName.add("Two"); // add an element
        setName.add("Three"); // add an element
        setName.add("Four"); // add an element
        setName.remove("two"); // remove an element
        setName.contains("One"); // check if element is exists
        int size = setName.size(); // get the number of elements
        boolean isEmpty = setName.isEmpty(); // check if set is empty
        //setName.clear();  // remove all elements
        Iterator<String> iterator = setName.iterator(); // get iterator
        System.out.println(size);
        // Ітерація по set
        for (String element: setName) {
            System.out.println(element);
        }
    }
}
