package socket;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;

public class Client {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("localhost", 7777);

            PrintWriter printWriter = new PrintWriter(socket.getOutputStream());
            printWriter.println("Bonjour");
            printWriter.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
