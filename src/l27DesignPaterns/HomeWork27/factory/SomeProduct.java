package l27DesignPaterns.HomeWork27.factory;

public class SomeProduct implements Product{

    @Override
    public void create() {
        System.out.println("was created");
    }

}
