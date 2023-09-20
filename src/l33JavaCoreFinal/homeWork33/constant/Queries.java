package l33JavaCoreFinal.homeWork33.constant;

public enum Queries {

    NOTE_INSERT("INSERT INTO users (name, surname, department_id) VALUES (?, ?, ?)"),
    NOTE_UPDATE("UPDATE users SET name = ?, surname = ?, department_id = ? WHERE id = ?"),
    NOTE_DELETE("DELETE FROM users WHERE id = ?"),
    NOTE_FIND_BY_ID("SELECT u.id, u.name, u.surname, d.id as department_id, d.name as department_name " +
            "FROM users u " +
            "JOIN departments d ON u.department_id = d.id " +
            "WHERE u.id = ?"),
    NOTE_FIND_ALL("SELECT u.id as user_id, u.name as user_name, u.surname, d.id as department_id, d.name as department_name " +
            "FROM users u " +
            "JOIN departments d ON u.department_id = d.id"),

    NOTE_FIND_All( "SELECT u.id as user_id, u.name as user_name, u.surname, d.id as department_id, d.name as department_name "+
                               "FROM users u "+
                               "JOIN departments d ON u.department_id = d.id")
            ;
    private String name;

    Queries(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }


}
