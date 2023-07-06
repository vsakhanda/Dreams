package Eleven.HomeWork;

public class Car extends Vehicle {

    public Car() {
        super();
    }


    @Override
    public void type() {
        System.out.println("Type is Car класу Car, який унаслідуваний від класу Vehicle (Car extends Vehicle)");
    }

}
