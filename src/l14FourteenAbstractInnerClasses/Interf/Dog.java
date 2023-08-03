package l14FourteenAbstractInnerClasses.Interf;

public class Dog implements Nature{


    @Override
    public void eat() {
        System.out.println("The dog eats");

    }

    @Override
    public void sleep() {
        System.out.println("The dog sleep");
    }

    @Override
    public void breath() {
        System.out.println("The dog breathes");

    }
}
