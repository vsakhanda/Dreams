package l32JDBC.homework.initstud;

import l32JDBC.init.DatabaseConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class StudentCreator {

    private void createStudent() throws SQLException {
        Connection connection = DatabaseConnection.getInstance().getConnection();

        System.out.println("Створення Записів про студентів");

        String sql = "INSERT INTO students (name, surname, year) VALUES (?, ?, ?)";
        try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
            // Перші троє користувачів належать до департаменту IT (id=1)
            for (int i = 1; i <= 3; i++) {
                preparedStatement.setString(1, "User" + i);
                preparedStatement.setString(2, "Surname" + i);
                preparedStatement.addBatch();
            }

            preparedStatement.executeBatch();
        }
    }

    public void initialization () {
        try {
            createStudent();
            System.out.println("Students created successfully!");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
