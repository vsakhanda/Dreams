package l14FourteenAbstractInnerClasses.homework;

public class Driver extends Human implements Drive {

    @Override
    public void wakeUp() {
        System.out.println("Водій прокинувся");
    }

    @Override
    public void toDrive() {
        System.out.println("Водій готовий до рейсу");

    }
}
