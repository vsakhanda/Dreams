package l28Reflection.lecture;

import java.lang.reflect.*;
import java.util.Arrays;

public class lecture28 {

    public static void main(String[] args) {
        Class<Student> studentClass = Student.class;


        //
        System.out.println(studentClass.getName());
        System.out.println(studentClass.getModifiers()); // отримання інформації про модіфаер класу, але його необхідно трансформувати для відображення як стрінг
        System.out.println(Modifier.toString(studentClass.getModifiers())); // виведення модіфаеру класу
        System.out.println(studentClass.getSuperclass()); // отримання суперкласу
        System.out.println(studentClass.getSimpleName()); // отримання назви без пакету
        System.out.println(Arrays.toString(studentClass.getInterfaces())); // отримання інтерфейсу

        // fields
        System.out.println("***Відображення полів через стрім");
        Field[] fields = studentClass.getDeclaredFields();
        Arrays.stream(fields).forEach(System.out::println);

        System.out.println("***Другий метод відображення полів");
        Field[] fields1 = studentClass.getDeclaredFields();
        Arrays.stream(fields).forEach(
                field -> {
                System.out.println(field.getName());
                System.out.println(field.getType());
                System.out.println(Modifier.toString(field.getModifiers()));
                }
        );

        System.out.println("***Методи класу");

        Method[] methods = studentClass.getMethods();
        Arrays.stream(methods).forEach(System.out::println);
        System.out.println("***Отримання конкретного методу");
        try {
            Method setMetodeName = studentClass.getMethod("setName", String.class);
            System.out.println("Запуск методу");
            Student student = new Student();
            setMetodeName.invoke(student, "Vladyslav");
            System.out.println(student.getName());

        } catch (NoSuchMethodException | InvocationTargetException | IllegalAccessException e) {
            throw new RuntimeException(e);
        }


        System.out.println("***Конструктори");
        System.out.println("***Всі Конструктори");
        Constructor[] constructors = studentClass.getConstructors();
        Arrays.stream(constructors).forEach(System.out::println);

        System.out.println("***Один Конструктор з ініціацією елемнту");
        try {
            Constructor<Student> constructor = studentClass.getConstructor(String.class);

            Student student = constructor.newInstance("Vladyslav");
            //Student student1 = new Student("Serhii");

            System.out.println(student.getName());
        } catch (NoSuchMethodException | InvocationTargetException | InstantiationException | IllegalAccessException e) {
            throw new RuntimeException(e);
        }


    }
    }
