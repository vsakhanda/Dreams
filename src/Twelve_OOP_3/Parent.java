package Twelve_OOP_3;

public class Parent {

    static {
        System.out.println("Static Parent Metod");
    }

    {
        System.out.println("Instance block code Parent Method");
    }
    public Parent ()
    {
        System.out.println("Parent Constructor");
    }
    public Parent(String name) {
        System.out.println("Parent Constructor with name");
        this.name = name;
    }
    private String name;
    private String surmane;
    private String age;


}
