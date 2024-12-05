package org.example.raffplasticjava;

import java.time.LocalDateTime;

public class Bestelling {
    private int bestellingID;
    private LocalDateTime datum;
    private String status;

    public Bestelling(int bestellingID, LocalDateTime datum, String status) {
        this.bestellingID = bestellingID;
        this.datum = datum;
        this.status = status;
    }

    public int getBestellingID() {
        return bestellingID;
    }

    public void setBestellingID(int bestellingID) {
        this.bestellingID = bestellingID;
    }

    public LocalDateTime getDatum() {
        return datum;
    }

    public void setDatum(LocalDateTime datum) {
        this.datum = datum;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
