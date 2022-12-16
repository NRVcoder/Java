import java.util.Scanner;

public class DivisionException {
    public static void main(String[] arg) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        try{
            if(b == 0) {
                throw new ArithmeticException();
            }
            int div =  a / b;
            System.out.println(div);
        }catch(ArithmeticException ex){
            System.out.println("Error!!!!");
        }
        System.out.println( devide(a, b));
    }
    public static int devide(int a, int b) throws ArithmeticException{
        if (b == 0){ throw new ArithmeticException();}
        return a / b;
    }
}
