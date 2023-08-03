package l11ElevenOOP_2.HomeWork;

public class Truck extends Vehicle {

    String type = "Truck";
    @Override
    public void type() {
        System.out.println("Type is "+ type + " для класу Truck, який унаслідуваний від класу Vehicle (Truck extends Vehicle)");
    }
}
