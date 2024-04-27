package l27DesignPaterns.HomeWork27.factory;

public class SomeCreator extends Creator {


    @Override
    public Product factoryMethod() {
        System.out.println("Product");
        return new SomeProduct();
    }
}