package org.example.raffplasticjava;

public class WinkelmandItem {
    private String grondstof;
    private String kwaliteit;
    private double hoeveelheid;
    private double prijs;

    public WinkelmandItem(String grondstof, String kwaliteit, double hoeveelheid, double prijs) {
        this.grondstof = grondstof;
        this.kwaliteit = kwaliteit;
        this.hoeveelheid = hoeveelheid;
        this.prijs = prijs;
    }

    public String getGrondstof() {
        return grondstof;
    }

    public void setGrondstof(String grondstof) {
        this.grondstof = grondstof;
    }

    public String getKwaliteit() {
        return kwaliteit;
    }

    public void setKwaliteit(String kwaliteit) {
        this.kwaliteit = kwaliteit;
    }

    public double getHoeveelheid() {
        return hoeveelheid;
    }

    public void setHoeveelheid(double hoeveelheid) {
        this.hoeveelheid = hoeveelheid;
    }

    public double getPrijs() {
        return prijs;
    }

    public void setPrijs(double prijs) {
        this.prijs = prijs;
    }
}