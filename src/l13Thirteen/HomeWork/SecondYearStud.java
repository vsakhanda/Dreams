package l13Thirteen.HomeWork;

public class SecondYearStud extends Student  {

    @Override
    public void info(){
        System.out.println("Student of Second year");
        System.out.println("   Student name: " + getName() + " " + getSurname() +",  "+ getAge() + "year old");
    }
}

