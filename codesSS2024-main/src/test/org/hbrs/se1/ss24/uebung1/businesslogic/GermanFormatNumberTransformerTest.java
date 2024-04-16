package org.hbrs.se1.ss24.uebung1.businesslogic;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GermanFormatNumberTransformerTest {
    GermanFormatNumberTransformer transformer;

    @BeforeEach
    void setUp() {
        transformer = new GermanFormatNumberTransformer();
    }
    @Test
    public void testValidNumbers() {
        assertEquals("1", transformer.transformNumber(1));
        assertEquals("100", transformer.transformNumber(100));
        assertEquals("1.000", transformer.transformNumber(1000));
        assertEquals("3.000", transformer.transformNumber(3000));
    }

    @Test
    public void testInvalidNumbers() {
        assertEquals("Die Zahl muss zwischen 1 und 3000 liegen.", transformer.transformNumber(0));
        assertEquals("Die Zahl muss zwischen 1 und 3000 liegen.", transformer.transformNumber(3001));
    }

    @Test
    public void testTransformerType() {
        assertEquals("Transformer für deutsche Zahlenformatierungen", transformer.getTransformerType());
    }

    @Test
    public void testNonNumericInput() {
        assertEquals("Die Zahl muss zwischen 1 und 3000 liegen.", transformer.transformNumber(Integer.parseInt("1234")));
    }

    @Test
    public void testNegativeInput() {
        assertEquals("Die Zahl muss zwischen 1 und 3000 liegen.", transformer.transformNumber(-1));
    }
}