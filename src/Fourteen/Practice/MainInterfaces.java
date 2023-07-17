package Fourteen.Practice;

public class MainInterfaces {

    public static void main(String[] args){

        GeometricShape Shape1 = new Circle(6);
        GeometricShape Shape2 = new Rectangle(4, 6);

        Shape1.calculateArea();
        Shape1.calculatePerimeter();
        Shape2.calculateArea();
        Shape2.calculatePerimeter();

    }





}
