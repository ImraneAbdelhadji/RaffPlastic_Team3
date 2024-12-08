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
    }

    @Test
    public void testSettersAndGetters() {
        Bestelling bestelling = new Bestelling(2, "Type B", "Completed");

        bestelling.setType("Type C");
        bestelling.setStatus("Pending");

        assertEquals("Type C", bestelling.getType());
        assertEquals("Pending", bestelling.getStatus());
    }
}
