package Eleven.HomeWork;
//
//1. Створити клас автомобіль та 2 його потомки: легковий та вантажний
//
//2. У кожному класі повинен бути перевизначений метод, який повертає тип автомобіля

public class Vehicle {


    public void type() {
        System.out.println("Тип автомобіля");
    }


    public static void main(String[] args) {

        Vehicle vehicle1 = new Vehicle();
        Vehicle vehicle2 = new Truck();
        Vehicle vehicle3 = new Car();

        vehicle1.type();
        vehicle2.type();
        vehicle3.type();

    }
}

