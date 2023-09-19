package l32JDBC.homework.modelstud;



public class Student {

    private static String id;
    private static String name;
    private static String surname;
    private static Integer year;

    public static String getId() {
        return id;
    }

    public static void setId(String id) {
        Student.id = id;
    }

    public static String getName() {
        return name;
    }

    public static void setName(String name) {
        Student.name = name;
    }

    public static String getSurname() {
        return surname;
    }

    public static void setSurname(String surname) {
        Student.surname = surname;
    }

    public static Integer getYear() {
        return year;
    }

    public static void setYear(Integer year) {
        Student.year = year;
    }


    public Student() {
        super();
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public String toString() {
        return "Student{}";
    }
}



