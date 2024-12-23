package org.example.raffplasticjava;

import java.math.BigDecimal;

/**
 * Represents a Grondstof (Raw Material).
 */
public class Grondstof {
    public enum Kwaliteit {
        LAAG(25), NORMAAL(50), HOOG(75);

        private final int prijsPerTon;

        Kwaliteit(int prijsPerTon) {
            this.prijsPerTon = prijsPerTon;
        }

        public int getPrijsPerTon() {
            return prijsPerTon;
        }
    }

    private int grondstofID;
    private String type;
    private Kwaliteit kwaliteit;
    private BigDecimal prijs;

    public Grondstof(int grondstofID, String type, Kwaliteit kwaliteit, BigDecimal prijs) {
        this.setGrondstofID(grondstofID);
        this.setType(type);
        this.setKwaliteit(kwaliteit);
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
        if (type == null || type.isEmpty()) {
            throw new IllegalArgumentException("Type mag niet leeg zijn.");
        }
        this.type = type;
    }

    public Kwaliteit getKwaliteit() {
        return kwaliteit;
    }

    public void setKwaliteit(Kwaliteit kwaliteit) {
        if (kwaliteit == null) {
            throw new IllegalArgumentException("Kwaliteit mag niet null zijn.");
        }
        this.kwaliteit = kwaliteit;
    }

    public BigDecimal getPrijs() {
        return prijs;
    }

    public void setPrijs(BigDecimal prijs) {
        if (prijs == null || prijs.compareTo(BigDecimal.ZERO) < 0) {
            throw new IllegalArgumentException("Prijs moet een positief bedrag zijn.");
        }
        this.prijs = prijs;
    }
}
