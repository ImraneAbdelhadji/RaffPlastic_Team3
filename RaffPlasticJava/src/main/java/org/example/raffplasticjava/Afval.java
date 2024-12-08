package org.example.raffplasticjava;

public class Afval {
    private int afvalID;
    private String type;

    public Afval(int afvalID, String type) {
        this.setAfvalID(afvalID); // Gebruik de setter voor validatie
        this.type = type;
    }

    public int getAfvalID() {
        return afvalID;
    }

    public void setAfvalID(int afvalID) {
        if (afvalID <= 0) {
            throw new IllegalArgumentException("AfvalID moet een positief getal zijn.");
        }
        this.afvalID = afvalID;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
