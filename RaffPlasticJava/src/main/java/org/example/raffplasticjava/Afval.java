package org.example.raffplasticjava;

public class Afval {
    private int afvalID;
    private String type;

    public Afval(int afvalID, String type) {
        this.afvalID = afvalID;
        this.type = type;
    }

    public int getAfvalID() {
        return afvalID;
    }

    public void setAfvalID(int afvalID) {
        this.afvalID = afvalID;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
