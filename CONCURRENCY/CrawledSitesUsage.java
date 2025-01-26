package CONCURRENCY;

public class CrawledSitesUsage {
    public static void main(String[] args) {
        CrawledSites crawledSites = new CrawledSites();

        crawledSites.add("https://www.site1.com");
        crawledSites.add("https://www.site2.com");
        crawledSites.add("https://www.site3.com");

        String site;
        while ((site = crawledSites.next()) != null) {
            System.out.println("Crawling " + site);
        }
    }
}
