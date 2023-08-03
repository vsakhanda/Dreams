package l11ElevenOOP_2.HomeWork;

public class AutoPark {


    public static void main(String[] args) {

        AutoPark.info();
        Vehicle auto1 = new Vehicle();
        Vehicle auto2 = new Truck();
        Vehicle auto3 = new Car();

        auto1.type();
        auto2.type();
        auto3.type();

        auto3.wheels(); //Імплементація методу з класу, який наслідується.

        System.out.println(auto2 instanceof Vehicle);
        System.out.println(auto3 instanceof Vehicle);

    }

    public static void info(){
        System.out.println("Перелік типі автомобілів в автопарку, з використанням мехінзму наслідування Override");

    }

}
