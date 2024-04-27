package l22StreamAPIPart2.HomeWork21;

/*
1.   Створити лист з 20 прізвищами. Вони повинні повторюватися.
1.2. За допомогою стрім апі перетворити цей лист на мапу.
1.3. У якості ключа повинно бути прізвище, а я якості значення кількість повторень його.
2.   Заповнити лист випадковими числами.
2.1. Знайти суму цих чисел за допомогою Stream API
*/

import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.stream.Collectors;

public class Main {


    public static void main(String[] args) {

        System.out.println("Завдання1. Список в Мапу ");
        listToMap();
        System.out.println("********");
        System.out.println("Завдання2. Сума випадкових чисел");
        randomNumbers();
        System.out.println("********");
    }

    public static void listToMap() {

        List<String> surnameList = List.of(
                "Апостол", "Благовісний", "Боголикий", "Боголюбськй", "Богонос", "Богославський",
                "Богослов", "Богуслав", "Буян", "Великий", "Вернигора", "Галицький",
                "Добриня", "Дубоніс", "Довгорукий", "Златоуст", "Калита", "Кандиба", "Кожем’яка", "Кривіша",
                "Остромир", "Первозваний", "Пересвіт", "Печерський", "Победоносець", "Полуботко", "Порогост", "Преподобний", "Ягайло",
                "Добриня", "Дубоніс", "Довгорукий", "Златоуст", "Калита", "Кандиба", "Кожем’яка", "Кривіша",
                "Апостол", "Благовісний", "Боголикий", "Боголюбськй", "Богонос", "Богославський"
        );

        System.out.println(grouping(surnameList));
    }

    static Map<String, Long> grouping(List<String> surnameList) {
        return surnameList.stream().collect(Collectors.groupingBy(
                        surname -> surname,
                        Collectors.counting()
                )
        );
    }

    public static void randomNumbers() {
        List<Integer> intList = List.of(
                random(), random(), random(), random(), random(),
                random(), random(), random(), random(), random()
        );

        System.out.println("List of integers: " + intList);
        System.out.println("Sum of List of integers (first method) = " + sum(intList));
    }

    static Integer random() {
        Random randomInt = new Random();
        return randomInt.nextInt(10);
    }

    static Integer sum(List<Integer> list) {
        return list.stream().mapToInt(Integer::intValue).sum();
    }
}