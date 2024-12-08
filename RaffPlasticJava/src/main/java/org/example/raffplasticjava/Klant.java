package org.example.raffplasticjava;

public class Klant {
    private int klantID;
    private String voornaam;
    private String achternaam;
    private String email;

    public Klant(int klantID, String voornaam, String achternaam, String email) {
        this.klantID = klantID;
        this.voornaam = voornaam;
        this.achternaam = achternaam;
        this.email = email;
    }

    public int getKlantID() {
        return klantID;
    }

    public void setKlantID(int klantID) {
        this.klantID = klantID;
    }

    public String getVoornaam() {
        return voornaam;
    }

    public void setVoornaam(String voornaam) {
        this.voornaam = voornaam;
    }

    public String getAchternaam() {
        return achternaam;
    }

    public void setAchternaam(String achternaam) {
        this.achternaam = achternaam;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
