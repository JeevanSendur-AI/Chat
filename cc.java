import java.net.*;
import java.io.*;

public class cc {
    public static void main(String[] args) throws Exception {
        InetAddress ina = InetAddress.getLocalHost();
        Socket s = new Socket(ina, 300);
        System.out.println("My Client is Ready:");
        BufferedReader userInput = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader serverInput = new BufferedReader(new InputStreamReader(s.getInputStream()));
        PrintWriter ps = new PrintWriter(s.getOutputStream(), true);

        while (true) {
            String clientMessage = userInput.readLine();
            ps.println("Client Message:" + clientMessage);
            String serverMessage = serverInput.readLine();
            System.out.println(serverMessage);
        }
    }
}
