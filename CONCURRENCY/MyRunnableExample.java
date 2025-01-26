package CONCURRENCY;

import java.util.ArrayList;
import java.util.List;

public class MyRunnableExample {
    public static void main(String[] args) {
        // Store running threads in the list so we can check if they are done
        List<Thread> threads = new ArrayList<Thread>();

        // Create 500 threads
        for (int i = 0; i < 500; i++) {
            Runnable task = new MyRunnable(10000000L + i);
            Thread worker = new Thread(task);
            // Set the name of the thread
            worker.setName(String.valueOf(i));
            // Start the thread, never call run() method direct
            worker.start();
            // Remember the thread for later usage
            threads.add(worker);
        }

        int running = 0;
        do {
            running = 0;
            for (Thread thread : threads) {
                if (thread.isAlive()) {
                    running++;
                }
            }
            System.out.println("We have " + running + " running threads");
        } while (running > 0);
    }
}
