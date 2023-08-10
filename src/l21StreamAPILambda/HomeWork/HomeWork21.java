package l21StreamAPILambda.HomeWork;

/*
+ Створити клас студент з полями Прізвище та Середній бал.
+ Написати два компаратори для сортування по цим полям.
У головному класі наповнити лист даними про студентів та відсортувати за допомогою цих компараторів.
Показати на консоль 3 варіанти листа: оригінальний та 2 відсортованих.
*/

import java.util.List;
import java.util.stream.Stream;

public class HomeWork21 {
public static void main(String[] args) {




    List<Student> students23 = List.of(
            new Student ("Fedir", 25),
            new Student ("Simon",35),
            new Student ("Miguel",50),
            new Student ("John", 25),
            new Student ("Adam", 50),
            new Student ("Fedir", 25),


    String result = CompareName.compare(students23));
    System.out.println(result);

    List<Student> filteredStudents = students23.stream().sorted()
            .toList();
    System.out.println(filteredStudents.toString());
}
/*

    public static void oneHashMap() {
        //  Iterator<Map.Entry<String, Integer>> iteratorName = studentList.entrySet().iterator(); // Визначаємо ітератор та прирівнюємо його до нашого списку. entrySet()
        studentList = new TreeMap<>();
        studentList.put("Sergio Tachini", 55);
        studentList.put("Karl Lagerfeld", 55);
        studentList.put("Luca Brazi", 55);
    }
    private static void print1() {
        System.out.println("Перший метод через цикл for");
        for (Map.Entry<String, Integer> entry : studentList.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
    }
*/

/*    public static void StudentSort() {


        List<Student()> students = Arrays.asList();
        List<String> students1 = Stream.of("Fedir", "Simon", "Miguel", "John", "Adam").collect(Collectors.toList());
        List<String> filterNames = students1.stream()
//            .filter(name -> name.startsWith("A"))
//            .collect(Collectors.toList());
        System.out.println(filterNames);

    }


    () {
        //  Iterator<Map.Entry<String, Integer>> iteratorName = studentList.entrySet().iterator(); // Визначаємо ітератор та прирівнюємо його до нашого списку. entrySet()
        studentList = new TreeMap<>();

        studentList = new Student("Oleksandr",  12);
    Student student2 = new Student("Ivan",  25);
    Student student3 = new Student("Petro",  27);
    Student student4 = new Student("Pedro",  32);
    Student student5 = new Student("Carlos",  27);
    Student student6 = new Student("Indzagi",  45);



}*/
}
