package Parsing;

import org.mariuszgromada.math.mxparser.Expression;


import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Calculation_Engine {

    public static String CalculateStr(String s) {
        Expression expression = new Expression(s);
        if (expression.checkSyntax()) {
            double result = expression.calculate();
            if (Double.isNaN(result)) {
                return ("Dividing by zero!");
            }
            return String.valueOf(result);
        }
        return s;
    }
    public static void AnotherCalculate(String inputFileName, String outputFileName) throws IOException {
        File inputFile = new File(inputFileName);
        FileWriter out = new FileWriter(outputFileName);
        Scanner inputScanner = new Scanner(inputFile);
        while (inputScanner.hasNextLine()) {
            String s = inputScanner.nextLine();
            String calculatedLine = CalculateStr(s);
            out.write(calculatedLine);
        }
        out.close();
    }
}

