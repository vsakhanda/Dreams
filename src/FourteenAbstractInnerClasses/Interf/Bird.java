package FourteenAbstractInnerClasses.Interf;

public class Bird implements Animal {


    @Override
    public void eat() {
        System.out.println("The bird eats");
    }
    @Override
    public void sleep() {
        System.out.println("The bird dont sleep");
    }
//    @Override
//    public void breath() {
//        System.out.println("The bird breathes");
//    }
}
