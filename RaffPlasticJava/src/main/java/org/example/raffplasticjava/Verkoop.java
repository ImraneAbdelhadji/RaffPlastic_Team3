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
        this.verkoopID = verkoopID;
        this.datum = datum;
        this.klantID = klantID;
        this.totaalBedrag = totaalBedrag;
        this.bestellingID = bestellingID;
        this.grondstofID = grondstofID;
    }

    // Getters en Setters

    public int getVerkoopID() {
        return verkoopID;
    }

    public void setVerkoopID(int verkoopID) {
        this.verkoopID = verkoopID;
    }

    public LocalDateTime getDatum() {
        return datum;
    }

    public void setDatum(LocalDateTime datum) {
        this.datum = datum;
    }

    public int getKlantID() {
        return klantID;
    }

    public void setKlantID(int klantID) {
        this.klantID = klantID;
    }

    public float getTotaalBedrag() {
        return totaalBedrag;
    }

    public void setTotaalBedrag(float totaalBedrag) {
        this.totaalBedrag = totaalBedrag;
    }

    public int getBestellingID() {
        return bestellingID;
    }

    public void setBestellingID(int bestellingID) {
        this.bestellingID = bestellingID;
    }

    public int getGrondstofID() {
        return grondstofID;
    }

    public void setGrondstofID(int grondstofID) {
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
