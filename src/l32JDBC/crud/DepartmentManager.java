package l32JDBC.crud;

import l32JDBC.init.DatabaseConnection;
import l32JDBC.model.Department;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DepartmentManager {

    public void insertDepartmant(Department department) throws SQLException {
        Connection connection = DatabaseConnection.getInstance().getConnection();

        String sql = "INSERT INTO departments (name) VALUES (?)";

        try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
            preparedStatement.setString(1, department.getName());
            preparedStatement.executeUpdate();
        }
    }


    public void updateDepartment(Department department) throws SQLException {
        Connection connection = DatabaseConnection.getInstance().getConnection();

        String sql = "UPDATE departments SET name = ? WHERE id = ?";

        try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
            preparedStatement.setString(1, department.getName());
            preparedStatement.setInt(2, department.getId());
            preparedStatement.executeUpdate();
        }
    }

    public void deleteDepartment(int departmentId) throws SQLException {
        Connection connection = DatabaseConnection.getInstance().getConnection();

        String sql = "DELETE FROM departments WHERE id = ?";

        try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
            preparedStatement.setInt(1, departmentId);
            preparedStatement.executeUpdate();
        }
    }

    public Department findDepartmentById(int departmentId) throws SQLException {
        Connection connection = DatabaseConnection.getInstance().getConnection();

        String sql = "SELECT * FROM departments WHERE id = ?";

        try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
            preparedStatement.setInt(1, departmentId);
            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                Department department = new Department();
                department.setId(resultSet.getInt("id"));
                department.setName(resultSet.getString("name"));
                return department;
            }
        }
        return null; // повертаємо null, якщо департамент не знайдено
    }

}
