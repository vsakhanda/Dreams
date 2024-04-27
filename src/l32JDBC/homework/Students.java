package l32JDBC.homework;

import l32JDBC.homework.fetchstud.StudentFetch;
import l32JDBC.homework.modelstud.Student;
import l32JDBC.homework.servicestud.StudentService;
import l32JDBC.init.DatabaseCreationFacade;

import java.sql.SQLException;
import java.util.List;

public class Students {

public static void main(String[] args) {

    DatabaseCreationFacade databaseCreationFacade = new DatabaseCreationFacade();

    databaseCreationFacade.createAndInsertDatabase(false);
    System.out.println("Перевірка фасаду для створення бази");

    StudentFetch fetchStudentWithDepartments = new StudentFetch();

    try {
        List<Student> studentList = fetchStudentWithDepartments.fetchStudentWithDepartments();
        System.out.println("Перелік студентів");
        System.out.println(studentList);
        System.out.println("Створення студентів");
        StudentService studentService = new StudentService();
        Student student = studentService.getStudentById(1);
        System.out.println(student);
        System.out.println(studentList);

    } catch (
            SQLException e) {
        throw new RuntimeException(e);
    }


}


    // Перевіряємо наявність БД
    // Перевіряємо наявність таблиці
    // Виконуємо запис елементів
    // Виконуємо читання елементів
    // Закриваємо з'єднання


}
