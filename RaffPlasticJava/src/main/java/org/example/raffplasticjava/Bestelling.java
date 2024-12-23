package org.example.raffplasticjava;

/**
 * Represents a Bestelling (Order).
 */
public class Bestelling {
    private int bestellingID;
    private String type;
    private String status;

    public Bestelling(int bestellingID, String type, String status) {
        this.setBestellingID(bestellingID);
        this.setType(type);
        this.setStatus(status);
    }

    public int getBestellingID() {
        return bestellingID;
    }

    public void setBestellingID(int bestellingID) {
        if (bestellingID <= 0) {
            throw new IllegalArgumentException("BestellingID moet een positief getal zijn.");
        }
        this.bestellingID = bestellingID;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        if (type == null || type.isEmpty()) {
            throw new IllegalArgumentException("Type mag niet leeg zijn.");
        }
        this.type = type;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        if (status == null || status.isEmpty()) {
            throw new IllegalArgumentException("Status mag niet leeg zijn.");
        }
        this.status = status;
    }
}
