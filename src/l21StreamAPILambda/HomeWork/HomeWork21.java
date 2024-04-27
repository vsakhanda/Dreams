package l21StreamAPILambda.HomeWork;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/*
+ Створити клас студент з полями Прізвище та Середній бал.
+ Написати два компаратори для сортування по цим полям.
У головному класі наповнити лист даними про студентів та відсортувати за допомогою цих компараторів.
Показати на консоль 3 варіанти листа: оригінальний та 2 відсортованих.
*/


public class HomeWork21 {

    static List<Student> StudentList = List.of(
            new Student ("Fedir", 25),
            new Student ("Simon",35),
            new Student ("Miguel",50),
            new Student ("John", 29),
            new Student ("Adam", 52),
            new Student ("Feofan", 27));


    public static void main(String[] args) {

        System.out.println("Початковий список");
        System.out.println(StudentList.toString());

        System.out.println("Сортування за середнім балом");
        List<Student> sortedByScore = StudentList.stream()
                .sorted((o1, o2) -> o1.getScore() - o2.getScore())
                .collect(Collectors.toList());

        sortedByScore.forEach(System.out::println);

        System.out.println("Сортування за Іменем");
        List<Student> sortedByName = StudentList.stream()
                .sorted((o1, o2) -> o1.getName().compareTo(o2.getName()))
                .collect(Collectors.toList());
        sortedByName.forEach(System.out::println);

        System.out.println("Використання компаратора");
        List<Student> sortedList = StudentList.stream()
                .sorted(Comparator.comparing(Student::getName))
                .collect(Collectors.toList());

        sortedByName.forEach(System.out::println);
        System.out.println("Завершення порівняння");

        }

    }
