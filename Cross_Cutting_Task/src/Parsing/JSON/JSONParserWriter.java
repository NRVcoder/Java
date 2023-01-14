package Parsing.JSON;
import com.google.gson.Gson;
import org.json.simple.parser.JSONParser;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import Interfaces.JSONParserWriter_Interface;

import static Parsing.Regex_Calculation_Engine.CalculateS;

public class JSONParserWriter implements JSONParserWriter_Interface{
    private static final String TAG_EXPRESSIONS = "expressions";
    private static final String TAG_EXPRESSION0 = "expression0";
    private static final String TAG_EXPRESSION1 = "expression1";
    private static final String TAG_EXPRESSION2 = "expression2";
    public Root JSONparse(String inputFileName) {
        Root root = new Root();
        JSONParser parser = new JSONParser();
        try {
            FileReader reader = new FileReader(inputFileName);
            JSONObject rootJsonObject = (JSONObject) parser.parse(reader);
            JSONArray exJA = (JSONArray) rootJsonObject.get(TAG_EXPRESSIONS);
            List<Expressions> expressionsList = new ArrayList<>();
            for(Object it: exJA){
                JSONObject exJO = (JSONObject) it;
                String expression0 = (String)exJO.get(TAG_EXPRESSION0);
                String expression1 = (String)exJO.get(TAG_EXPRESSION1);
                String expression2 = (String)exJO.get(TAG_EXPRESSION2);
                Expressions expressions = new Expressions(expression0, expression1, expression2);
                expressionsList.add(expressions);
            }
            root.setExpressions(expressionsList);

            return root;

        } catch (Exception e) {
           System.out.println(e.toString());
        }
        return null;
    }

        /*Gson gson = new Gson();

        try {
            FileReader reader = new FileReader(inputFileName);
            Root root = gson.fromJson(reader, Root.class);
            return root;
        } catch (Exception e) {
            System.out.println("Parsing Error" + e.toString());
        }
        return null;
    }*/

    public void RootCalculation(ArrayList<Expressions> e) {
        for (int i = 0; i < e.size(); ++i) {
            String mem0 = CalculateS(e.get(i).expression0);
            System.out.println(mem0);
            String mem1 = CalculateS(e.get(i).expression1);
            System.out.println(mem1);
            String mem2 = CalculateS(e.get(i).expression2);
            System.out.println(mem2);
            Expressions EX = new Expressions(mem0, mem1, mem2);
            e.set(i, EX);
        }
    }
    public void Write(String outputFileName, ArrayList<Expressions> e) throws IOException {
        JSONObject obj = new JSONObject();
        FileWriter file = new FileWriter(outputFileName);
        for (int i = 0; i < e.size(); ++i) {
            obj.put("expression0", e.get(i).expression0);
            obj.put("expression1", e.get(i).expression1);
            obj.put("expression2", e.get(i).expression2);
            file.write(obj.toJSONString());
        }
        file.write(obj.toJSONString());
        file.close();
    }


}
