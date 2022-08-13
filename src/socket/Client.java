package socket;

import java.io.IOException;
import java.net.Socket;

public class Client {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("localhost", 7777);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
