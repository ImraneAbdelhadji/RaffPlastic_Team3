package org.example.raffplasticjava;

public class Grondstof {
    private int grondstofID;
    private String type;
    private char kwaliteit;
    private float prijs;

    public Grondstof(int grondstofID, String type, char kwaliteit, float prijs) {
        this.setGrondstofID(grondstofID);
        this.type = type;
        this.kwaliteit = kwaliteit;
        this.setPrijs(prijs);
    }

    public int getGrondstofID() {
        return grondstofID;
    }

    public void setGrondstofID(int grondstofID) {
        if (grondstofID <= 0) {
            throw new IllegalArgumentException("GrondstofID moet een positief getal zijn.");
        }
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
        if (prijs < 25.0f) {
            throw new IllegalArgumentException("De prijs moet minimaal 25 euro zijn.");
        }
        this.prijs = prijs;
    }
}
