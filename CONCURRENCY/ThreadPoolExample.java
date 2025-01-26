package CONCURRENCY;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ThreadPoolExample {
    public static final int THREADS = 10;

    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(THREADS);

        for (int i = 0; i < 500; i++) {
            Runnable worker = new MyRunnable(10000000L + i);
            executor.execute(worker);
        }
        /*
         This will make the executor accept no more threads
         and finish all existing threads in the queue
        */
        executor.shutdown();
        try {
            if (!executor.awaitTermination(60, TimeUnit.SECONDS)) {
                System.out.println("Forcing shutdown because some tasks did not complete in time.");
                executor.shutdownNow();
            }
        } catch (InterruptedException e) {
            System.out.println("Main thread was interrupted");
            // Force shutdown if interrupted
            executor.shutdownNow();
            // restore the interrupted status
            Thread.currentThread().interrupt();
        }
        System.out.println("Finished all threads");
    }
}
