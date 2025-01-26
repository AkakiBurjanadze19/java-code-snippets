package CONCURRENCY;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class CompletableFutureExample {
    public static void main(String[] args) {
        long started = System.currentTimeMillis();

        CompletableFuture<Integer> futureCount = createCompletableFuture();

        System.out.println("Took " + (started - System.currentTimeMillis()) + " milliseconds");

        try {
            int count = futureCount.get();
            System.out.println("CompletableFuture took " + (started - System.currentTimeMillis()) + " milliseconds");
            System.out.println("Result " + count);
        } catch (InterruptedException | ExecutionException e) {

        }

//        CompletableFuture<String> data = createCompletableFuture().thenApply((Integer count) -> {
//            int transformedValue = count * 10;
//            return transformedValue;
//        }).thenApply(transformed -> "Finally creates a string: " + transformed);
//
//        try {
//            System.out.println(data.get());
//        } catch (InterruptedException | ExecutionException e) {}
    }

    private static CompletableFuture<Integer> createCompletableFuture() {
        CompletableFuture<Integer> futureCount = CompletableFuture.supplyAsync(
                () -> {
                    try {
                        Thread.sleep(5000);
                    } catch (InterruptedException e) {}
                    return 20;
                });
        return futureCount;
    }
}
