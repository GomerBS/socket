package socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class Client {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("localhost", 7777);

            PrintWriter printWriter = new PrintWriter(socket.getOutputStream());
            printWriter.println("Bonjour");
            printWriter.flush();

            InputStreamReader inputStreamReader = new InputStreamReader(socket.getInputStream());
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
            String msg = bufferedReader.readLine();
            System.out.println("Server: "+ msg);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
