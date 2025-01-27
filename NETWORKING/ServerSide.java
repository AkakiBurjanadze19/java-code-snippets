package NETWORKING;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerSide {
    private Socket socket = null;
    private ServerSocket server = null;
    private DataInputStream in = null;

    public ServerSide(int port) {
        // starts server and waits for the connection
        try {
            this.server = new ServerSocket(port);

            System.out.println("Server started");

            System.out.println("Waiting for a client...");

            socket = server.accept();

            System.out.println("Client accepted");

            in = new DataInputStream(new BufferedInputStream(this.socket.getInputStream()));

            // read message from client until "END" is encountered
            String line = "";

            while (!line.equals("END")) {
                try {
                    line = in.readUTF();

                    System.out.println(line);
                } catch (IOException e) {
                    System.out.println(e);
                }
            }

            System.out.println("Closing connection");

            socket.close();

            in.close();
        } catch (IOException e) {
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        ServerSide server = new ServerSide(5000);
    }
}
