import java.io.IOException;

public class Main {
private String name = "aaa";
    public static void main(String[] args) throws IOException {

        /*String[] str1 = {"ab", "cd", "IF"};
        System.out.println(args[0] + args[1]);*/
        Cow c = new Cow();
        int a;
       a = System.in.read();
        System.out.println(c.getSound());
        c.mu();
        int[] nums = new int[4];
        try {
           a =  3 / 0;
            nums[7] = a;
        }catch(ArrayIndexOutOfBoundsException temp){
            System.out.println("Переполнение массива!");
        }
        catch(ArithmeticException temp){
            System.out.println("Error Math!");
        }
    }
}