package Interfaces;

import Parsing.JSON.Expressions;
import Parsing.JSON.Root;

import java.io.IOException;
import java.util.ArrayList;

public interface JSONParserWriter_Interface {
    public Root JSONparse(String inputFileName);
    public void RootCalculation(ArrayList<Expressions> e);
    public void Write(String outputFileName, ArrayList<Expressions> e) throws IOException;
}
