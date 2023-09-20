package l33JavaCoreFinal.homeWork33.constant;

public enum Queries {

    NOTE_INSERT("INSERT INTO notes (name, text, date, author) VALUES (?, ?, ?)"),
    NOTE_UPDATE("UPDATE notes SET name = ?, surname = ?, department_id = ? WHERE id = ?"),
    NOTE_DELETE("DELETE FROM notes WHERE id = ?"),
    NOTE_FIND_BY_ID("SELECT id, name, text, date, author " +
            "FROM notes" +
            "WHERE id = ?"),
    NOTE_FIND_ALL("SELECT id, name, text, date, author " +
            "FROM notes");
    private String name;

    Queries(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }


}
