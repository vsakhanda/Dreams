package l14FourteenAbstractInnerClasses.Interf;

public class Triangle implements Draw, Rotate {
    @Override
    public void draw() {
        System.out.println("Draw a triangle");
    }
    @Override
    public void rotate() {
        System.out.println("Rotate a triangle");
    }
}
