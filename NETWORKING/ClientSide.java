package NETWORKING;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class ClientSide {
    // initialize socket, input and output streams.
    private Socket socket = null;
    private DataInputStream input = null;
    private DataOutputStream out = null;

    public ClientSide(String address, int port) {
        // establish a connection
        try {
            this.socket = new Socket(address, port);

            System.out.println("Connected");

            // take input from the console
            this.input = new DataInputStream(System.in);

            // send output to the socket
            this.out = new DataOutputStream(socket.getOutputStream());
        } catch (UnknownHostException e) {
            System.out.println(e);
        } catch (IOException e) {
            System.out.println(e);
        }

        // String to read message from the input
        String line = "";

        while (!line.equals("END")) {
            try {
                line = this.input.readLine();
                this.out.writeUTF(line);
            } catch (IOException e) {
                System.out.println(e);
            }
        }

        // close the connection
        try {
            this.input.close();
            this.out.close();
            this.socket.close();
        } catch (IOException e) {
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        ClientSide client = new ClientSide("127.0.0.1", 5000);
    }
}
