package l28Reflection.homework28;


//Написати свою анотацію для валідації і імплементатор

// Валідація - на клас авто - наявність марки Авто
// Імплементатор - перевірка на заповненість значення

import java.lang.reflect.*;
import java.util.Arrays;

public class homeWork28 {

    public static void main(String[] args) throws CheckYearException {


        Car opel= new Car( "Opel","Scorpio", 1997 );
        Car bmw = new Car( "BMW","M35", 2015 );
        Car mercedes = new Car( "Meercedes-Benz","GLE500 - Brabus", 2019 );


        CheckYearInterceptor checkYearInterceptor = new CheckYearInterceptor();
        checkYearInterceptor.checkYearValidation(opel);
        checkYearInterceptor.checkYearValidation(bmw);
        checkYearInterceptor.checkYearValidation(mercedes);

       // reflection for class Car

        Class<Car> carClass = Car.class;


        //
        System.out.println(carClass.getName());
        System.out.println(carClass.getModifiers()); // отримання інформації про модіфаер класу, але його необхідно трансформувати для відображення як стрінг
        System.out.println(Modifier.toString(carClass.getModifiers())); // виведення модіфаеру класу
        System.out.println(carClass.getSuperclass()); // отримання суперкласу
        System.out.println(carClass.getSimpleName()); // отримання назви без пакету
        System.out.println(Arrays.toString(carClass.getInterfaces())); // отримання інтерфейсу

        // fields
        System.out.println("***Відображення полів через стрім");
        Field[] fields = carClass.getDeclaredFields();
        Arrays.stream(fields).forEach(System.out::println);

        System.out.println("***Другий метод відображення полів");
        Field[] fields1 = carClass.getDeclaredFields();
        Arrays.stream(fields).forEach(
                field -> {
                    System.out.println(field.getName());
                    System.out.println(field.getType());
                    System.out.println(Modifier.toString(field.getModifiers()));
                }
        );

        System.out.println("***Методи класу");

        Method[] methods = carClass.getMethods();
        Arrays.stream(methods).forEach(System.out::println);
        System.out.println("***Отримання конкретного методу");
        try {
            Method setMetodeName = carClass.getMethod("setModel", String.class);
            System.out.println("Запуск методу");
            Car car1 = new Car();
            setMetodeName.invoke(car1, "Mitsubishi");
            System.out.println(car1.getModel());

        } catch (NoSuchMethodException | InvocationTargetException | IllegalAccessException e) {
            throw new RuntimeException(e);
        }


        System.out.println("***Конструктори");
        System.out.println("***Всі Конструктори");
        Constructor[] constructors = carClass.getConstructors();
        Arrays.stream(constructors).forEach(System.out::println);



    }
}
