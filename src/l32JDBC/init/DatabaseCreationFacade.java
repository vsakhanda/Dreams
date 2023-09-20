package l32JDBC.init;

import l32JDBC.homework.initstud.StudentCreator;

public class DatabaseCreationFacade {

    private final DatabaseInitializer databaseInitializer;
    private final DepartmentCreator departmentCreator;
    private final UserCreator userCreator;
    private final StudentCreator studentCreator;


    public DatabaseCreationFacade() {
        System.out.println("Запуск ініціалізатора БД");
        this.databaseInitializer = new DatabaseInitializer();
        System.out.println("Запуск ініціалізатора Департаментів");
        this.departmentCreator = new DepartmentCreator();
        System.out.println("Запуск ініціалізатора Користувачів");
        this.userCreator = new UserCreator();
        System.out.println("Запуск ініціалізатора Користувачів");
        this.studentCreator = new StudentCreator();
    }

    public void createAndInsertDatabase(boolean create) {
        if(create) {
            System.out.println("Ініціалізація БД");
            databaseInitializer.createDatabase();
            System.out.println("Ініціалізація департаментів");
            departmentCreator.initialization();
            System.out.println("Ініціалізація користувачів");
            userCreator.initialization();
            System.out.println("Ініціалізація Студентів");
            studentCreator.initialization();
        }
    }


}
