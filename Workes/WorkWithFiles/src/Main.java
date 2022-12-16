import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;
public class Main {
    public static void main(String[] arg)  throws FileNotFoundException {



        String separator = File.separator;
        /*String path = "Users\User\Source\repos\Java\Test";*/
        String path = "D:" + separator +"source"
                + separator + "repos" + separator + "Java" + separator + "Workes"
                + separator + "WorkWithFiles"+ separator + "Test.txt";
        File file = new File(path);
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        System.out.println(x);
        Scanner scanner = new Scanner(file);
        while(scanner.hasNextLine()){
            System.out.println(scanner.nextLine());
        }
        scanner.close();
    }
}