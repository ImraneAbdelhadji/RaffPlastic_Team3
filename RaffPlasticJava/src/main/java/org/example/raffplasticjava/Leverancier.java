package org.example.raffplasticjava;

public class Leverancier {
    private int leverancierID;
    private String naam;
    private String email;

    // Constructor
    public Leverancier(int leverancierID, String naam, String email) {
        this.setLeverancierID(leverancierID);
        this.setNaam(naam);
        this.setEmail(email);
    }

    // Getters en Setters
    public int getLeverancierID() {
        return leverancierID;
    }

    public void setLeverancierID(int leverancierID) {
        if (leverancierID <= 0) {
            throw new IllegalArgumentException("LeverancierID moet een positief getal zijn.");
        }
        this.leverancierID = leverancierID;
    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        if (naam == null || naam.trim().isEmpty()) {
            throw new IllegalArgumentException("Naam mag niet leeg zijn.");
        }
        this.naam = naam;
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
        return "Leverancier{" +
                "leverancierID=" + leverancierID +
                ", naam='" + naam + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
