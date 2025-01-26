package CONCURRENCY;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.*;

public class NonBlockingCounterTest {
    private static final int THREADS = 10;

    public static void main(String[] args) {
        final NonBlockingCounter counter = new NonBlockingCounter();
        List<Future<Integer>> list = new ArrayList<Future<Integer>>();

        ExecutorService executor = Executors.newFixedThreadPool(THREADS);
        for (int i = 0; i < 500; i++) {
            Callable<Integer> worker = new Callable<Integer>() {
                @Override
                public Integer call() throws Exception {
                    int number = counter.increment();
                    System.out.println(number);
                    return number;
                }
            };
            Future<Integer> submit = executor.submit(worker);
            list.add(submit);
        }

        executor.shutdown();

        while (!executor.isTerminated()) {}
        Set<Integer> set = new HashSet<Integer>();
        for (Future<Integer> future : list) {
            try {
                set.add(future.get());
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (ExecutionException e) {
                e.printStackTrace();
            }
        }
        if (list.size() != set.size()) {
            throw new RuntimeException("Double Entries!");
        }
    }
}
