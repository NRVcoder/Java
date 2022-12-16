public class Array {
    public static void main(String args[]){
        int arr[] = new int[7];
        for (int i = 0; i < 7; ++i){
            arr[i] = i;
        }
        for (int i = 0; i < 7; ++i){
           System.out.println(arr[i]);
        }
        double x = 3.2;
        int y = 10;
        char value = '3';
        int result = sum(-3, -10);
        System.out.println(Math.abs(result));
        System.out.println((int)(Math.random() * 10));
        System.out.println(Character.isDigit(value));
    }
    static int sum(int a, int b){
        int i = a + b;
        return i;
    }
}
