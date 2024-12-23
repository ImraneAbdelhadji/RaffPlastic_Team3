package org.example.raffplasticjava;

/**
 * Represents an Afval (Waste) item.
 */
public class Afval {
    private int afvalID;
    private String type;

    public Afval(int afvalID, String type) {
        this.setAfvalID(afvalID);
        this.setType(type);
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
        if (type == null || type.isEmpty()) {
            throw new IllegalArgumentException("Type mag niet leeg zijn.");
        }
        this.type = type;
    }
}
