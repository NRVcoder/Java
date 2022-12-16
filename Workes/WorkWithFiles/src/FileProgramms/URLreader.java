package FileProgramms;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class URLreader {
    public static void main(String[] arg) throws IOException, MalformedURLException {
        URL url = new URL("https://en.cppreference.com/w/cpp/atomic/atomic");
        Scanner in = new Scanner(url.openStream());
        while(in.hasNextLine()){
            String line = in.nextLine();
            System.out.println(line);
        }
in.close();
    }
}
