import java.net.*;
import java.io.*;

public class cs {
    public static void main(String[] args) throws Exception {
        ServerSocket ss = new ServerSocket(300);
        Socket s = ss.accept();
        System.out.println("My Server is Ready:");
        BufferedReader clientInput = new BufferedReader(new InputStreamReader(s.getInputStream()));
        PrintWriter outputToClient = new PrintWriter(s.getOutputStream(), true);

        while (true) {
            String clientMessage = clientInput.readLine();
            System.out.println(clientMessage);
            String serverMessage = new BufferedReader(new InputStreamReader(System.in)).readLine();
            outputToClient.println("Server Message:" + serverMessage);
        }
    }
}
