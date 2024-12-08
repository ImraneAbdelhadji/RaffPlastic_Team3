package org.example.raffplasticjava;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class KlantTest {

    @Test
    public void testKlantConstructor() {
        Klant klant = new Klant(1, "John", "Doe", "john.doe@example.com");

        assertEquals(1, klant.getKlantID());
        assertEquals("John", klant.getVoornaam());
        assertEquals("Doe", klant.getAchternaam());
        assertEquals("john.doe@example.com", klant.getEmail());
    }

    @Test
    public void testSettersAndGetters() {
        Klant klant = new Klant(2, "Jane", "Smith", "jane.smith@example.com");

        klant.setVoornaam("Janet");
        klant.setAchternaam("Johnson");

        assertEquals("Janet", klant.getVoornaam());
        assertEquals("Johnson", klant.getAchternaam());
    }
}
