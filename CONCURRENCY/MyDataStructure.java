package CONCURRENCY;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MyDataStructure {
    List<String> list = new ArrayList<>();

    public void add(String value) {
        this.list.add(value);
    }

    /*
        Make a defensive copy of the list and return it.
        This way list cannot be modified itself.
    */
    public List<String> getList() {
        return Collections.unmodifiableList(this.list);
    }
}
