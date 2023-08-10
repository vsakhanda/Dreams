package l21StreamAPILambda.HomeWork;

import java.util.Comparator;

public class CompareScore implements Comparator<Student> {

        public int compare(Student a, Student b) {
            return a.getScore().compareTo(b.getScore());
        };

}
