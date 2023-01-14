package readers;

import Parsing.XML.SaxParserAndWriter;

import java.io.IOException;
import java.util.ArrayList;

public class XmlFileReaderAndWriter extends FileReader {
    public XmlFileReaderAndWriter(String inputFilename) {
        super(inputFilename);
    }

    @Override
    public void Read(String inputFileName, String outputFileName) throws IOException {
        ArrayList<String> news = new ArrayList<>();
        SaxParserAndWriter sax = new SaxParserAndWriter();
        sax.Reading(inputFileName,"expression", news);
        sax.Writing(outputFileName, "expression", news);
    }
    public void CalculateXML(String inputFileName) throws IOException {
        ArrayList<String> news = new ArrayList<>();
        SaxParserAndWriter sax = new SaxParserAndWriter();
        sax.Processing(inputFileName,"expression", news);
        sax.Writing(inputFileName, "expression", news);
    }
    public void CalculateXML(String inputFileName, String outputFileName) throws IOException {
        ArrayList<String> news = new ArrayList<>();
        SaxParserAndWriter sax = new SaxParserAndWriter();
        sax.Processing(inputFileName,"expression", news);
        sax.Writing(outputFileName, "expression", news);
    }

}
