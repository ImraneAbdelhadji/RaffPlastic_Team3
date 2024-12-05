package org.example.raffplasticjava;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== RAFF Plastics Workflow Start ===");

        // 1. Registratie van afvalstromen
        System.out.println("\n>> Stap 1: Afval Registreren");
        Afval afval1 = new Afval(1, "PP (Polypropyleen)", 500.0f, "Leverancier A");
        Afval afval2 = new Afval(2, "HDPE (Hoge dichtheid Polyethyleen)", 300.0f, "Leverancier B");

        // Output om afval te controleren
        System.out.println("Geregistreerd Afval:");
        System.out.println("- Afval ID: " + afval1.getAfvalID() + ", Type: " + afval1.getType() + ", Gewicht: " + afval1.getGewicht() + " kg");
        System.out.println("- Afval ID: " + afval2.getAfvalID() + ", Type: " + afval2.getType() + ", Gewicht: " + afval2.getGewicht() + " kg");

        // 2. Ontvangst van lading
        System.out.println("\n>> Stap 2: Lading Ontvangen");
        Lading lading1 = new Lading(101, 800.0f, LocalDateTime.now(), "Leverancier A");
        System.out.println("Lading ontvangen van: " + lading1.getLeverancier() + ", Gewicht: " + lading1.getGewicht() + " kg");

        // 3. Aankoop registreren
        System.out.println("\n>> Stap 3: Aankoop Registreren");
        List<Afval> afvalLijst = new ArrayList<>();
        afvalLijst.add(afval1);
        afvalLijst.add(afval2);

        Aankoop aankoop1 = new Aankoop(201, LocalDateTime.now(), "Leverancier A", 800.0f, afvalLijst);
        System.out.println("Aankoop ID: " + aankoop1.getAankoopID()
                + ", Leverancier: " + aankoop1.getLeverancier()
                + ", Totaal Gewicht: " + aankoop1.getTotaalBedrag() + " kg");

        // 4. Verwerking van afval naar grondstoffen
        System.out.println("\n>> Stap 4: Afval Verwerken naar Grondstoffen");
        Grondstof grondstof1 = new Grondstof(1, "PP", 'A', 1000.0f);
        Grondstof grondstof2 = new Grondstof(2, "HDPE", 'B', 1500.0f);

        System.out.println("Geproduceerde Grondstoffen:");
        System.out.println("- Grondstof ID: " + grondstof1.getGrondstofID() + ", Type: " + grondstof1.getType() + ", Kwaliteit: " + grondstof1.getKwaliteit() + ", Prijs: €" + grondstof1.getPrijs());
        System.out.println("- Grondstof ID: " + grondstof2.getGrondstofID() + ", Type: " + grondstof2.getType() + ", Kwaliteit: " + grondstof2.getKwaliteit() + ", Prijs: €" + grondstof2.getPrijs());

        // 5. Klantbestelling plaatsen
        System.out.println("\n>> Stap 5: Bestelling Plaatsen");
        Bestelling bestelling1 = new Bestelling(301, LocalDateTime.now(), "In behandeling");
        System.out.println("Bestelling ID: " + bestelling1.getBestellingID() + ", Status: " + bestelling1.getStatus());

        // 6. Verkoop van grondstoffen aan klant
        System.out.println("\n>> Stap 6: Verkoop Registreren");
        Verkoop verkoop1 = new Verkoop(401, LocalDateTime.now(), "Klant X", 2500.0f);
        System.out.println("Verkoop ID: " + verkoop1.getVerkoopID() + ", Klant: " + verkoop1.getKlantNaam() + ", Bedrag: €" + verkoop1.getTotaalBedrag());

        // 7. Procesoverzicht
        System.out.println("\n=== Overzicht van het Proces ===");
        System.out.println("Afval ontvangen van: " + afval1.getLeverancier());
        System.out.println("Afval verwerkt naar grondstof: " + grondstof1.getType());
        System.out.println("Grondstof verkocht aan klant: " + verkoop1.getKlantNaam() + " voor €" + verkoop1.getTotaalBedrag());

        System.out.println("\n=== RAFF Plastics Workflow Einde ===");
    }
}
