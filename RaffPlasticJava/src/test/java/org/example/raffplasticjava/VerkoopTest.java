package org.example.raffplasticjava;

import org.junit.jupiter.api.Test;
import java.time.LocalDateTime;
import static org.junit.jupiter.api.Assertions.*;

public class VerkoopTest {

    @Test
    public void testVerkoopConstructor() {
        Verkoop verkoop = new Verkoop(1, LocalDateTime.now(), 1, 500.0f, 1, 1);

        assertEquals(1, verkoop.getVerkoopID());
        assertNotNull(verkoop.getDatum());
        assertEquals(1, verkoop.getKlantID());
        assertEquals(500.0f, verkoop.getTotaalBedrag());
        assertEquals(1, verkoop.getBestellingID());
        assertEquals(1, verkoop.getGrondstofID());
    }

    @Test
    public void testSettersAndGetters() {
        Verkoop verkoop = new Verkoop(2, LocalDateTime.now(), 2, 600.0f, 1, 2);

        verkoop.setTotaalBedrag(650.0f);
        verkoop.setBestellingID(2);

        assertEquals(650.0f, verkoop.getTotaalBedrag());
        assertEquals(2, verkoop.getBestellingID());
    }
}
