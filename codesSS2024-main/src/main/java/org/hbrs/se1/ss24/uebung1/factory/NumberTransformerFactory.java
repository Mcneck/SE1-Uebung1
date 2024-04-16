package org.hbrs.se1.ss24.uebung1.factory;
import org.hbrs.se1.ss24.uebung1.businesslogic.GermanFormatNumberTransformer;
import org.hbrs.se1.ss24.uebung1.businesslogic.NumberTransformer;
import org.hbrs.se1.ss24.uebung1.businesslogic.RomanNumberTransformer;

public class NumberTransformerFactory {
    public static NumberTransformer createGermanFormatNumberTransformer() {
        return new GermanFormatNumberTransformer();
    }

    public static NumberTransformer createRomanFormatNumberTransformer() {
        return new RomanNumberTransformer();
    }
}

