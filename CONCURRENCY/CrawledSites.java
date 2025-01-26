package CONCURRENCY;

import java.util.ArrayList;
import java.util.List;

public class CrawledSites {
    private List<String> crawledSites = new ArrayList<>();
    private List<String> linkedSites = new ArrayList<>();

    public void add(String site) {
        // ensure that only one thread can execute this method at a time preventing a race condition
        synchronized (this) {
            if (!crawledSites.contains(site)) {
                linkedSites.add(site);
            }
        }
    }

    public String next() {
        if (linkedSites.isEmpty()) {
            return null;
        }
        // ensure that only one thread can execute this method at a time preventing a race condition
        synchronized (this) {
            if (!linkedSites.isEmpty()) {
                String site = linkedSites.remove(0);
                crawledSites.add(site);
                return site;
            }
            return null;
        }
    }
}
