package Parsing;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Calculation_EngineTest {

    @Test
    void calculateStr() {
        Calculation_Engine r = new Calculation_Engine();
        assertEquals("0.9", r.CalculateStr("5.0 - 4.1"));
        assertEquals("10.5", r.CalculateStr("(2.5 + 2.5)* 2.1"));
        assertEquals("6.0", r.CalculateStr("2.0 + 2.0* 2.0"));
        assertEquals("Dividing by zero!", r.CalculateStr("102.5 / 0"));
    }
}