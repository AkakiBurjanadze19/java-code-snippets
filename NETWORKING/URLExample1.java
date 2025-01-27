package NETWORKING;

import java.net.*;
import java.net.MalformedURLException;

public class URLExample1 {
    public static void main(String[] args) throws MalformedURLException {
        URL url = new URL("https://www.facebook.com");

        String protocol = url.getProtocol();
        System.out.println("Protocol: " + protocol);

        String hostname = url.getHost();
        System.out.println("Hostname: " + hostname);

        String filename = url.getFile();
        System.out.println("Filename: " + filename);
    }
}
