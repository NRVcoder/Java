package FileProgramms;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class TryWithResources {
    public static void main(String[] arg) {
        File ofile = new File("out.txt");
        File ifile = new File("in.txt");
        try(PrintWriter writer = new PrintWriter(ofile); Scanner in = new Scanner(ifile);){

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
