package l32JDBC.init;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseInitializer {

    private void initializeDatabase() throws SQLException {
        Connection connection = DatabaseConnection.getInstance().getConnection();

        System.out.println("Перевірка таблиць");

        try (Statement statement = connection.createStatement()) {
            System.out.println("Створення Департаментів");
            // Створення таблиці departments
            statement.execute(
                    "CREATE TABLE IF NOT EXISTS departments (" +
                            "id INT AUTO_INCREMENT PRIMARY KEY," +
                            "name VARCHAR(255) NOT NULL" +
                            ")"
            );


            System.out.println("Створення Користувачів");
            // Створення таблиці users
            statement.execute(
                    "CREATE TABLE IF NOT EXISTS users (" +
                            "id INT AUTO_INCREMENT PRIMARY KEY," +
                            "name VARCHAR(255) NOT NULL," +
                            "surname VARCHAR(255) NOT NULL," +
                            "department_id INT," +
                            "FOREIGN KEY (department_id) REFERENCES departments(id)" +
                            ")"
            );

        }
    }

        public void createDatabase() {
            try {
                initializeDatabase();
                System.out.println("Database and tables created successfully!");
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

}
