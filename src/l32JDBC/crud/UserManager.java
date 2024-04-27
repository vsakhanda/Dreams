package l32JDBC.crud;

import l32JDBC.init.DatabaseConnection;
import l32JDBC.model.Department;
import l32JDBC.model.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserManager {


    public void insertUser(User user) throws SQLException {
        Connection connection = DatabaseConnection.getInstance().getConnection();

        String sql = "INSERT INTO users (name, surname, department_id) VALUES (?, ?, ?)";

        try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
            preparedStatement.setString(1, user.getName());
            preparedStatement.setString(2, user.getSurname());
            preparedStatement.setInt(3, user.getDepartment().getId());
            preparedStatement.executeUpdate();
        }
    }

    public void updateUser(User user) throws SQLException {
        Connection connection = DatabaseConnection.getInstance().getConnection();

        String sql = "UPDATE users SET name = ?, surname = ?, department_id = ? WHERE id = ?";

        try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
            preparedStatement.setString(1, user.getName());
            preparedStatement.setString(2, user.getSurname());
            preparedStatement.setInt(3, user.getDepartment().getId());
            preparedStatement.setInt(4, user.getId());
            preparedStatement.executeUpdate();
        }
    }

    public void deleteUser(int userId) throws SQLException {
        Connection connection = DatabaseConnection.getInstance().getConnection();

        String sql = "DELETE FROM users WHERE id = ?";

        try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
            preparedStatement.setInt(1, userId);
            preparedStatement.executeUpdate();
        }
    }

    /*
    PreparedStatement - це інтерфейс в JDBC, який дозволяє вам виконувати параметризовані SQL-запити.
    Він дуже схожий на Statement, але має додаткові переваги:

    Безпека: Захищає від SQL-ін'єкцій, оскільки ви використовуєте плейсхолдери (?),
    які автоматично екранують вхідні дані.
    Продуктивність: Деякі бази даних можуть кешувати PreparedStatement,
    що покращує продуктивність повторних запитів.
    Зручність: Дозволяє вам встановлювати значення параметрів за допомогою методів,
     таких як setString(), setInt() тощо.
     */
    public User findUserById(int userId) throws SQLException {
        Connection connection = DatabaseConnection.getInstance().getConnection();

        String sql = "SELECT u.id, u.name, u.surname, d.id as department_id, d.name as department_name " +
                "FROM users u " +
                "JOIN departments d ON u.department_id = d.id " +
                "WHERE u.id = ?";

        try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
            preparedStatement.setInt(1, userId);
            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                Department department = new Department();
                department.setId(resultSet.getInt("department_id"));
                department.setName(resultSet.getString("department_name"));

                User user = new User();
                user.setId(resultSet.getInt("id"));
                user.setName(resultSet.getString("name"));
                user.setSurname(resultSet.getString("surname"));
                user.setDepartment(department);
                return user;
            }
        }
        return null; // повертаємо null, якщо користувача не знайдено
    }

    /*
    Різниця між Statement та PreparedStatement
    Безпека: PreparedStatement є безпечнішим завдяки захисту від SQL-ін'єкцій.
    Продуктивність: PreparedStatement може бути швидшим у деяких випадках завдяки можливості кешування.
    Зручність: PreparedStatement дозволяє вам використовувати плейсхолдери
    та методи для встановлення значень параметрів.
     */

}
