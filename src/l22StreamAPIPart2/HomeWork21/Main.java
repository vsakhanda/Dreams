package l22StreamAPIPart2.HomeWork21;

/*
1.   Створити лист з 20 прізвищами. Вони повинні повторюватися.
1.2. За допомогою стрім апі перетворити цей лист на мапу.
1.3. У якості ключа повинно бути прізвище, а я якості значення кількість повторень його.
2.   Заповнити лист випадковими числами.
2.1. Знайти суму цих чисел за допомогою Stream API
*/

import java.util.ArrayList;
import java.util.List;

public class Main {



    public static void main(String[] args) {

        // 1.   Створити лист з 20 прізвищами. Вони повинні повторюватися.
        List person = new ArrayList<>();
        person.add("Oleksandr");
        person.add("Serhii");
        person.add("Alex");
        person.add("Oleksandr");
        person.add("Volodymyr");
        person.add("Vladyslav");
        person.add("Oksana");
        person.add("Anna");
        person.add("Maria");
        person.add("Prokip");
        person.add("Feofan");
        person.add("Serhii");
        person.add("Alex");
        person.add("Oleksandr");
        person.add("Volodymyr");
        person.add("Vladyslav");
        person.add("Oksana");
        person.add("Anna");
        person.add("Maria");
        person.add("Prokip");


    }}
/*        1.2. За допомогою стрім апі перетворити цей лист на мапу.

        1.3. У якості ключа повинно бути прізвище, а я якості значення кількість повторень його.*/
/*
        Map<String, Map<String, Long>> collect = person
                .stream()
                .collect(Collectors.groupingBy(person.get(), Collectors.groupingBy(person::get(), Collectors.counting())));

   }*/
