package DATASTRUCTURES;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();

        set.add(10);
        set.add(20);
        set.add(10);
        set.add(30);
        set.add(50);
        set.add(60);
        set.add(60);

        System.out.println("set: " + set);

        System.out.println("Contains 60? " + set.contains(60));

        set.remove(60);

        System.out.println("updated set: " + set);

        System.out.println("size of the set: " + set.size());

        System.out.println("set is empty? " + set.isEmpty());

        set.clear();

        System.out.println("set is empty? " + set.isEmpty());
    }
}
