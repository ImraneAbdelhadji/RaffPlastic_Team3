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

        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            new Klant(0, "Jane", "Doe", "jane.doe@example.com"); // Ongeldig klantID
        });
        assertEquals("KlantID moet een positief getal zijn.", exception.getMessage());

        exception = assertThrows(IllegalArgumentException.class, () -> {
            new Klant(2, "Jane", "Doe", "janedoe.com"); // Ongeldig e-mailadres
        });
        assertEquals("Ongeldig e-mailadres.", exception.getMessage());
    }

    @Test
    public void testSettersAndValidation() {
        Klant klant = new Klant(1, "John", "Doe", "john.doe@example.com");

        klant.setVoornaam("Johnny");
        klant.setAchternaam("Dover");
        klant.setEmail("john.dover@example.com");

        assertEquals("Johnny", klant.getVoornaam());
        assertEquals("Dover", klant.getAchternaam());
        assertEquals("john.dover@example.com", klant.getEmail());

        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            klant.setKlantID(-1);
        });
        assertEquals("KlantID moet een positief getal zijn.", exception.getMessage());

        exception = assertThrows(IllegalArgumentException.class, () -> {
            klant.setEmail("johndover.com");
        });
        assertEquals("Ongeldig e-mailadres.", exception.getMessage());
    }
}
