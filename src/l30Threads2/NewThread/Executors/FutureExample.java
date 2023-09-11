package l30Threads2.NewThread.Executors;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class FutureExample {


    public static void main(String[] args) throws ExecutionException, InterruptedException {
// Перший асинхронний потік, який повертає 5
        CompletableFuture<Integer> future1 = CompletableFuture.supplyAsync(() -> 5);

        // Другий асинхронний потік, який повертає 3
        CompletableFuture<Integer> future2 = CompletableFuture.supplyAsync(() -> 3);

        // Комбінуємо результати двох потоків: 5 + 3 = 8
        CompletableFuture<Integer> combinedFuture = future1.thenCombine(future2, (result1, result2) -> result1 + result2);

        int finalResult = combinedFuture.get();  // Отримання комбінованого результату
        System.out.println(finalResult);  // Виведе 8
    }

    /*
    CompletableFuture.supplyAsync створює асинхронний потік для виконання завдання.
    За замовчуванням він використовує ForkJoinPool.commonPool(), який є загальним пулом потоків для асинхронних завдань у Java.
    Проте, якщо ви хочете використовувати свій власний ExecutorService, ви можете передати його як другий аргумент до supplyAsync.
    Наприклад:
     */
    private static void customExecutorService() {
        ExecutorService customExecutor = Executors.newFixedThreadPool(2);
        CompletableFuture<Integer> future = CompletableFuture.supplyAsync(() -> 5, customExecutor);
    }

}
