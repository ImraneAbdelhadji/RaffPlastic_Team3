package org.example.raffplasticjava;

public class Klant {
    private int klantID;
    private String voornaam;
    private String achternaam;
    private String email;

    // Constructor
    public Klant(int klantID, String voornaam, String achternaam, String email) {
        this.setKlantID(klantID);
        this.setVoornaam(voornaam);
        this.setAchternaam(achternaam);
        this.setEmail(email);
    }

    // Getters en Setters
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
        if (voornaam == null || voornaam.trim().isEmpty()) {
            throw new IllegalArgumentException("Voornaam mag niet leeg zijn.");
        }
        this.voornaam = voornaam;
    }

    public String getAchternaam() {
        return achternaam;
    }

    public void setAchternaam(String achternaam) {
        if (achternaam == null || achternaam.trim().isEmpty()) {
            throw new IllegalArgumentException("Achternaam mag niet leeg zijn.");
        }
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

    @Override
    public String toString() {
        return "Klant{" +
                "klantID=" + klantID +
                ", voornaam='" + voornaam + '\'' +
                ", achternaam='" + achternaam + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
