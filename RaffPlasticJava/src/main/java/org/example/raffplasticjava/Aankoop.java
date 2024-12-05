package org.example.raffplasticjava;

import java.time.LocalDateTime;
import java.util.List;

public class Aankoop {
    private int aankoopID;
    private LocalDateTime datum;
    private String leverancier;
    private float totaalBedrag; // Of totaal gewicht
    private List<Afval> afvalLijst;

    // Constructor
    public Aankoop(int aankoopID, LocalDateTime datum, String leverancier, float totaalBedrag, List<Afval> afvalLijst) {
        this.aankoopID = aankoopID;
        this.datum = datum;
        this.leverancier = leverancier;
        this.totaalBedrag = totaalBedrag;
        this.afvalLijst = afvalLijst;
    }

    // Getters
    public int getAankoopID() {
        return aankoopID;
    }

    public LocalDateTime getDatum() {
        return datum;
    }

    public String getLeverancier() {
        return leverancier;
    }

    public float getTotaalBedrag() { // Controleer dat deze methode bestaat
        return totaalBedrag;
    }

    public List<Afval> getAfvalLijst() {
        return afvalLijst;
    }

    // Setters (optioneel)
    public void setTotaalBedrag(float totaalBedrag) {
        this.totaalBedrag = totaalBedrag;
    }
}
