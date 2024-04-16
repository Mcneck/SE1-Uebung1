package org.hbrs.se1.ss24.uebung1.client;
import org.hbrs.se1.ss24.uebung1.businesslogic.NumberTransformer;
import org.hbrs.se1.ss24.uebung1.factory.NumberTransformerFactory;

public class Client {
    public void printTransformation(int number) {
        NumberTransformer romanTransformer = NumberTransformerFactory.createRomanFormatNumberTransformer();
        String result = romanTransformer.transformNumber(number); // Hier fehlt noch was
        System.out.println("Die römische Schreibweise der Zahl " + number + " ist: " + result);

    }
}
