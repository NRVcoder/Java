import java.io.IOException;
import java.util.*;
import java.util.Scanner;
public class Main {
    static public long Fact(int n){
        if (n == 0){
            return 1;
        }
        return n * Fact(n - 1);
    }
    static public double TS(int x, double e){
     double a = 1.0;
     int count = 0;
     while(Math.abs((Math.pow(x, count)) / Fact(count)) > e ){
         a += (Math.pow(x, count)) / Fact(count);
         count++;
     }
        return a;
    }
    private static Scanner in = new Scanner(System.in);
    public static void main(String[] args) throws IOException {
        System.out.println("Hello world!");

       /* InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        int a = isr.read();
        try{
            String line = br.readLine();
            int number = Integer.parseInt(line);
        }catch(NumberFormatException e){
            System.out.println("Not Integer number");
        }
        catch(IOException e){
            System.out.println("KeyBoard read error!");
        }*/
        int x = in.nextInt();
        int k = in.nextInt();
        double e = Math.pow(10, -k);
        //Вычисление экспоненты
        double sum = TS(x, e);
       // String s1 = in.nextLine();
        System.out.println(sum);
    }
}