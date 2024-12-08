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
    public void testSettersAndGetters() {
        Aankoop aankoop = new Aankoop(1, LocalDateTime.now(), 2, 500.0f, 1);

        aankoop.setTotaalBedrag(600.0f);
        aankoop.setBestellingID(2);

        assertEquals(600.0f, aankoop.getTotaalBedrag());
        assertEquals(2, aankoop.getBestellingID());
    }
}
