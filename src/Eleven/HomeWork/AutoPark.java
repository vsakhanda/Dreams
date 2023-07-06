package Eleven.HomeWork;

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

    }

    public static void info(){
        System.out.println("Перелік типі автомобілів в автопарку, з використанням мехінзму наслідування Override");

    }

}
