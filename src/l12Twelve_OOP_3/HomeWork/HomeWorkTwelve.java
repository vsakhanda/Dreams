package l12Twelve_OOP_3.HomeWork;

/*

Створити клас з усіма блоками для ініціалізації об’єкту в яких потрібно вивести на консоль числа - які відображають його порядковий номер ініціалізації
*/
public class HomeWorkTwelve {


    public static void main(String[] args) {

        childrenInitialize();
        parentInitialize();
    }

    public static void childrenInitialize() {
        ParentClass Object1 = new Children("ChildrenName for test");
        System.out.println("7. childrenInitialize in main method " + ((Children) Object1).childName);
    }

    public static void parentInitialize() {
        ParentClass Object2 = new ParentClass("Onion", "Surname", "29");
        System.out.println("10. parentInitialize in main method " + Object2.name) ;
    }
}
