package org.example.raffplasticjava;

import java.time.LocalDateTime;

public class Lading {
    private int ladingID;
    private float gewicht;
    private LocalDateTime datumOntvangst;
    private String leverancier;

    public Lading(int ladingID, float gewicht, LocalDateTime datumOntvangst, String leverancier) {
        this.ladingID = ladingID;
        this.gewicht = gewicht;
        this.datumOntvangst = datumOntvangst;
        this.leverancier = leverancier;
    }

    public int getLadingID() {
        return ladingID;
    }

    public void setLadingID(int ladingID) {
        this.ladingID = ladingID;
    }

    public float getGewicht() {
        return gewicht;
    }

    public void setGewicht(float gewicht) {
        this.gewicht = gewicht;
    }

    public LocalDateTime getDatumOntvangst() {
        return datumOntvangst;
    }

    public void setDatumOntvangst(LocalDateTime datumOntvangst) {
        this.datumOntvangst = datumOntvangst;
    }

    public String getLeverancier() {
        return leverancier;
    }

    public void setLeverancier(String leverancier) {
        this.leverancier = leverancier;
    }
}
