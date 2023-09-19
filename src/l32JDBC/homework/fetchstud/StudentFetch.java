package l32JDBC.homework.fetchstud;

import l32JDBC.homework.modelstud.Student;
import l32JDBC.init.DatabaseConnection;


import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class StudentFetch {

    public List<Student> fetchUsersWithDepartments() throws SQLException {
        List<Student> users = new ArrayList<>();

        Connection connection = DatabaseConnection.getInstance().getConnection();

        String sql = "SELECT s.id as stud_id, s.name as stud_name, s.surname as stud_surname, s.year as stud_year " +
                "FROM students s ";

        /*
        Statement - це інтерфейс в JDBC, який дозволяє вам виконувати SQL-запити до бази даних.
         */
        try (Statement statement = connection.createStatement();
             /*
             ResultSet - це об'єкт, який містить результати SQL-запиту.
             Ви можете перебирати результати за допомогою методу next() та
             отримувати значення за допомогою методів, таких як getString(), getInt() тощо.
              */
             ResultSet resultSet = statement.executeQuery(sql)) {

            while (resultSet.next()) {

                Student student = new Student();
                student.setId(String.valueOf(resultSet.getInt("stud_id")));
                student.setName(resultSet.getString("stud_name"));
                student.setSurname(resultSet.getString("stud_surname"));
                student.setYear(resultSet.getInt("stud_year"));
                users.add(student);
            }
        }

        return users;
    }



}
