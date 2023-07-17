package Fourteen.Interf;

public class Circle implements Draw, Rotate {
    @Override
    public void draw() {
        System.out.println("Draw a circle");
    }
    @Override
    public void rotate() {
        System.out.println("Rotate a circle");
    }
}
