package DATASTRUCTURES;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();

        names.add("Akaki");
        names.add("Luka");
        names.add("Luka");
        names.add("Goga");
        names.add("Alex");
        names.add("Gegi");
        names.add("Demetre");
        names.add("Romeo");

        System.out.println("First element: " + names.get(0));
        System.out.println("Second element: " + names.get(1));
        System.out.println("Last element: " + names.get(names.size() - 1));

        StringBuilder result = new StringBuilder();
        for (String name : names) {
            result.append(name);
        }
        System.out.println(result.toString());

        names.set(2, "LukaNikab");
        System.out.println("Updated element at index 2: " + names.get(2));

        System.out.println("Removing an element");
        names.remove(0);

        System.out.println("Printing elements...");
        for (String name : names) {
            System.out.println(name);
        }
    }
}
