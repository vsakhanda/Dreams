package Fourteen.Interf;

public class Square implements Draw, Rotate {
    @Override
    public void draw(){
        System.out.println("Draw a square");
    }
    @Override
    public void rotate(){
        System.out.println("Rotate a square");
    }
}
