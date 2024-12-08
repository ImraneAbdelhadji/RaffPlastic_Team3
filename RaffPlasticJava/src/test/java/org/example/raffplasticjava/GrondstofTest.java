package org.example.raffplasticjava;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class GrondstofTest {

    @Test
    public void testGrondstofConstructor() {
        Grondstof grondstof = new Grondstof(1, "HDPE", 'A', 50.0f);

        assertEquals(1, grondstof.getGrondstofID());
        assertEquals("HDPE", grondstof.getType());
        assertEquals('A', grondstof.getKwaliteit());
        assertEquals(50.0f, grondstof.getPrijs());

        grondstof = new Grondstof(2, "PP", 'B', 100.0f);

        assertEquals(2, grondstof.getGrondstofID());
        assertEquals("PP", grondstof.getType());
        assertEquals('B', grondstof.getKwaliteit());
        assertEquals(100.0f, grondstof.getPrijs());

        grondstof = new Grondstof(3, "PS", 'C', 30.0f);

        assertEquals(3, grondstof.getGrondstofID());
        assertEquals("PS", grondstof.getType());
        assertEquals('C', grondstof.getKwaliteit());
        assertEquals(30.0f, grondstof.getPrijs());

        grondstof = new Grondstof(4, "PVC", 'A', 65.0f);

        assertEquals(4, grondstof.getGrondstofID());
        assertEquals("PVC", grondstof.getType());
        assertEquals('A', grondstof.getKwaliteit());
        assertEquals(65.0f, grondstof.getPrijs());
    }

    @Test
    public void testSettersAndGetters() {
        Grondstof grondstof = new Grondstof(1, "HDPE", 'A', 50.0f);

        grondstof.setPrijs(30.0f);
        assertEquals(30.0f, grondstof.getPrijs());

        Exception prijsException = assertThrows(IllegalArgumentException.class, () -> {
            grondstof.setPrijs(10.0f); // Minder dan 25 moet een fout genereren
        });

        assertEquals("De prijs moet minimaal 25 euro zijn.", prijsException.getMessage());

        grondstof.setGrondstofID(2);
        assertEquals(2, grondstof.getGrondstofID());

        Exception idException = assertThrows(IllegalArgumentException.class, () -> {
            grondstof.setGrondstofID(0); // Negatief of nul moet een fout genereren
        });

        assertEquals("GrondstofID moet een positief getal zijn.", idException.getMessage());
    }
}
