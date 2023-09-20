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

    public List<Student> fetchStudentWithDepartments() throws SQLException {
        List<Student> users = new ArrayList<>();

        Connection connection = DatabaseConnection.getInstance().getConnection();

        String sql = "SELECT name as stud_name, surname as stud_surname, year as stud_year " +
                "FROM students";

        try (Statement statement = connection.createStatement();

             ResultSet resultSet = statement.executeQuery(sql)) {

            while (resultSet.next()) {

                Student student = new Student();

                student.setName(resultSet.getString("stud_name"));
                student.setSurname(resultSet.getString("stud_surname"));
                student.setYear(resultSet.getInt("stud_year"));
                users.add(student);
            }
        }

        return users;
    }



}
