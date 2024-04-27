package l33JavaCoreFinal.homeWork33.db;

import l33JavaCoreFinal.homeWork33.entity.Note;
import java.util.List;

public interface NoteDAO {

    Note findById(Integer id);

    Note update(Note note);

    Note save(Note note);

    Note delete(Note note);

    List<Note> findAll();

}
