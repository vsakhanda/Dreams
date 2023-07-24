package FourteenAbstractInnerClasses.Practice;

public class Rectangle implements GeometricShape{

    private int side_a;
    private int side_b;

    public Rectangle(int side_a, int side_b) {
        this.side_a = side_a;
        this.side_b = side_b;
    }

    @Override
    public void calculateArea() {
        System.out.println("Площа прямокутника - " + side_a*side_b );
    }

    @Override
    public void calculatePerimeter() {
        System.out.println("Периметр прямокутника - "+ 2*(side_a+side_b));

    }
}
