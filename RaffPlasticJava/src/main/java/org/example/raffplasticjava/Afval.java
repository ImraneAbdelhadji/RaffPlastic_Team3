package org.example.raffplasticjava;

public class Afval {
    private int afvalID;
    private String type;
    private float gewicht;
    private String leverancier;

    public Afval(int afvalID, String type, float gewicht, String leverancier) {
        this.afvalID = afvalID;
        this.type = type;
        this.gewicht = gewicht;
        this.leverancier = leverancier;
    }

    public int getAfvalID() {
        return afvalID;
    }

    public void setAfvalID(int afvalID) {
        this.afvalID = afvalID;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public float getGewicht() {
        return gewicht;
    }

    public void setGewicht(float gewicht) {
        this.gewicht = gewicht;
    }

    public String getLeverancier() {
        return leverancier;
    }

    public void setLeverancier(String leverancier) {
        this.leverancier = leverancier;
    }
}
