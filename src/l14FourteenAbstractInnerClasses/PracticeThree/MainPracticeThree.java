package l14FourteenAbstractInnerClasses.PracticeThree;

public class MainPracticeThree {

    public static void main(String[] args){

        AirPlane AirPlane1 = new AirPlane();
        BirdObject Bird = new BirdObject();

        System.out.println("*** AirPlane ***");
        AirPlane1.turnOnEngine();
        AirPlane1.takeOff();
        AirPlane1.fly();
        AirPlane1.steer();
        AirPlane1.land();

        System.out.println("*** Little Bird ***");
        Bird.takeOff();
        Bird.fly();
        Bird.land();
        Bird.nest();
    }


}
