package org.example.raffplasticjava;

public class Klant {
    private int klantID;
    private String voornaam;
    private String achternaam;
    private String email;

    public Klant(int klantID, String voornaam, String achternaam, String email) {
        this.setKlantID(klantID); // Validatie via setter
        this.voornaam = voornaam;
        this.achternaam = achternaam;
        this.setEmail(email); // Validatie via setter
    }

    public int getKlantID() {
        return klantID;
    }

    public void setKlantID(int klantID) {
        if (klantID <= 0) {
            throw new IllegalArgumentException("KlantID moet een positief getal zijn.");
        }
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
        if (email == null || !email.matches("^[^@\\s]+@[^@\\s]+\\.[^@\\s]+$")) {
            throw new IllegalArgumentException("Ongeldig e-mailadres.");
        }
        this.email = email;
    }
}
