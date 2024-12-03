package org.example.raffplasticjava;

public class Main {
    public static void main(String[] args) {
        // Voorbeeld van het maken van een Lading
        Lading lading = new Lading(1, "PVC", 500, " zuurstofmaskers", 300, "Ziekenhuis");

        // Voorbeeld van een Grondstof met een specifiek type (bijvoorbeeld Polypropyleen)
        Grondstof grondstof = new Grondstof(4, "PVC", 200, "Hoogwaardig", Grondstof.GrondstofType.PVC);

        // Voorbeeld van een Inventaris
        Inventaris inventaris = new Inventaris(101, "Magazijn B");
        inventaris.voegItemToe(lading);
        inventaris.voegItemToe(grondstof);

        // Operator
        Operator operator = new Operator(1001, "John Doe", "Manager");

        // Output
        System.out.println("Inventaris Locatie: " + inventaris.getItems().get(0).toString());
        System.out.println("Operator Naam: " + operator.getNaam());
        System.out.println("Grondstof Type: " + grondstof.getGrondstofType().getDescription());
    }
}