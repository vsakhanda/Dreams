package l12Twelve_OOP_3.HomeWork;

public class ParentClass {


    static {
        System.out.println("1. Static Parent Metod");
    }

    {
        System.out.println("3. and 8. Instance block code Parent Method");
    }
    public ParentClass()
    {
        System.out.println("4. Parent Constructor");
    }
    public ParentClass(String name, String surname, String age) {
        System.out.println("9. Parent Constructor with name");
        this.name = name;
        this.surname = surname;
        this.age = age;
    }
    public String name;
    public String surname;
    public String age;





}
