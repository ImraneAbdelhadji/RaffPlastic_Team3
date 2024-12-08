package org.example.raffplasticjava;

import org.junit.jupiter.api.Test;
import java.time.LocalDateTime;
import static org.junit.jupiter.api.Assertions.*;

public class LadingTest {

    @Test
    public void testLadingConstructor() {
        Lading lading = new Lading(1, 1000.0, LocalDateTime.now(), 1, 1);

        assertEquals(1, lading.getLadingID());
        assertEquals(1000.0, lading.getGewicht());
        assertNotNull(lading.getDatumOntvangst());
        assertEquals(1, lading.getLeverancierID());
        assertEquals(1, lading.getAfvalID());
    }

    @Test
    public void testSettersAndGetters() {
        Lading lading = new Lading(2, 1500.0, LocalDateTime.now(), 1, 2);

        lading.setGewicht(2000.0);
        lading.setAfvalID(3);

        assertEquals(2000.0, lading.getGewicht());
        assertEquals(3, lading.getAfvalID());
    }
}
