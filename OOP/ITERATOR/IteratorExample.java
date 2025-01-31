package OOP.ITERATOR;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorExample {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();

        names.add("Mathew");
        names.add("Tom");
        names.add("Daniel");
        names.add("Ben");
        names.add("Lucy");
        names.add("Ann");

        Iterator<String> it = names.iterator();
        System.out.println(it.next());

        System.out.println();

        System.out.println("names: ");
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
