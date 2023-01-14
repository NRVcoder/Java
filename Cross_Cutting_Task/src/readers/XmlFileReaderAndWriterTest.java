package readers;

import Parsing.XML.SaxParserAndWriter;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class XmlFileReaderAndWriterTest {

    @Test
    void calculateXML() {
        ArrayList<String> news = new ArrayList<>();
        SaxParserAndWriter sax = new SaxParserAndWriter();
        sax.Processing("input.xml","expression", news);
        assertEquals("24.0", news.get(0).toString());
    }

}