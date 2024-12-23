package org.example.raffplasticjava;

/**
 * Berekening van de prijs op basis van kwaliteit en gewicht.
 */
public class PrijsBerekening {

    /**
     * Bereken de totale prijs op basis van kwaliteit en gewicht.
     *
     * @param kwaliteit de kwaliteit van het product: laag, normaal of hoog
     * @param gewicht het gewicht in ton (tussen 25 en 50 ton)
     * @return de totale prijs
     * @throws IllegalArgumentException als de kwaliteit ongeldig is of het gewicht buiten de geldige range valt
     */
    public double berekenPrijs(String kwaliteit, double gewicht) {
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
