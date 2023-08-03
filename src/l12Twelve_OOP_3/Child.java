package l12Twelve_OOP_3;

public class Child extends Parent {

    static {
        System.out.println("Static Child Method");
    }

    {
        System.out.println("Instsnce block code child Method");
    }

    public Child(String childName) {
        System.out.println("Child Constructor");
        this.childName = childName;
    }

    private String childName;

}
