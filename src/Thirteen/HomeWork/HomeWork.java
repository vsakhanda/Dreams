package Thirteen.HomeWork;


//Створити набір класів який описує студентів та викладачів за допомогою абстракції
public class HomeWork {

    public static void main(String[] args){



        Lecturer professor = new Lecturer();
        professor.setName("Oleksandr");
        professor.setSurname("Prokopchuk");
        Student first = new FirstYearStud();
        first.setName("Andrew");
        first.setSurname("Andjushchenko");
        first.setAge("19");
        Student second = new SecondYearStud();
        second.setName("George");
        second.setSurname("Smith");
        second.setAge("21");
        professor.describe();
        first.info();
        second.info();
    }
}


