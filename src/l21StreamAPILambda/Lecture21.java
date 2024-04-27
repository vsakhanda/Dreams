package l21StreamAPILambda;

import java.time.LocalDateTime;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Lecture21 {

    public static void main(String[] args) {

        /*
        Синтаксис лямбда-виразу в Java виглядає наступним чином:
        (parameters) -> expression
        (parameters) -> {statements;}
         */

        SimpleInterface simpleInterface = (a, b) -> a + b;

        // далі йде виклик
        int result = simpleInterface.doSomething(5, 3);
        System.out.println(result); // Виведе: 8

        SimpleInterface simpleInterface1 = new SimpleInterface() {
            @Override
            public int doSomething(int a, int b) {
                return a + b;
            }
        };

        // виклик методу
        int result1 = simpleInterface.doSomething(5, 3);
        System.out.println(result); // Виведе: 8

        Predicate<String> stringLengthIsGreaterThan5 = str -> str.length() > 5;
        System.out.println(stringLengthIsGreaterThan5.test("Hello, World!")); // виведе true
        System.out.println(stringLengthIsGreaterThan5.test("Ababagalamaga")); // виведе false


        Predicate<String> stringLengthIsGreaterThan6 = str -> str.length() > 6;
        System.out.println(stringLengthIsGreaterThan6.test("Hello, World!")); // виведе true
        System.out.println(stringLengthIsGreaterThan6.test("Hello")); // виведе false

        javaUtilFunction();

    }

    /**
     *
     */
    private static void javaUtilFunction(){

        /*
            java.util.function - джава пакет з вже визначеними функціональними інтерфейсами
         */

        /*
            Predicate
            Predicate - це функціональний інтерфейс, який приймає один аргумент і повертає булеве значення.
             Він часто використовується в колекціях та streams для фільтрації елементів.
         */
        Predicate<String> stringLengthIsGreaterThan5 = str -> str.length() > 5;
        System.out.println(stringLengthIsGreaterThan5.test("Hello, World!")); // виведе true
        System.out.println(stringLengthIsGreaterThan5.test("Hello")); // виведе false

        /*
            Function - це функціональний інтерфейс, який приймає один аргумент і повертає результат.
            Це дуже загальний інтерфейс, який ви можете використовувати в будь-якому контексті,
            де вам потрібно виконати обчислення з одним входом і одним виходом.
         */
        Function<String, Integer> stringLengthFunction = str -> str.length();
        System.out.println(stringLengthFunction.apply("Hello, World!")); // виведе 13

        /*
            Consumer - це функціональний інтерфейс, який приймає один аргумент і не повертає результат.
            Він часто використовується в колекціях та streams для виконання дії на кожному елементі.
         */
        Consumer<String> printStringConsumer = str -> System.out.println(str);
        printStringConsumer.accept("Hello, World!"); // виведе "Hello, World!"

        /*
            Supplier - це функціональний інтерфейс, який не приймає жодних аргументів, але повертає результат.
            Він часто використовується в контекстах, де вам потрібно відкладене виконання або виробництво значень.
         */
        Supplier<LocalDateTime> currentTimeSupplier = () -> LocalDateTime.now();
        System.out.println(currentTimeSupplier.get()); // виведе поточну дату і час
    }




}
