package org.example.raffplasticjava;

public class Lading implements Item {
    private int ladingID;
    private String type;
    private double hoeveelheid;
    private String inhoud;
    private double gewicht;
    private String locatie;

    // Constructor
    public Lading(int ladingID, String type, double hoeveelheid, String inhoud, double gewicht, String locatie) {
        this.ladingID = ladingID;
        this.type = type;
        this.hoeveelheid = hoeveelheid;
        this.inhoud = inhoud;
        this.gewicht = gewicht;
        this.locatie = locatie;
    }

    @Override
    public int getID() {
        return ladingID;
    }

    @Override
    public String getType() {
        return type;
    }

    @Override
    public double getHoeveelheid() {
        return hoeveelheid;
    }

    public String getLocatie() {
        return locatie;
    }

    // toString voor betere output van Lading objecten
    @Override
    public String toString() {
        return String.format("Lading ID: %d, Type: %s, Hoeveelheid: %.2f, Inhoud: %s, Gewicht: %.2f, Locatie: %s",
                ladingID, type, hoeveelheid, inhoud, gewicht, locatie);
    }
}