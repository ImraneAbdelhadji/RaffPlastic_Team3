package org.example.raffplasticjava;

import java.util.ArrayList;

public class Inventaris {
    private int inventarisID;
    private String locatie;
    private ArrayList<Item> items; // Lijst voor alle items (Lading, Grondstof, Afval)

    // Constructor
    public Inventaris(int inventarisID, String locatie) {
        this.inventarisID = inventarisID;
        this.locatie = locatie;
        this.items = new ArrayList<>();
    }

    // Methode om een item toe te voegen aan de inventaris
    public void voegItemToe(Item item) {
        items.add(item); // Voeg item toe aan de lijst
    }

    // Methode om alle items op te halen
    public ArrayList<Item> getItems() {
        return items;
    }
}
