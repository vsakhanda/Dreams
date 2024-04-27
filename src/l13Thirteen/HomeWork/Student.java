package l13Thirteen.HomeWork;

public abstract class Student {


    private String Name;
    private String Surname;
    private String age;

    public String getSurname() {
        return Surname;
    }
    public void setSurname(String surname) {
        Surname = surname;
    }
    public String getAge() {
        return age;
    }
    public void setAge(String age) {
        this.age = age;
    }
    public String getName() {return Name;}
    public void setName(String Name) {
        this.Name = Name;}

            ;
    public abstract void info();

}
