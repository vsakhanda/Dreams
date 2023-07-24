package EightArrays;

import java.util.Random;

public class EightLecture {

    private final static int range = 100;

    public static void main(String[] args) {
        String[] mainArray = new String[10];
        System.out.println(mainArray.length);

        Random random = new Random();
        for (int i=0; i<10; i++){
            mainArray[i] = String.valueOf(random.nextInt(range));
        }
        for (int i = 0; i<10; i++) {
        System.out.println(i);
        }

    }

}
