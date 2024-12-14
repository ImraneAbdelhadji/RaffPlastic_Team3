package org.example.raffplasticjava;

public class GrondstofValidator {

    public boolean isValidType(String type) {
        return type != null && (type.equals("HDPE") || type.equals("PP") || type.equals("PS") || type.equals("PVC"));
    }

    public boolean isValidKwaliteit(String kwaliteit) {
        return kwaliteit != null && (kwaliteit.equals("A") || kwaliteit.equals("B") || kwaliteit.equals("C"));
    }

    public boolean isValidPrijs(Double prijs) {
        return prijs != null && prijs >= 25.0;
    }

    public boolean isValidGewicht(Double gewicht) {
        return gewicht != null && gewicht >= 250.0;
    }
}