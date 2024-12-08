package org.example.raffplasticjava;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AfvalTest {

    @Test
    public void testAfvalConstructor() {
        Afval afval = new Afval(1, "Plastic");

        assertEquals(1, afval.getAfvalID());
        assertEquals("Plastic", afval.getType());
    }

    @Test
    public void testSettersAndGetters() {
        Afval afval = new Afval(2, "Metalen");

        afval.setType("Glas");

        assertEquals("Glas", afval.getType());
    }
}
