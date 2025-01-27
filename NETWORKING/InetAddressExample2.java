package NETWORKING;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressExample2 {
    public static void main(String[] args) throws UnknownHostException {
        InetAddress address1 = InetAddress.getByName("facebook.com");

        System.out.println("Inet address of named host: " + address1);

        InetAddress array[] = InetAddress.getAllByName("x.com");

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
