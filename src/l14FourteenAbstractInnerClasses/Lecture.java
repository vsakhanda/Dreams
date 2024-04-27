package l14FourteenAbstractInnerClasses;

public class Lecture {

    public static void main(String[] args) {
        MediaPlayer cdPlayer = new CD();
        MediaPlayer dvdPlayer = new DVD();

        cdPlayer.play();
        dvdPlayer.play();

    }
}
