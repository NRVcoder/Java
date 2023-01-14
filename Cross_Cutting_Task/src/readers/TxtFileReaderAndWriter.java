package readers;

import Parsing.XML.SaxParserAndWriter;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

import static Parsing.Calculation_Engine.AnotherCalculate;

public class TxtFileReaderAndWriter extends FileReader{

    public TxtFileReaderAndWriter(String inputFilename) {
        super(inputFilename);
    }


    @Override
    public void Read(String inputFileName, String outputFileName) throws IOException {
        File ofile = new File(outputFileName);
        File ifile = new File(inputFileName);
        PrintWriter writer = new PrintWriter(ofile);
        Scanner in = new Scanner(ifile);
        while(in.hasNext()){
            String s = in.next();
            writer.println(s);
        }
        writer.close();
        in.close();
    }


    public void Read(String inputFileName) throws IOException {
        File ifile = new File(inputFileName);
        Scanner in = new Scanner(ifile);
        while(in.hasNext()){
            String s = in.next();
            System.out.println(s);
        }
        in.close();
    }

    public void CalculateTXT(String inputFileName, String outputFileName) throws IOException {
        AnotherCalculate(inputFileName, outputFileName);
    }


    public static void ReadPlaneTxt(String inputFileName)throws IOException {
        File ifile = new File(inputFileName);
        Scanner in = new Scanner(ifile);
        while(in.hasNext()){
            String s = in.next();
            System.out.println(s);
        }
        in.close();
    }
    //overload
    public static void ReadPlaneTxt(String inputFileName, ArrayList<String> sarr)throws IOException {
        File ifile = new File(inputFileName);
        Scanner in = new Scanner(ifile);
        while(in.hasNext()){
            String s = in.next();
            sarr.add(s);
        }
        in.close();
    }

    public static String ReadPla(String inputFileName)throws IOException {
        File ifile = new File(inputFileName);
        Scanner in = new Scanner(ifile);
        String sarr = "a";
        while(in.hasNext()){
            sarr = sarr + " " + in.next();
        }
        sarr = sarr.substring(1);
        in.close();
        return sarr;

    }

    public static void ReadArrayTxt(ArrayList<String> Names) throws IOException {
        for(int i = 0; i < Names.size(); ++i){
            File ifile = new File(Names.get(i));
            Scanner in = new Scanner(ifile);
            while(in.hasNext()){
                String s = in.next();
                System.out.println(s);
            }
            in.close();
        }
    }

    public static void WritePlaneTxt(String outputFileName, ArrayList<String> arr)
            throws FileNotFoundException {
        File ofile = new File(outputFileName);
        PrintWriter writer = new PrintWriter(ofile);
        for(int i = 0; i < arr.size(); ++i){
            writer.println(arr.get(i));
        }
        writer.close();
    }



}
