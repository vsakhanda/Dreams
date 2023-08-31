package l27DesignPaterns.HomeWork27;


/*
1. Зробити реалізацію наступних патернів :
1.1. Фабрика
1.2. Сінглтон
2, Проксі
*/


import l27DesignPaterns.HomeWork27.factory.Creator;
import l27DesignPaterns.HomeWork27.factory.Product;
import l27DesignPaterns.HomeWork27.factory.SomeCreator;
import l27DesignPaterns.HomeWork27.proxy.Car;
import l27DesignPaterns.HomeWork27.proxy.Proxy;
import l27DesignPaterns.HomeWork27.singeton.Singleton;

public class homeWork27 {

    public static void main(String[] args) {

        Factory();     // 1.1.
  //  Single();      // 1.2.
 //   MainProxy();   // 1.3.


    }

//1.1. Фабрика
    public static void Factory() {
            Creator creator = new SomeCreator();
            Product product1 = creator.factoryMethod();
            Product product2 = creator.factoryMethod();
    }

        //1.2. Сінглтон
 public static void Single () {
     Singleton singleton = Singleton.getInstance();
     Singleton singleton12 = Singleton.getInstance();
     singleton.i = 50;
     System.out.println(singleton12.i);
 }

    //2, Проксі
    public static void MainProxy () {
        Car car = new Proxy();
        car.drive();
    }

}
