package l27DesignPaterns.HomeWork27.proxy;

public class Proxy implements Car{

    Car car = new Lexus();

    @Override
    public void drive() {
        System.out.println("Proxy functional");
        car.drive();

    }

}
