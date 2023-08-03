package l12Twelve_OOP_3.HomeWork;

public class Children extends ParentClass {

    static {
        System.out.println("2. Static Child Method");
    }

    {
        System.out.println("5. Instsnce block code child Method");
    }

    public Children(String childName) {
        System.out.println("6. Child Constructor");
        this.childName = childName;
    }

    public String childName;


}
