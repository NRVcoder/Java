package ClientService;


import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.ServerSocket;
import java.util.Scanner;

public class Server {
    public static void main(String[] arg) throws IOException {
        ServerSocket sv = new ServerSocket(8081);
        Socket input = sv.accept();
        Scanner in = new Scanner(input.getInputStream());
        while(in.hasNext()) {
            System.out.println(in.next());
        }
        in.close();
        input.close();
        sv.close();


    }
}
