package org.example.raffplasticjava;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BestellingTest {

    @Test
    public void testBestellingConstructor() {
        Bestelling bestelling = new Bestelling(1, "Type A", "In progress");

        assertEquals(1, bestelling.getBestellingID());
        assertEquals("Type A", bestelling.getType());
        assertEquals("In progress", bestelling.getStatus());

        bestelling = new Bestelling(2, "Type B", "Completed");
        assertEquals(2, bestelling.getBestellingID());
        assertEquals("Type B", bestelling.getType());
        assertEquals("Completed", bestelling.getStatus());
    }

    @Test
    public void testSettersAndValidation() {
        Bestelling bestelling = new Bestelling(3, "Type C", "Pending");

        bestelling.setType("Type D");
        bestelling.setStatus("In progress");

        assertEquals("Type D", bestelling.getType());
        assertEquals("In progress", bestelling.getStatus());

        bestelling.setBestellingID(5);
        assertEquals(5, bestelling.getBestellingID());

        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            bestelling.setBestellingID(-1); // Negatief of nul bestellingID moet een fout genereren
        });
        assertEquals("BestellingID moet een positief getal zijn.", exception.getMessage());
    }
}
