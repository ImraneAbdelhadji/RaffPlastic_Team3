package org.example.raffplasticjava;

import java.time.LocalDateTime;

public class Aankoop {
    private int aankoopID;
    private LocalDateTime datum;
    private int leverancierID;
    private float totaalBedrag;
    private int bestellingID;

    public Aankoop(int aankoopID, LocalDateTime datum, int leverancierID, float totaalBedrag, int bestellingID) {
        this.aankoopID = aankoopID;
        this.datum = datum;
        this.leverancierID = leverancierID;
        this.totaalBedrag = totaalBedrag;
        this.bestellingID = bestellingID;
    }

    public int getAankoopID() {
        return aankoopID;
    }

    public void setAankoopID(int aankoopID) {
        this.aankoopID = aankoopID;
    }

    public LocalDateTime getDatum() {
        return datum;
    }

    public void setDatum(LocalDateTime datum) {
        this.datum = datum;
    }

    public int getLeverancierID() {
        return leverancierID;
    }

    public void setLeverancierID(int leverancierID) {
        this.leverancierID = leverancierID;
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
}
