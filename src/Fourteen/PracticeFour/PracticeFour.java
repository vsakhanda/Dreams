package Fourteen.PracticeFour;

public class PracticeFour {

    public static void main(String[] args){
        Student vladyslav = new Student("Vladyslav", 4.7f);
        Student alex = new Student("Alex", 4.6f);
        Student oleh = new Student("Oleh", 4.6f);

        vladyslav.compareTo(alex);
        oleh.compareTo(vladyslav);
    }
}
