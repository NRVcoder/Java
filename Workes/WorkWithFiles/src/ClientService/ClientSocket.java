package ClientService;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.ServerSocket;
public class ClientSocket {
    public static void main(String[] arg) throws IOException {
        Socket sc = new Socket("127.0.0.1",8081);//"localhost"
        PrintWriter out = new PrintWriter(sc.getOutputStream());
        out.println("dfdfdfdf");
        out.println("aaaaaaaa");

        out.close();
        sc.close();


    }
}
