package Fourteen.PracticeThree;

public class BirdObject implements FlyingObject{

    @Override
    public void takeOff() {
        System.out.println("Пташка злітає");

    }

    @Override
    public void land() {
        System.out.println("Пташка приземлюється");
    }

    @Override
    public void fly() {
        System.out.println("Пташка летить");
    }

    public void nest(){
        System.out.println("Пташка гніздиться");
    }

}
