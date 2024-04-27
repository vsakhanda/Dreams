package l28Reflection.homework28;


import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Objects;

public class CheckYearInterceptor {

    public void checkYearValidation(Object object) throws CheckYearException {
        checkIfSerializable(object);
        validateYear(object);
    }
    // Чи може бути об'єкт серіалізований
    private void checkIfSerializable(Object object) throws CheckYearException {
        if (Objects.isNull(object)) {
            throw new CheckYearException("Can't validate a null object");
        }

        Class<?> clazz = object.getClass();
        if (!clazz.isAnnotationPresent(ClassValidation.class)) {
            throw new CheckYearException("The class " + clazz.getSimpleName() + " is not annotated with ShouldBeValidated");
        }
    }

    private void validateYear(Object object) {
        Class<?> clazz = object.getClass();
        Arrays.stream(clazz.getDeclaredFields()).forEach(
                field -> {
                    field.setAccessible(true);  // поле видиме для рефлексії
                    if (field.isAnnotationPresent(CheckYear.class) && field.getAnnotation(CheckYear.class).validate()) { // якщо над філдом є аннотація, то ми викликаємо метод validate
                        try {
                            int age = (Integer) field.get(object);
                            validateCarYear(age, field);
                        } catch (IllegalAccessException | CheckYearException e) {
                            throw new RuntimeException(e);
                        }
                    }
                }
        );
    }

    private void validateCarYear(int year, Field field) throws CheckYearException {
        if(year < 1900 || year > 2023) {
            throw new CheckYearException("Year is not correct" + field.getDeclaringClass().getTypeName() + " " + year);
        }
    }
}
