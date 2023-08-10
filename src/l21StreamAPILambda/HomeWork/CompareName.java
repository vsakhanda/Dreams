package l21StreamAPILambda.HomeWork;

import java.util.Comparator;

public class CompareName implements Comparator<Student> {

    public int compare(Student a, Student b) {
        return a.getName() .compareTo(b.getName());
    };

}
