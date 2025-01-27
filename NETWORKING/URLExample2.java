package NETWORKING;

import java.net.*;
import java.net.MalformedURLException;

public class URLExample2 {
    public static void main(String[] args) throws MalformedURLException {
        URL url = new URL("https://www.facebook.com");

        int defaultPort = url.getDefaultPort();
        System.out.println("Default port: " + defaultPort);

        String path = url.getPath();
        System.out.println("Path: " + path);
    }
}
