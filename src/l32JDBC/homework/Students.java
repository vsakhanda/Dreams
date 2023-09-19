package l32JDBC.homework;

import l32JDBC.fetch.UserWithDepartmentFetcher;
import l32JDBC.init.DatabaseCreationFacade;
import l32JDBC.model.Department;
import l32JDBC.model.User;
import l32JDBC.service.DepartmentService;
import l32JDBC.service.UserService;

import java.sql.SQLException;
import java.util.List;

public class Students {



    DatabaseCreationFacade databaseCreationFacade = new DatabaseCreationFacade();

        databaseCreationFacade.createAndInsertDatabase(false);
        System.out.println("Перевірка фасаду для створення бази");

    l32JDBC.fetch.UserWithDepartmentFetcher UserWithDepartmentFetcher = new UserWithDepartmentFetcher();

        try {
        List<User> userList = UserWithDepartmentFetcher.fetchUsersWithDepartments();
        System.out.println("Перелік покристувачів");
        System.out.println(userList);
        UserService userService = new UserService();
        User user = userService.getUserById(1);
        System.out.println(user);
        DepartmentService departmentService = new DepartmentService();
        Department department = departmentService.getDepartmentById(1);
        System.out.println("Перелік Департаментів");
        System.out.println(department);
    } catch (
    SQLException e) {
        throw new RuntimeException("Помилка sql " + e);
    }


    // Перевіряємо наявність БД
    // Перевіряємо наявність таблиці
    // Виконуємо запис елементів
    // Виконуємо читання елементів
    // Закриваємо з'єднання


}
