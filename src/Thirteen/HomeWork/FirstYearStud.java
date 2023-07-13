package Thirteen.HomeWork;

public class FirstYearStud extends Student{

    @Override
    public void info(){
        System.out.println("Student of first year");
        System.out.println("   Student name: " + getName() + " " + getSurname() +",  "+ getAge() + "year old");
    }
}
