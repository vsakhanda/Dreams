package l21StreamAPILambda.HomeWork;

import java.util.Comparator;

public class CompareScore implements Comparator<Student> {

    @Override
        public int compare(Student a, Student b) {
        return a.getName()
                .compareTo(b.getName());
        };

}
