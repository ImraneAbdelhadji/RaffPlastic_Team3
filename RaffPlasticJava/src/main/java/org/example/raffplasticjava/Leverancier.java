package org.example.raffplasticjava;

public class Leverancier {
    private int leverancierID;
    private String naam;
    private String email;

    public Leverancier(int leverancierID, String naam, String email) {
        this.leverancierID = leverancierID;
        this.naam = naam;
        this.email = email;
    }

    public int getLeverancierID() {
        return leverancierID;
    }

    public void setLeverancierID(int leverancierID) {
        this.leverancierID = leverancierID;
    }

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
}
