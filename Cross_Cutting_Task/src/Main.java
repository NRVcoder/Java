import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;

import Archives.Archivator;
import Parsing.JSON.Expressions;
import Parsing.JSON.JSONParserWriter;
import Parsing.JSON.Root;

import javax.crypto.*;
import javax.security.auth.login.LoginException;

import static  Encription.WorkWithEncription.*;


public class Main {

    public static void main(String[] args) throws LoginException, IllegalBlockSizeException, NoSuchPaddingException, NoSuchAlgorithmException,
            BadPaddingException, InvalidKeyException, IOException {
       /* String s = "dfkhg45/ 15fkgvi43-234gv23 * 1 5iytv";
        String ss = "answear = 13 + 15";
        Regex_Calculation_Engine r = new Regex_Calculation_Engine();
       *//* System.out.println(r.CalculateS(s));*//*
        r.Calculate("input.txt", "output.txt");*/


       /* SaxParserAndWriter s = new SaxParserAndWriter();
        ArrayList<String> news = new ArrayList<>();
       for(int i = 0; i < 2; ++i){
            s.Processing("input.xml", "EX" + i, news);
        }
        s.Writing("output.xml","EX", news);*/


       /* JSONParserWriter g = new JSONParserWriter();
        Root r;
        r = g.JSONparse("input.json");
        System.out.println(r.e.get(0).expression0);
        g.RootCalculation((ArrayList<Expressions>) r.e);
        g.Write("output.json",(ArrayList<Expressions>) r.e);
*/
        /*Archivator a = new Archivator();
       // a.ZipFileWriter("Test.txt");
        ArrayList<String> s = new ArrayList<>();
        a.ZipFileReader("Test.zip", s);*/


        Encripted("jh", "Test.txt", "output.txt");
        Decripted("jh","output.txt", "Test.txt");

    }
}