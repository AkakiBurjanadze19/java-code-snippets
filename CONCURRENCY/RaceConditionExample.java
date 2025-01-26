package CONCURRENCY;

public class RaceConditionExample {
    private int counter = 0;

    public synchronized void increment() {
        this.counter++;
    }

    public int getCounter() {
        return this.counter;
    }

    public static void main(String[] args) throws InterruptedException {
        RaceConditionExample example = new RaceConditionExample();

        Runnable task = () -> {
            for (int i = 0; i < 1000; i++) {
                example.increment();
            }
        };

        Thread thread1 = new Thread(task);
        Thread thread2 = new Thread(task);

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        System.out.println("Final counter value: " + example.getCounter());
    }
}
