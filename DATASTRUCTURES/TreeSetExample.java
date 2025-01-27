package DATASTRUCTURES;

import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {
        TreeSet<Integer> treeSet = new TreeSet<>();

        treeSet.add(30);
        treeSet.add(20);
        treeSet.add(5);
        treeSet.add(3);
        treeSet.add(10);
        treeSet.add(21);
        treeSet.add(18);

        System.out.println("TreeSet: " + treeSet);

        System.out.println("Size of TreeSet: " + treeSet.size());

        treeSet.remove(30);

        System.out.println("Updated TreeSet: " + treeSet);

        System.out.println("Contains 18? " + treeSet.contains(18));
        System.out.println("Contains 50? " + treeSet.contains(50));

        System.out.println("Lowest element: " + treeSet.first());
        System.out.println("Highest element: " + treeSet.last());

        System.out.println("Higher: " + treeSet.higher(18));
        System.out.println("Lower: " + treeSet.lower(18));
    }
}
