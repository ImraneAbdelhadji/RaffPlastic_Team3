package org.example.raffplasticjava;

public class Bestelling {
    private int bestellingID;
    private String type;
    private String status;

    public Bestelling(int bestellingID, String type, String status) {
        this.bestellingID = bestellingID;
        this.type = type;
        this.status = status;
    }

    public int getBestellingID() {
        return bestellingID;
    }

    public void setBestellingID(int bestellingID) {
        this.bestellingID = bestellingID;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
