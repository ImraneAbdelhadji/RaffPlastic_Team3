package org.example.raffplasticjava;

import java.time.LocalDateTime;

public class Lading {
    private int ladingID;
    private double gewicht;
    private LocalDateTime datumOntvangst;
    private int leverancierID;
    private int afvalID;

    public Lading(int ladingID, double gewicht, LocalDateTime datumOntvangst, int leverancierID, int afvalID) {
        this.ladingID = ladingID;
        this.gewicht = gewicht;
        this.datumOntvangst = datumOntvangst;
        this.leverancierID = leverancierID;
        this.afvalID = afvalID;
    }

    public int getLadingID() {
        return ladingID;
    }

    public void setLadingID(int ladingID) {
        this.ladingID = ladingID;
    }

    public double getGewicht() {
        return gewicht;
    }

    public void setGewicht(double gewicht) {
        this.gewicht = gewicht;
    }

    public LocalDateTime getDatumOntvangst() {
        return datumOntvangst;
    }

    public void setDatumOntvangst(LocalDateTime datumOntvangst) {
        this.datumOntvangst = datumOntvangst;
    }

    public int getLeverancierID() {
        return leverancierID;
    }

    public void setLeverancierID(int leverancierID) {
        this.leverancierID = leverancierID;
    }

    public int getAfvalID() {
        return afvalID;
    }

    public void setAfvalID(int afvalID) {
        this.afvalID = afvalID;
    }
}
