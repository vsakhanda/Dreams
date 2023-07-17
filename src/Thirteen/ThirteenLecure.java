package Thirteen;

public class ThirteenLecure {

public static void main(String [] args){
    Animal Catus = new Cat();
    Animal Dogus = new Dog();


    Catus.setAnimalName("Catus");
    Dogus.setAnimalName("Dogus");
    Catus.bork();
    Dogus.bork();

    System.out.println(Catus.getAnimalName());
    System.out.println(Dogus.getAnimalName());

    Test test = new Test();
    test.whatisAnimal(Catus);
    test.whatisAnimal(Dogus);
    test.getAllNameOfAnimal();

}


}
