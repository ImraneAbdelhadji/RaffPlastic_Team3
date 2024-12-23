package org.example.raffplasticjava;

import java.time.LocalDateTime;

public class Lading {
    private int ladingID;
    private double gewicht;
    private LocalDateTime datumOntvangst;
    private int leverancierID;
    private int afvalID;

    // Constructor
    public Lading(int ladingID, double gewicht, LocalDateTime datumOntvangst, int leverancierID, int afvalID) {
        this.setLadingID(ladingID);
        this.setGewicht(gewicht);
        this.setDatumOntvangst(datumOntvangst);
        this.setLeverancierID(leverancierID);
        this.setAfvalID(afvalID);
    }

    // Getters en Setters
    public int getLadingID() {
        return ladingID;
    }

    public void setLadingID(int ladingID) {
        if (ladingID <= 0) {
            throw new IllegalArgumentException("LadingID moet een positief getal zijn.");
        }
        this.ladingID = ladingID;
    }

    public double getGewicht() {
        return gewicht;
    }

    public void setGewicht(double gewicht) {
        if (gewicht < 25 || gewicht > 50) {
            throw new IllegalArgumentException("Gewicht moet tussen 25t en 50t liggen.");
        }
        this.gewicht = gewicht;
    }

    public LocalDateTime getDatumOntvangst() {
        return datumOntvangst;
    }

    public void setDatumOntvangst(LocalDateTime datumOntvangst) {
        if (datumOntvangst == null) {
            throw new IllegalArgumentException("Datum van ontvangst mag niet null zijn.");
        }
        this.datumOntvangst = datumOntvangst;
    }

    public int getLeverancierID() {
        return leverancierID;
    }

    public void setLeverancierID(int leverancierID) {
        if (leverancierID <= 0) {
            throw new IllegalArgumentException("LeverancierID moet een positief getal zijn.");
        }
        this.leverancierID = leverancierID;
    }

    public int getAfvalID() {
        return afvalID;
    }

    public void setAfvalID(int afvalID) {
        if (afvalID <= 0) {
            throw new IllegalArgumentException("AfvalID moet een positief getal zijn.");
        }
        this.afvalID = afvalID;
    }

    @Override
    public String toString() {
        return "Lading{" +
                "ladingID=" + ladingID +
                ", gewicht=" + gewicht +
                ", datumOntvangst=" + datumOntvangst +
                ", leverancierID=" + leverancierID +
                ", afvalID=" + afvalID +
                '}';
    }
}
