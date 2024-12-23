package org.example.raffplasticjava;

import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * Represents an Aankoop (Purchase) with details such as supplier and amount.
 */
public class Aankoop {
    private int aankoopID;
    private LocalDateTime datum;
    private int leverancierID;
    private BigDecimal totaalBedrag;
    private int bestellingID;

    public Aankoop(int aankoopID, LocalDateTime datum, int leverancierID, BigDecimal totaalBedrag, int bestellingID) {
        this.setAankoopID(aankoopID);
        this.setDatum(datum);
        this.setLeverancierID(leverancierID);
        this.setTotaalBedrag(totaalBedrag);
        this.setBestellingID(bestellingID);
    }

    public int getAankoopID() {
        return aankoopID;
    }

    public void setAankoopID(int aankoopID) {
        if (aankoopID <= 0) {
            throw new IllegalArgumentException("AankoopID moet een positief getal zijn.");
        }
        this.aankoopID = aankoopID;
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

    public int getLeverancierID() {
        return leverancierID;
    }

    public void setLeverancierID(int leverancierID) {
        if (leverancierID <= 0) {
            throw new IllegalArgumentException("LeverancierID moet een positief getal zijn.");
        }
        this.leverancierID = leverancierID;
    }

    public BigDecimal getTotaalBedrag() {
        return totaalBedrag;
    }

    public void setTotaalBedrag(BigDecimal totaalBedrag) {
        if (totaalBedrag == null || totaalBedrag.compareTo(BigDecimal.ZERO) < 0) {
            throw new IllegalArgumentException("Totaalbedrag moet een positief bedrag zijn.");
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
}
