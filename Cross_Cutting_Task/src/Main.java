import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static String Calculate (String s){
        ArrayList<String> mem = new ArrayList<>();
        Pattern pt = Pattern.compile("\\d+(\\.\\d+)?\\s?[+,*,/,-]\\s?\\d+(\\.\\d+)?");
        Matcher m = pt.matcher(s);
        while (m.find()) {
            mem.add(m.group());
        }
        for (int i = 0; i < mem.size(); ++i) {
            Pattern pt2 = Pattern.compile("^\\d+(\\.\\d+)?");
            Matcher m2 = pt2.matcher(mem.get(i));

            Pattern pt3 = Pattern.compile("[+,*,/,-]");
            Matcher m3 = pt3.matcher(mem.get(i));

            Pattern pt4 = Pattern.compile("\\d+(\\.\\d+)?$");
            Matcher m4 = pt4.matcher(mem.get(i));

            if (m2.find() && m3.find() && m4.find()) {
                double a = Double.parseDouble(m2.group());
                double b = Double.parseDouble(m4.group());
                double res;
                if (m3.group().matches("[+]")) {
                    res = a + b;
                    mem.set(i, String.valueOf(res));
                }
                if (m3.group().matches("[-]")) {
                    res = a - b;
                    mem.set(i, String.valueOf(res));
                }
                if (m3.group().matches("[*]")) {
                    res = a * b;
                    mem.set(i, String.valueOf(res));
                }
                if (m3.group().matches("[/]")) {
                    try {
                        if (b == 0) {
                            throw new ArithmeticException();
                        }
                        res = a / b;
                        mem.set(i, String.valueOf(res));
                    } catch (ArithmeticException ex) {
                        mem.set(i, "( Dividing by Zero Error! )");
                    }
                }
            }
        }


        for (int i = 0; i < mem.size(); ++i) {
            s = s.replaceFirst("\\d+(\\.\\d+)?\\s?[+,*,/,-]\\s?\\d+(\\.\\d+)?", mem.get(i));
        }
       return s;
    }

    public static void main(String[] args) {
            String s = "dfkhg15/45fkgvi43-234gv23 * 1 5iytv";

            System.out.println(Calculate(s));
        }


}