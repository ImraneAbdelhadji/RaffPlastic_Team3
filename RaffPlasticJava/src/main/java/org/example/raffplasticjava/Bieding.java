package org.example.raffplasticjava;

/**
 * Representatie van een bieding.
 */
public class Bieding {
    private final String afvalType;
    private final double hoeveelheid;
    private final double prijs;
    private final String status;

    public Bieding(String afvalType, double hoeveelheid, double prijs, String status) {
        this.afvalType = afvalType;
        this.hoeveelheid = hoeveelheid;
        this.prijs = prijs;
        this.status = status;
    }

    public String getAfvalType() {
        return afvalType;
    }

    public double getHoeveelheid() {
        return hoeveelheid;
    }

    public double getPrijs() {
        return prijs;
    }

    public String getStatus() {
        return status;
    }
}
