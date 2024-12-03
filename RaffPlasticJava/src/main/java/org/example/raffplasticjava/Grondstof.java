package org.example.raffplasticjava;

public class Grondstof implements Item {
    private int id;
    private String type;
    private double hoeveelheid;
    private String kwaliteit;

    // Toegevoegde specifieke grondstoffen
    public enum GrondstofType {
        PP("Polypropyleen (pp)"),
        HDPE("Hogedichtheidspolyethyleen (HDPE)"),
        PS("Polystyreen (ps)"),
        PVC("Polyvinylchloride (pvc)");

        
        private final String description;

        GrondstofType(String description) {
            this.description = description;
        }

        public String getDescription() {
            return description;
        }
    }

    private GrondstofType grondstofType;

    // Constructor om een grondstof te maken met type, hoeveelheid, en kwaliteit
    public Grondstof(int id, String type, double hoeveelheid, String kwaliteit, GrondstofType grondstofType) {
        this.id = id;
        this.type = type;
        this.hoeveelheid = hoeveelheid;
        this.kwaliteit = kwaliteit;
        this.grondstofType = grondstofType;
    }

    @Override
    public int getID() {
        return id;
    }

    @Override
    public String getType() {
        return type;
    }

    @Override
    public double getHoeveelheid() {
        return hoeveelheid;
    }

    public String getKwaliteit() {
        return kwaliteit;
    }

    public GrondstofType getGrondstofType() {
        return grondstofType;
    }

    // toString voor betere output van Grondstof objecten
    @Override
    public String toString() {
        return String.format("Grondstof ID: %d, Type: %s, Hoeveelheid: %.2f, Kwaliteit: %s, GrondstofType: %s",
                id, type, hoeveelheid, kwaliteit, grondstofType.getDescription());
    }
}