package org.hbrs.se1.ss24.uebung1.businesslogic;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.assertEquals;

class RomanNumberTransformerTest {
    RomanNumberTransformer transformer;

    @BeforeEach
    public void setUp() {
        transformer = new RomanNumberTransformer();
    }

    @Test
    public void TestRomanNumbers() {
        assertEquals("I", transformer.transformNumber(1));
        assertEquals("C", transformer.transformNumber(100));
        assertEquals("M", transformer.transformNumber(1000));
        assertEquals("MMM", transformer.transformNumber(3000));
    }

    @Test
    public void testInvalidRomanNumbers() {
        assertEquals("Die Zahl muss zwischen 1 und 3000 liegen.", transformer.transformNumber(0));
        assertEquals("Die Zahl muss zwischen 1 und 3000 liegen.", transformer.transformNumber(3001));
    }

    @Test
    public void testTransformerType() {
        assertEquals("Transformer für römische Zahlen", transformer.getTransformerType());
    }

    @Test
    public void testNonNumericInput() {

        assertEquals("Die Zahl muss zwischen 1 und 3000 liegen.", transformer.transformNumber(Integer.parseInt("123")));
    }

    @Test
    public void testNegativeInput() {
        assertEquals("Die Zahl muss zwischen 1 und 3000 liegen.", transformer.transformNumber(-1));
    }
}
