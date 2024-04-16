package org.hbrs.se1.ss24.uebung1.businesslogic;

import java.io.Serializable;

public abstract class Validation implements NumberTransformer {

    public static boolean isValidNumber(int number) {
        return number >= 1 && number <= 3000;
    }

}
