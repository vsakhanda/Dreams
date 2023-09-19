package l32JDBC.transactional;

/*
де ми хочемо додати новий департамент і декілька користувачів до цього департаменту.
Якщо під час додавання користувачів виникає помилка, ми хочемо скасувати всю транзакцію,
включаючи створення департаменту.
 */


//public class TransactionExample {

    /*
      У цьому прикладі ми використовуємо setAutoCommit(false) для початку транзакції.
      Після успішного додавання департаменту та користувачів ми викликаємо commit() для застосування змін.
      У разі будь-якої помилки ми викликаємо rollback() для скасування всіх змін у межах цієї транзакції.
     */

    /*

    public void addDepartmentWithUsers(Department department, User... users) {
        Connection connection = null;
        try {
            connection = DatabaseConnection.getInstance().getConnection();
            connection.setAutoCommit(false); // Вимикаємо автоматичний коміт
            // Встановлюємо рівень ізоляції
            connection.setTransactionIsolation(Connection.TRANSACTION_SERIALIZABLE);

            // Додаємо департамент
            String insertDepartmentSql = "INSERT INTO departments (name) VALUES (?)";
            try (PreparedStatement departmentStatement = connection.prepareStatement(insertDepartmentSql)) {
                departmentStatement.setString(1, department.getName());
                departmentStatement.executeUpdate();
            }

            // Додаємо користувачів
            String insertUserSql = "INSERT INTO users (name, surname, department_id) VALUES (?, ?, ?)";
            try (PreparedStatement userStatement = connection.prepareStatement(insertUserSql)) {
                for (User user : users) {
                    userStatement.setString(1, user.getName());
                    userStatement.setString(2, user.getSurname());
                    userStatement.setInt(3, department.getId()); // Припустимо, що ID департаменту встановлюється після вставки
                    userStatement.executeUpdate();
//                }
//            }

//            connection.commit(); // Застосовуємо зміни

        } catch (SQLException e) {
            if (connection != null) {
                try {
                    connection.rollback(); // Скасовуємо зміни у разі помилки
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }
            e.printStackTrace();
        } finally {
            if (connection != null) {
                try {
                    connection.setAutoCommit(true); // Повертаємо звичайний режим роботи
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }*/