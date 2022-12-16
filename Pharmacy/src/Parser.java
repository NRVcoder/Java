
    import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

    public class Parser {

        public static ArrayList<String> readData(String filename) throws FileNotFoundException {
            Scanner devScanner = new Scanner(new File(filename));
            ArrayList<String> Data = new ArrayList<>();
            while (devScanner.hasNext()) {
                String nextLine = devScanner.nextLine();
                Data.add(nextLine);
            }
            return Data;
        }
    }

