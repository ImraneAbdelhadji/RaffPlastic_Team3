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

    @Test
    void testLageKwaliteitBinnenGeldigeGewichtsklasse() {
        double gewicht = 26; // Geldig gewicht
        String kwaliteit = "laag";
        double verwachtePrijs = 25.0 * gewicht;
        assertEquals(verwachtePrijs, berekenPrijs(kwaliteit, gewicht), 0.01);
    }

    @Test
    void testNormaleKwaliteitBinnenGeldigeGewichtsklasse() {
        double gewicht = 40; // Geldig gewicht
        String kwaliteit = "normaal";
        double verwachtePrijs = 50.0 * gewicht;
        assertEquals(verwachtePrijs, berekenPrijs(kwaliteit, gewicht), 0.01);
    }

    @Test
    void testHogeKwaliteitBinnenGeldigeGewichtsklasse() {
        double gewicht = 50; // Geldig gewicht
        String kwaliteit = "hoog";
        double verwachtePrijs = 75.0 * gewicht;
        assertEquals(verwachtePrijs, berekenPrijs(kwaliteit, gewicht), 0.01);
    }


}
