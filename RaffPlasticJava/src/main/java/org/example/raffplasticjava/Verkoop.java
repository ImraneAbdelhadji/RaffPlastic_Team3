package org.example.raffplasticjava;

import java.time.LocalDateTime;

public class Verkoop {
    private int verkoopID;
    private LocalDateTime datum;
    private String klantNaam;
    private float totaalBedrag;

    public Verkoop(int verkoopID, LocalDateTime datum, String klantNaam, float totaalBedrag) {
        this.verkoopID = verkoopID;
        this.datum = datum;
        this.klantNaam = klantNaam;
        this.totaalBedrag = totaalBedrag;
    }

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

    public String getKlantNaam() {
        return klantNaam;
    }

    public void setKlantNaam(String klantNaam) {
        this.klantNaam = klantNaam;
    }

    public float getTotaalBedrag() {
        return totaalBedrag;
    }

    public void setTotaalBedrag(float totaalBedrag) {
        this.totaalBedrag = totaalBedrag;
    }
}
