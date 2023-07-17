package Fourteen.PracticeThree;

public class AirPlane implements Steerable {
    @Override
    public void takeOff() {
        System.out.println("Літак піднимається в повітря");
    }

    @Override
    public void land() {
        System.out.println("Літак здійснює посадку");
    }

    @Override
    public void fly() {
        System.out.println("Літак летить");
    }

    @Override
    public void steer() {
        System.out.println("Літак змінює напрямок руху");
    }

    public void turnOnEngine() {
        System.out.println("Літак виконує запуск двигуна");
    }

}
