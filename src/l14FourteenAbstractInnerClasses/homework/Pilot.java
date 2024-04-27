package l14FourteenAbstractInnerClasses.homework;

public class Pilot extends Human implements Fly{


    @Override
    public void wakeUp(){
        System.out.println("Пілот прокинувся");
    }
    @Override
    public void toFly() {
        System.out.println("Пілот готовий до польоту");

    }
}
