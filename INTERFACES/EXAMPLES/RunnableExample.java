package INTERFACES.EXAMPLES;

public class RunnableExample {
    public static void main(String[] args) {
        /* Used for tasks that take no input and return no result */
        Runnable task = () -> System.out.println("Task executed!");

        Thread thread = new Thread(task);

        thread.start();
    }
}
