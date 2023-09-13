package l30Threads2.homeWork30;

import java.util.Random;
import java.util.concurrent.Callable;

public class ThreadCallable implements Callable {


    @Override
    public Object call() throws Exception {
        Random random = new Random();
        int number = random.nextInt(50);
        return number;
    }

}

