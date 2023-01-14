package Parsing;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Regex_Calculation_EngineTest {

    @Test
    void calculateS() {
        Regex_Calculation_Engine r = new Regex_Calculation_Engine();
        assertEquals("25.0", r.CalculateS("5.0*5.0"));
        assertEquals("1024.0", r.CalculateS("1 * 1024.0"));
        assertEquals("51.25", r.CalculateS("102.5 /2"));
    }
}