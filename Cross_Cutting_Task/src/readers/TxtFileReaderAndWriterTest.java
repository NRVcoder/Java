package readers;

import Parsing.Calculation_Engine;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TxtFileReaderAndWriterTest {

    @Test
    void calculateTXT() {
        Calculation_Engine r = new Calculation_Engine();
        assertEquals("78.0", r.CalculateStr("(50 + 2) / 2 * 3"));
        assertEquals("Dividing by zero!", r.CalculateStr("102.5 / 0"));
        assertEquals("10.5", r.CalculateStr("(2.5 + 2.5)* 2.1"));
        assertEquals("6.0", r.CalculateStr("2.0 + 2.0* 2.0"));

    }
}