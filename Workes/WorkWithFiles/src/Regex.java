import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {
    public static void main(String args[]) throws IllegalStateException{
        String s = "ABA";
       /* if(s.matches("J[a-zA-Z].a") || s.matches(".*J\\w{0,5}(ABC|v)a.+")){
            System.out.println("Year!!");

        }*/
if(s.matches("ABA")){
    System.out.print("Q");
}
        Pattern pattern = Pattern.compile("ABA");
        var mat = pattern.matcher('A');
        System.out.print(mat.groupCount());
        /*Pattern p = Pattern.compile("//A");
        Matcher m = p.matcher("//ABA");
        //while(m.find()){
            System.out.print(m.start());*/
       // }
    }
}
