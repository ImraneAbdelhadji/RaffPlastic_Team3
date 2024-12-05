package org.example.raffplasticjava;

public class Grondstof {
    private int grondstofID;
    private String type;
    private char kwaliteit;
    private float prijs;

    public Grondstof(int grondstofID, String type, char kwaliteit, float prijs) {
        this.grondstofID = grondstofID;
        this.type = type;
        this.kwaliteit = kwaliteit;
        this.prijs = prijs;
    }

    public int getGrondstofID() {
        return grondstofID;
    }

    public void setGrondstofID(int grondstofID) {
        this.grondstofID = grondstofID;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public char getKwaliteit() {
        return kwaliteit;
    }

    public void setKwaliteit(char kwaliteit) {
        this.kwaliteit = kwaliteit;
    }

    public float getPrijs() {
        return prijs;
    }

    public void setPrijs(float prijs) {
        this.prijs = prijs;
    }
}
