package l30Threads2.NewThread.Executors;

import java.util.concurrent.*;

public class ExecutorWithCallable {

    public static void main(String[] args) {


        ExecutorService executor = Executors.newFixedThreadPool(2);

        // завдання, яке триває 2 секунди
        Runnable longRunningTask = () -> {
            try {
                Thread.sleep(1000);
                System.out.println("Completed long running task");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        };
        // завдання, яке повертає результат
        Callable<String> taskWithResult = ( ) -> {
            Thread.sleep(1000);
            return "Result from callable";
        };
        try {
            executor.execute(longRunningTask);
            Future<String> future = executor.submit(taskWithResult);
            String result = future.get();
            System.out.println(result);

        } catch (InterruptedException | ExecutionException e ) {
            e.printStackTrace();
        } finally {
            executor.shutdown();
        }

    }

}
