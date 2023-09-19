package l32JDBC.init;

public class DatabaseCreationFacade {

    private final DatabaseInitializer databaseInitializer;
    private final DepartmentCreator departmentCreator;
    private final UserCreator userCreator;


    public DatabaseCreationFacade() {
        System.out.println("Запуск ініціалізатора БД");
        this.databaseInitializer = new DatabaseInitializer();
        System.out.println("Запуск ініціалізатора Департаментів");
        this.departmentCreator = new DepartmentCreator();
        System.out.println("Запуск ініціалізатора Користувачів");
        this.userCreator = new UserCreator();
    }

    public void createAndInsertDatabase(boolean create) {
        if(create) {
            System.out.println("Ініціалізація БД");
            databaseInitializer.createDatabase();
            System.out.println("Ініціалізація департаментів");
            departmentCreator.initialization();
            System.out.println("Ініціалізація користувачів");
            userCreator.initialization();
        }
    }


}
