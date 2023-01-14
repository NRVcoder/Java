import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Factorial2Test {

    @Test
    void testToString_0() {
        Factorial2 temp = new Factorial2(0);
        assertEquals("", temp.toString());
    }
    @Test
    void testToString_1() {
        Factorial2 temp = new Factorial2(1);
        assertEquals("1 ", temp.toString());
    }
    @Test
    void testToString_4() {
        Factorial2 temp = new Factorial2(4);
        assertEquals("1 1 2 6 ", temp.toString());
    }
    @Test
    void testToString_Negative() {
        Factorial2 temp = new Factorial2(-1);
        assertEquals("", temp.toString());
    }
}}