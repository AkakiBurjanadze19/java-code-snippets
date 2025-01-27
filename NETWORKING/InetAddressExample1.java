package NETWORKING;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressExample1 {
    public static void main(String[] args) throws UnknownHostException {
        InetAddress address = InetAddress.getLocalHost();

        System.out.println("Inet address of local host: " + address);

        String hostname = address.getHostName();

        System.out.println("Hostname of the localhost: " + hostname);
    }
}
