package OOP.COMPARATOR;

import java.util.Comparator;

public class SortByYear implements Comparator {
    public int compare(Object o1, Object o2) {
        Car a = (Car) o1;
        Car b = (Car) o2;

        if (a.getYear() < b.getYear()) {
            return -1;
        }

        if (a.getYear() > b.getYear()) {
            return 1;
        }

        return 0;
    }
}
