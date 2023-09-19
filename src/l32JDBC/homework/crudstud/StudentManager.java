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

        String sql = "INSERT INTO users (name, surname, department_id) VALUES (?, ?, ?)";

        try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
            preparedStatement.setString(1, student.getName());
            preparedStatement.setString(2, student.getSurname());
            preparedStatement.setInt(3, student.getYear());
            preparedStatement.executeUpdate();
        }
    }

    public void updateStudent(Student student) throws SQLException {
        Connection connection = DatabaseConnection.getInstance().getConnection();

        String sql = "UPDATE users SET name = ?, surname = ?, department_id = ? WHERE id = ?";

        try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
            preparedStatement.setString(1, student.getName());
            preparedStatement.setString(2, student.getSurname());
            preparedStatement.setInt(4, student.getYear());
            preparedStatement.executeUpdate();
        }
    }

    public void deleteStudent(int studentId) throws SQLException {
        Connection connection = DatabaseConnection.getInstance().getConnection();

        String sql = "DELETE FROM students WHERE id = ?";

        try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
            preparedStatement.setInt(1, studentId);
            preparedStatement.executeUpdate();
        }
    }

    public Student findStudentById(int userId) throws SQLException {
        Connection connection = DatabaseConnection.getInstance().getConnection();

        String sql = "SELECT u.id, u.name, u.surname, d.id as department_id, d.name as department_name " +
                "FROM users u " +
                "JOIN departments d ON u.department_id = d.id " +
                "WHERE u.id = ?";
        try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
            preparedStatement.setInt(1, userId);
            ResultSet resultSet = preparedStatement.executeQuery();
        }
        return null; // повертаємо null, якщо користувача не знайдено
    }



}
