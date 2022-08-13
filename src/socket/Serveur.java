package socket;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Serveur {
    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(7777);
            Socket s = serverSocket.accept();
            System.out.println("Client connected");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
