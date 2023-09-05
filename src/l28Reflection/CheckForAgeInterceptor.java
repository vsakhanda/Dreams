package l28Reflection;

import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Objects;

public class CheckForAgeInterceptor {

        public void checkYearValidation(Object object) throws CheckForAgeException {
            checkIfSerializable(object);
            validateAge(object);
        }
// Чи може бути об'єкт серіалізований
        private void checkIfSerializable(Object object) throws CheckForAgeException {
            if (Objects.isNull(object)) {
                throw new CheckForAgeException("Can't validate a null object");
            }

            Class<?> clazz = object.getClass();
            if (!clazz.isAnnotationPresent(ShouldBeValidated.class)) {
                throw new CheckForAgeException("The class " + clazz.getSimpleName() + " is not annotated with ShouldBeValidated");
            }
        }

        private void validateAge(Object object) {
            Class<?> clazz = object.getClass();
            Arrays.stream(clazz.getDeclaredFields()).forEach(
                    field -> {
                        field.setAccessible(true);  // поле видиме для рефлексії
                        if (field.isAnnotationPresent(CheckForAge.class) && field.getAnnotation(CheckForAge.class).validate()) { // якщо над філдом є аннотація, то ми викликаємо метод validate
                            try {
                                int age = (Integer) field.get(object);
                                validateHumanAge(age, field);
                            } catch (IllegalAccessException | CheckForAgeException e) {
                                throw new RuntimeException(e);
                            }
                        }
                    }
            );
        }

        private void validateHumanAge(int age, Field field) throws CheckForAgeException {
            if(age < 1 || age > 100) {
                throw new CheckForAgeException("age is not related to human" + field.getDeclaringClass().getTypeName() + " " + age);
            }
        }
    }

