package Parsing;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex_Calculation_Engine {


    public static String CalculateS (String s){
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

    public static void Calculate(String inputFileName, String outputFileName) throws IOException {
        File file = new File(inputFileName);
        FileWriter out = new FileWriter(outputFileName);
        Scanner inputScanner = new Scanner(file);
        while (inputScanner.hasNextLine()) {
            String line = inputScanner.nextLine();
            out.write(CalculateS(line));
            out.write('\n');
        }
        out.close();
    }
}
