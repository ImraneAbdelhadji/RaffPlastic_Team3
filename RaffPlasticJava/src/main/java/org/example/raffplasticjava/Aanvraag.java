package org.example.raffplasticjava;

public class Aanvraag {
    private String naam;
    private String email;
    private double prijs;
    private double gewicht;
    private String kwaliteit;
    private String soortPlastic;

    // Constructor
    public Aanvraag(String naam, String email, double prijs, double gewicht, String kwaliteit, String soortPlastic) {
        this.naam = naam;
        this.email = email;
        this.prijs = prijs;
        this.gewicht = gewicht;
        this.kwaliteit = kwaliteit;
        this.soortPlastic = soortPlastic;
    }

    // Getters en Setters
    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getPrijs() {
        return prijs;
    }

    public void setPrijs(double prijs) {
        this.prijs = prijs;
    }

    public double getGewicht() {
        return gewicht;
    }

    public void setGewicht(double gewicht) {
        this.gewicht = gewicht;
    }

    public String getKwaliteit() {
        return kwaliteit;
    }

    public void setKwaliteit(String kwaliteit) {
        this.kwaliteit = kwaliteit;
    }

    public String getSoortPlastic() {
        return soortPlastic;
    }

    public void setSoortPlastic(String soortPlastic) {
        this.soortPlastic = soortPlastic;
    }
}
