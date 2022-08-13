package socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Serveur {
    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(7777);
            Socket s = serverSocket.accept();
            System.out.println("Client connected");
            InputStreamReader inputStreamReader = new InputStreamReader(s.getInputStream());
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
            String msg = bufferedReader.readLine();
            System.out.println("Client: "+ msg);

            PrintWriter printWriter = new PrintWriter(s.getOutputStream());
            printWriter.println("Bonjour");
            printWriter.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
