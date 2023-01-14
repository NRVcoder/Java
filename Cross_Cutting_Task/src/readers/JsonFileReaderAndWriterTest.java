package readers;

import Parsing.JSON.Expressions;
import Parsing.JSON.JSONParserWriter;
import Parsing.JSON.Root;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class JsonFileReaderAndWriterTest {

    @Test
    void calculateJSON() throws IOException {
        Root r;
        JSONParserWriter g = new JSONParserWriter();
        r = g.JSONparse("input.json");
        g.RootCalculation((ArrayList<Expressions>) r.e);
        double b = Double.parseDouble(r.e.get(0).expression0);
        assertEquals(2.5, b);
    }
}