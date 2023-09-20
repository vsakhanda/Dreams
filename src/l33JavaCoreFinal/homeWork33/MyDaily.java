package l33JavaCoreFinal.homeWork33;

/*
1. Створити щоденник
2. Щоденник повинен вміти - додавати / видаляти / оновлювати їх
3. Нотатка мала б мати автора і час коли була додана
*/

import l33JavaCoreFinal.homeWork33.service.NoteService;
import l33JavaCoreFinal.homeWork33.service.NoteServiceImpl;

import java.sql.SQLException;

public class MyDaily {

    public static void main(String[] args) throws SQLException{

        NoteService noteService = new NoteServiceImpl();
        noteService.findAll();
    }


}
