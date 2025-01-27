package CONCURRENCY;

public class DeadlockPreventionExample {
    public static final Object lock1 = new Object();
    public static final Object lock2 = new Object();

    public static void main(String[] args) {
        Thread thread1 = new Thread(() -> {
            synchronized (lock1) {
                System.out.println("Thread 1 : holding lock 1...");
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Thread 1 : waiting for lock 2...");
                synchronized (lock2) {
                    System.out.println("Thread 1 : acquired lock 2!");
                }
            }
        });

        Thread thread2 = new Thread(() -> {
            synchronized (lock1) {
                System.out.println("Thread 2 : holding lock 1...");
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Thread 2 : waiting for lock 2...");
                synchronized (lock2) {
                    System.out.println("Thread 2 : acquired lock 2!");
                }
            }
        });

        thread1.start();
        thread2.start();
    }
}
