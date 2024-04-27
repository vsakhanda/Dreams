package l32JDBC.homework.crudstud;


import l32JDBC.homework.modelstud.Student;
import l32JDBC.init.DatabaseConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class StudentManager {

    public void insertStudent(Student student) throws SQLException {
        Connection connection = DatabaseConnection.getInstance().getConnection();

        String sql = "INSERT INTO students (name, surname, year) VALUES (?, ?, ?)";

        try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
            preparedStatement.setString(1, student.getName());
            preparedStatement.setString(2, student.getSurname());
            preparedStatement.setInt(3, student.getYear());
            preparedStatement.executeUpdate();
        }
    }

    public void updateStudent(Student student) throws SQLException {
        Connection connection = DatabaseConnection.getInstance().getConnection();

        String sql = "UPDATE students SET name = ?, surname = ?, year = ? WHERE id = ?";

        try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
            preparedStatement.setString(1, student.getName());
            preparedStatement.setString(2, student.getSurname());
            preparedStatement.setInt(4, student.getYear());
            preparedStatement.executeUpdate();
        }
    }

    public void deleteStudent(int id) throws SQLException {
        Connection connection = DatabaseConnection.getInstance().getConnection();

        String sql = "DELETE FROM students WHERE id = ?";

        try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
            preparedStatement.setInt(1, id);
            preparedStatement.executeUpdate();
        }
    }

    public Student findStudentById(int id) throws SQLException {
        Connection connection = DatabaseConnection.getInstance().getConnection();

        String sql = "SELECT id, name, surname, year " +
                "FROM students " +
                "WHERE id = ?";
        try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
            preparedStatement.setInt(1, id);
            ResultSet resultSet = preparedStatement.executeQuery();
        }
        return null; // повертаємо null, якщо користувача не знайдено
    }



}
