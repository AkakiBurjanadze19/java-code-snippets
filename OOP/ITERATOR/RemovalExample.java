package OOP.ITERATOR;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class RemovalExample {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();

        names.add("Mathew");
        names.add("Tom");
        names.add("Daniel");
        names.add("Ben");
        names.add("Lucy");
        names.add("Ann");

        System.out.println("List size before removing names: " + names.size());

        Iterator<String> it = names.iterator();

        while (it.hasNext()) {
            String name = it.next();
            if (name.length() < 4) {
                it.remove();
            }
        }

        System.out.println("List size after removing names: " + names.size());
    }
}
