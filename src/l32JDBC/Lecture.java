package l32JDBC;


/*

Структура БД
Схема - це бд
Таблиці
Колонки - реквізити
Індексів
Процедур
*/


/*
  package init :
    DatabaseConnection - to create connection and database schema
    DatabaseInitializer - to create tables (user and department)
    UserCreator - to create users
    DepartmentCreator - to create departments
  package model :
    User - model of user (the same as in database)
    Department - model of department (the same as in database)
  package crud :
    UserManager - Create / Read / Update / Delete user
    DepartmentManager - Create / Read / Update / Delete user
  package fetch :
    UserWithDepartmentFetcher - to fetch all Users with Departments and information regarding JDBC classes
  package transactional :
    TransactionalInfo - class with information regarding transactions
    TransactionalExample - class with example how to run custom transaction
 */


import l32JDBC.fetch.UserWithDepartmentFetcher;
import l32JDBC.init.DatabaseCreationFacade;
import l32JDBC.model.Department;
import l32JDBC.model.User;
import l32JDBC.service.DepartmentService;
import l32JDBC.service.UserService;

import java.sql.SQLException;
import java.util.List;

public class Lecture {
    public static void main(String[] args) {

        DatabaseCreationFacade databaseCreationFacade = new DatabaseCreationFacade();

        databaseCreationFacade.createAndInsertDatabase(false);
        System.out.println("Перевірка фасаду для створення бази");

        UserWithDepartmentFetcher UserWithDepartmentFetcher = new UserWithDepartmentFetcher();

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
        } catch (SQLException e) {
            throw new RuntimeException("Помилка sql " + e);
        }


    }





}
