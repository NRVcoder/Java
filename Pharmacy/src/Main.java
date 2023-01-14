import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] arg)  throws FileNotFoundException {
        String separator = File.separator;
        String path = "D:" + separator +"source"
                + separator + "repos" + separator + "Java" + separator + "Pharmacy" + separator + "input.txt";
        File file = new File(path);

        Scanner scanner = new Scanner(file);
        String line = scanner.nextLine();
        String[] numbers = line.split(" ");
        /*while(scanner.hasNextLine()){
            System.out.println(scanner.nextLine());
        }*/
        System.out.println(Arrays.toString(numbers));
        scanner.close();

        List<String> naming = Arrays.asList("Paradantoz", "Amigrant", "Alloe",
                "Ibuprifen", "Dona");

        Collections.sort(naming);
        System.out.println(naming);

    }
}
