package org.hbrs.se1.ss24.uebung1.businesslogic;

import java.text.DecimalFormat;

public class GermanFormatNumberTransformer extends Validation{
    @Override
    public String transformNumber(int number) {
        if (isValidNumber(number)) {
            DecimalFormat df = new DecimalFormat("#,###");
            return df.format(number);
        }
        else {
            return "Die Zahl muss zwischen 1 und 3000 liegen.";
        }
    }

    @Override
    public String getTransformerType() {
        return "Transformer für deutsche Zahlenformatierungen";
    }
}
