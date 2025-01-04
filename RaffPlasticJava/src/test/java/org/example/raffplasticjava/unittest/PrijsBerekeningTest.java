package org.example.raffplasticjava.unittest;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PrijsBerekeningTest {

    // Methode om de prijs te berekenen op basis van kwaliteit en gewicht
    private double berekenPrijs(String kwaliteit, double gewicht) {
        if (gewicht < 25 || gewicht > 50) {
            throw new IllegalArgumentException("Gewicht moet tussen 25t en 50t liggen.");
        }
        double prijsPerTon;
        switch (kwaliteit.toLowerCase()) {
            case "laag":
                prijsPerTon = 25.0;
                break;
            case "normaal":
                prijsPerTon = 50.0;
                break;
            case "hoog":
                prijsPerTon = 75.0;
                break;
            default:
                throw new IllegalArgumentException("Onbekende kwaliteit. Kies uit: 'laag', 'normaal', 'hoog'.");
        }
        return prijsPerTon * gewicht;
    }
}
