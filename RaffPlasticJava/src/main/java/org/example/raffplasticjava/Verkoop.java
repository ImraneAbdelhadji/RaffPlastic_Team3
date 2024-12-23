package org.example.raffplasticjava;

import java.time.LocalDateTime;

public class Verkoop {
    private int verkoopID;
    private LocalDateTime datum;
    private int klantID;
    private float totaalBedrag;
    private int bestellingID;
    private int grondstofID;

    // Constructor
    public Verkoop(int verkoopID, LocalDateTime datum, int klantID, float totaalBedrag, int bestellingID, int grondstofID) {
        this.setVerkoopID(verkoopID);
        this.setDatum(datum);
        this.setKlantID(klantID);
        this.setTotaalBedrag(totaalBedrag);
        this.setBestellingID(bestellingID);
        this.setGrondstofID(grondstofID);
    }

    // Getters en Setters
    public int getVerkoopID() {
        return verkoopID;
    }

    public void setVerkoopID(int verkoopID) {
        if (verkoopID <= 0) {
            throw new IllegalArgumentException("VerkoopID moet een positief getal zijn.");
        }
        this.verkoopID = verkoopID;
    }

    public LocalDateTime getDatum() {
        return datum;
    }

    public void setDatum(LocalDateTime datum) {
        if (datum == null) {
            throw new IllegalArgumentException("Datum mag niet null zijn.");
        }
        this.datum = datum;
    }

    public int getKlantID() {
        return klantID;
    }

    public void setKlantID(int klantID) {
        if (klantID <= 0) {
            throw new IllegalArgumentException("KlantID moet een positief getal zijn.");
        }
        this.klantID = klantID;
    }

    public float getTotaalBedrag() {
        return totaalBedrag;
    }

    public void setTotaalBedrag(float totaalBedrag) {
        if (totaalBedrag < 0) {
            throw new IllegalArgumentException("TotaalBedrag mag niet negatief zijn.");
        }
        this.totaalBedrag = totaalBedrag;
    }

    public int getBestellingID() {
        return bestellingID;
    }

    public void setBestellingID(int bestellingID) {
        if (bestellingID <= 0) {
            throw new IllegalArgumentException("BestellingID moet een positief getal zijn.");
        }
        this.bestellingID = bestellingID;
    }

    public int getGrondstofID() {
        return grondstofID;
    }

    public void setGrondstofID(int grondstofID) {
        if (grondstofID <= 0) {
            throw new IllegalArgumentException("GrondstofID moet een positief getal zijn.");
        }
        this.grondstofID = grondstofID;
    }

    @Override
    public String toString() {
        return "Verkoop{" +
                "verkoopID=" + verkoopID +
                ", datum=" + datum +
                ", klantID=" + klantID +
                ", totaalBedrag=" + totaalBedrag +
                ", bestellingID=" + bestellingID +
                ", grondstofID=" + grondstofID +
                '}';
    }
}
