package DATASTRUCTURES;

import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        System.out.println("LinkedList: " + list);

        System.out.println("Second element: " + list.get(1));
        System.out.println("Third element: " + list.get(2));

        list.removeFirst();

        System.out.println("Contains 10? " + list.contains(10));
        System.out.println("Contains 50? " + list.contains(50));

        System.out.println("First element: " + list.getFirst());
        System.out.println("Last element: " + list.getLast());

        System.out.println("Clearing a LinkedList");
        list.clear();

        System.out.println("Size: " + list.size());
    }
}
