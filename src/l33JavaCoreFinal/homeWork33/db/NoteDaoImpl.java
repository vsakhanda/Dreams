package l33JavaCoreFinal.homeWork33.db;

import l32JDBC.init.DatabaseConnection;
import l33JavaCoreFinal.homeWork33.constant.Queries;
import l33JavaCoreFinal.homeWork33.entity.Note;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class NoteDaoImpl implements NoteDAO{

    private final Connection connection;

    public NoteDaoImpl() throws SQLException {
        this.connection = DatabaseConnection.getInstance().getConnection();
        System.out.println(" Підключення до схеми: " + DatabaseConnection.getInstance().getConnection().getSchema());
    }

    @Override
    public Note findById(Integer id) {
        try (PreparedStatement preparedStatement = connection.prepareStatement(Queries.NOTE_FIND_BY_ID.getName())) {
            preparedStatement.setInt(1, id);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return null;
    }

    @Override
    public Note update(Note note) {
        try (PreparedStatement preparedStatement = connection.prepareStatement(Queries.NOTE_UPDATE.getName())) {
            preparedStatement.setString(1, note.getName());
            preparedStatement.setString(2, note.getText());
            preparedStatement.setString(3, note.getAuthor());
    //        preparedStatement.setDate(4, note.getDatetime());
            preparedStatement.setInt(5, note.getId());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return null;
    }

    @Override
    public Note save(Note note) {
        try (PreparedStatement preparedStatement = connection.prepareStatement(Queries.NOTE_INSERT.getName())) {
            preparedStatement.setString(1, note.getName());
            preparedStatement.setString(2, note.getText());
            preparedStatement.setString(3, note.getAuthor());
//            preparedStatement.setDate(4, note.getDatetime());

            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return null;
    }

    @Override
    public Note delete(Note note) {
        try (PreparedStatement preparedStatement = connection.prepareStatement(Queries.NOTE_DELETE.getName())) {
            preparedStatement.setInt(1, note.getId());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return null;
    }

    @Override
    public List<Note> findAll() {
        List<Note> notes = new ArrayList<>();
        System.out.println("Перевірка нотаток");
        try (Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery(Queries.NOTE_FIND_ALL.getName()))
        {
            while (resultSet.next()) {
                Note note = new Note();
                note.setId(resultSet.getInt("id"));
                note.setName(resultSet.getString("name"));
                note.setText(resultSet.getString("text"));
                note.setAuthor(resultSet.getString("author"));
                note.setDatetime(resultSet.getString("date"));
                notes.add(note);
            }
            System.out.println("Завершення перевірки нотаток");
            System.out.println(notes);

        }catch (SQLException e){
            throw new RuntimeException( e );
        }
        return notes;
    }
}
