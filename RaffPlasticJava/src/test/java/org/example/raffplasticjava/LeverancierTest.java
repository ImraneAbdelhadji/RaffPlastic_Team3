package org.example.raffplasticjava;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LeverancierTest {

    @Test
    public void testLeverancierConstructor() {
        Leverancier leverancier = new Leverancier(1, "Company A", "a@company.com");

        assertEquals(1, leverancier.getLeverancierID());
        assertEquals("Company A", leverancier.getNaam());
        assertEquals("a@company.com", leverancier.getEmail());

        // Testen van negatieve leverancierID
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            new Leverancier(0, "Company B", "b@company.com"); // Ongeldige leverancierID
        });
        assertEquals("LeverancierID moet een positief getal zijn.", exception.getMessage());
    }

    @Test
    public void testSettersAndGetters() {
        Leverancier leverancier = new Leverancier(2, "Company B", "b@company.com");

        leverancier.setNaam("Company C");
        leverancier.setEmail("c@company.com");

        assertEquals("Company C", leverancier.getNaam());
        assertEquals("c@company.com", leverancier.getEmail());

        // Testen van negatieve leverancierID via setter
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            leverancier.setLeverancierID(-5); // Ongeldige leverancierID
        });
        assertEquals("LeverancierID moet een positief getal zijn.", exception.getMessage());
    }
}
