package l30Threads2.NewThread.Executors;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class UtilConcurrencyExecotor {

public static void main(String[] args) {

    executorService();
    futureAndCallable();

}

    // Runnable
    private static void executorService() {
        ExecutorService executor = Executors.newFixedThreadPool(2);
        try {
            executor.submit(() -> System.out.println("Task 1"));
            executor.submit(() -> System.out.println("Task 2"));
        } finally {
            executor.shutdown();
        }
        // example with different type of tasks : Executor WithCallable
    };

    // Future and Callable

    private static void futureAndCallable() {
        ExecutorService executor = Executors.newFixedThreadPool(1);
        Future<Integer> future = executor.submit(() -> {
            Thread.sleep(1000);
            return 42;
        });

        executor.shutdown();
        try {
            System.out.println(future.get());
        }catch (InterruptedException | ExecutionException e){
            throw new RuntimeException(e);

        }

    }






}


