package org.example.raffplasticjava;

public class Afval implements Item {
    private int afvalID;
    private String type;
    private double hoeveelheid;
    private String status;

    // Constructor
    public Afval(int afvalID, String type, double hoeveelheid, String status) {
        this.afvalID = afvalID;
        this.type = type;
        this.hoeveelheid = hoeveelheid;
        this.status = status;
    }

    @Override
    public int getID() {
        return afvalID;
    }

    @Override
    public String getType() {
        return type;
    }

    @Override
    public double getHoeveelheid() {
        return hoeveelheid;
    }

    public String getStatus() {
        return status;
    }

    // toString voor betere output van Afval objecten
    @Override
    public String toString() {
        return String.format("Afval ID: %d, Type: %s, Hoeveelheid: %.2f, Status: %s",
                afvalID, type, hoeveelheid, status);
    }
}