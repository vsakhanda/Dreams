package l32JDBC.init;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseConnection {

    private static volatile DatabaseConnection instance;
    private Connection connection;

    private DatabaseConnection() throws SQLException {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String user = "root";
            String password = "00000000";
            String base_url = "jdbc:mysql://localhost:3306/";

            System.out.println("Зв'язок з сервером встановлено");

            //Підключення без уточнення схеми
            Connection initialConnection = DriverManager.getConnection(base_url, user, password);
            String dbName = "robot_dreams";

            System.out.println("Перевірка бази");

            try (Statement statement = initialConnection.createStatement()) {
                statement.execute("CREATE DATABASE IF NOT EXISTS " + dbName);
            }
            initialConnection.close();

            //Підключення до вже існуючої бази
            String url = base_url + dbName;
            this.connection = DriverManager.getConnection(url, user, password);
        } catch (ClassNotFoundException e) {
            System.out.println("Database Connection Creation Failed : " + e.getMessage());
        }

    }

        public static DatabaseConnection getInstance() throws SQLException {
            if (instance == null) {
                synchronized (DatabaseConnection.class) {
                    if (instance == null) {
                        instance = new DatabaseConnection();
                    }
                }
            } else if (instance.getConnection().isClosed()) {
                synchronized (DatabaseConnection.class) {
                    if (instance == null || instance.getConnection().isClosed()) {
                        instance = new DatabaseConnection();
                    }
                }
            }
            return instance;
        }

        public Connection getConnection() {return connection; }

}
