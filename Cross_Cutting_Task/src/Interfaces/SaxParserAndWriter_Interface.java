package Interfaces;

import java.util.ArrayList;

public interface SaxParserAndWriter_Interface {
    public void Processing(String fileName, final String tegName, final ArrayList<String> news);
    public void Writing(String outputFileName, String tegName, ArrayList<String> a);
}
