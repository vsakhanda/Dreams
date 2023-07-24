package FourteenAbstractInnerClasses.Interf;

public class Interfaces {

    public static void main(String[] args) {
        Draw[] shapes = new Draw[] {
                new Circle(),
                new Square(),
                new Triangle()
        };
        for(Draw shape: shapes) {
            shape.draw();
        }

        Rotate[] shapes1 = new Rotate[] {
                new Circle(),
                new Square(),
                new Triangle()
        };
        for(Rotate shape: shapes1) {
            shape.rotate();
        }

        Nature DOG = new Dog();
        Animal Cat = new Cat();
        Animal Bird = new Bird();

        DOG.eat();
        DOG.sleep();
        DOG.breath();
        Cat.eat();
        Cat.sleep();
        Bird.eat();
        Bird.sleep();

    }
}
