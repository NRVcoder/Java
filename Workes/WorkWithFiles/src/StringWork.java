public class StringWork {
    public static void main(String args[]) {
    String s = "Hello my computer!";
    String s2 = "Hello my computer!";
    System.out.println(s.length());
    System.out.println(s.concat(s2));
        if(s.equals(s2)){
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }

    }
}
