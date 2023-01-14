import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class FileEx {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("out.txt");
        PrintWriter writer = new PrintWriter(file);
        writer.println("He");
        writer.println("Man");
        writer.close();
    }
}