package DATASTRUCTURES;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        Queue<Integer> numbers = new LinkedList<>();

        // enqueuing elements to the queue
        numbers.offer(10);
        numbers.offer(20);
        numbers.offer(30);
        numbers.offer(40);
        numbers.offer(50);

        System.out.println("Front element: " + numbers.peek());

        System.out.println("Printing elements...");
        while (!numbers.isEmpty()) {
            // dequeue an element from the queue
            int number = numbers.poll();
            System.out.println("Number: " + number);
        }
    }
}
