package CONCURRENCY;

public class MyRunnable implements Runnable {
    private final long countUntil;

    public MyRunnable(long countUntil) {
        this.countUntil = countUntil;
    }

    @Override
    public void run() {
        int sum = 0;
        for (int i = 0; i < countUntil; i++) {
            sum += i;
        }
        System.out.println(sum);
    }
}
