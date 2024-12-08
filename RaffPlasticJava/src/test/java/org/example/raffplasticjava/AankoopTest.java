package org.example.raffplasticjava;

import org.junit.jupiter.api.Test;
import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

public class AankoopTest {

    @Test
    public void testAankoopConstructor() {
        Aankoop aankoop = new Aankoop(1, LocalDateTime.now(), 2, 500.0f, 1);

        assertEquals(1, aankoop.getAankoopID());
        assertNotNull(aankoop.getDatum());
        assertEquals(2, aankoop.getLeverancierID());
        assertEquals(500.0f, aankoop.getTotaalBedrag());
        assertEquals(1, aankoop.getBestellingID());
    }

    @Test
    public void testSettersAndValidation() {
        Aankoop aankoop = new Aankoop(1, LocalDateTime.now(), 3, 600.0f, 2);

        aankoop.setTotaalBedrag(1000.0f);
        assertEquals(1000.0f, aankoop.getTotaalBedrag());

        Exception totaalBedragException = assertThrows(IllegalArgumentException.class, () -> {
            aankoop.setTotaalBedrag(-100.0f); // Negatief totaalbedrag moet een fout genereren
        });
        assertEquals("Het totaalbedrag mag niet negatief zijn.", totaalBedragException.getMessage());

        aankoop.setAankoopID(2);
        assertEquals(2, aankoop.getAankoopID());

        Exception aankoopIDException = assertThrows(IllegalArgumentException.class, () -> {
            aankoop.setAankoopID(0); // Negatief of nul aankoopID moet een fout genereren
        });
        assertEquals("AankoopID moet een positief getal zijn.", aankoopIDException.getMessage());
    }
}
