package readers;

import Parsing.JSON.Expressions;
import Parsing.JSON.JSONParserWriter;
import Parsing.JSON.Root;
import Parsing.XML.SaxParserAndWriter;

import java.io.IOException;
import java.util.ArrayList;

public class JsonFileReaderAndWriter extends FileReader {
    public JsonFileReaderAndWriter(String inputFilename) {
        super(inputFilename);
    }

    @Override
    public void Read(String inputFileName, String outputFileName) throws IOException {
        Root r;
        JSONParserWriter g = new JSONParserWriter();
        r = g.JSONparse(inputFileName);
        g.Write(outputFileName , (ArrayList<Expressions>) r.e);
    }
    public void CalculateJSON(String inputFileName, String outputFileName) throws IOException {
        Root r;
        JSONParserWriter g = new JSONParserWriter();
        r = g.JSONparse(inputFileName);
        g.RootCalculation((ArrayList<Expressions>) r.e);
        g.Write(outputFileName , (ArrayList<Expressions>) r.e);
    }
}
