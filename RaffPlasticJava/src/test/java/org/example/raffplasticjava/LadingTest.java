package org.example.raffplasticjava;

import org.junit.jupiter.api.Test;
import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

public class LadingTest {

    @Test
    public void testLadingConstructor() {
        Lading lading = new Lading(1, 300, LocalDateTime.now(), 1, 1);

        assertEquals(1, lading.getLadingID());
        assertEquals(300, lading.getGewicht());
        assertNotNull(lading.getDatumOntvangst());
        assertEquals(1, lading.getLeverancierID());
        assertEquals(1, lading.getAfvalID());

        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            new Lading(0, 300, LocalDateTime.now(), 1, 1); // Ongeldige ladingID
        });
        assertEquals("LadingID moet een positief getal zijn.", exception.getMessage());

        exception = assertThrows(IllegalArgumentException.class, () -> {
            new Lading(1, 200, LocalDateTime.now(), 1, 1); // Ongeldig gewicht
        });
        assertEquals("Het gewicht moet minimaal 250 kg zijn.", exception.getMessage());
    }

    @Test
    public void testSettersAndGetters() {
        Lading lading = new Lading(1, 500.0, LocalDateTime.now(), 2, 3);

        lading.setGewicht(600.0);
        lading.setAfvalID(4);
        lading.setLadingID(2);

        assertEquals(600.0, lading.getGewicht());
        assertEquals(4, lading.getAfvalID());
        assertEquals(2, lading.getLadingID());

        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            lading.setGewicht(100); // Ongeldig gewicht
        });
        assertEquals("Het gewicht moet minimaal 250 kg zijn.", exception.getMessage());

        exception = assertThrows(IllegalArgumentException.class, () -> {
            lading.setLadingID(-5); // Ongeldige ladingID
        });
        assertEquals("LadingID moet een positief getal zijn.", exception.getMessage());
    }
}
