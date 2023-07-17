package Fourteen.Practice;

public class Circle implements GeometricShape{

    private int Radius;

    public Circle(int radius) {
        this.Radius = radius;
    }

    @Override
    public void calculateArea() {
        System.out.println("Площа кола - " +  3.14 * Radius * Radius);

    }

    @Override
    public void calculatePerimeter() {
        System.out.println("Периметр кола - " + 2*3.14*Radius);
    }
}
