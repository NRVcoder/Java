package FileProgramms;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FileEx {
    public static void main(String[] arg) throws IOException {
        File ofile = new File("out.txt");
        File ifile = new File("in.txt");
        PrintWriter writer = new PrintWriter(ofile);
       /* for(int i = 0; i < 12; ++i){
            writer.println(i);
        }*/
        writer.println("hello");
        writer.println("gipf");


        Scanner in = new Scanner(ifile);
        while(in.hasNext()){
            String s = in.next();
            writer.println("s");
        }
        writer.close();
        in.close();
    }
}
