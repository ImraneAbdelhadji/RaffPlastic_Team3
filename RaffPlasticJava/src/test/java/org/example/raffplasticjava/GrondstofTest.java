package org.example.raffplasticjava;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class GrondstofTest {

    @Test
    public void testGrondstofConstructor() {
        Grondstof grondstof = new Grondstof(1, "Plastic", 'A', 10.5f);

        assertEquals(1, grondstof.getGrondstofID());
        assertEquals("Plastic", grondstof.getType());
        assertEquals('A', grondstof.getKwaliteit());
        assertEquals(10.5f, grondstof.getPrijs());
    }

    @Test
    public void testSettersAndGetters() {
        Grondstof grondstof = new Grondstof(2, "Glas", 'B', 20.0f);

        grondstof.setKwaliteit('A');
        grondstof.setPrijs(25.0f);

        assertEquals('A', grondstof.getKwaliteit());
        assertEquals(25.0f, grondstof.getPrijs());
    }
}
