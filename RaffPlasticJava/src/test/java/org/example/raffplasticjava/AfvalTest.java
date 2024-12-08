package org.example.raffplasticjava;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AfvalTest {

    @Test
    public void testAfvalConstructor() {
        Afval afval = new Afval(-1, "PP");

        assertEquals(1, afval.getAfvalID());
        assertEquals("PP", afval.getType());

        afval = new Afval(2, "HDPE");
        assertEquals(2, afval.getAfvalID());
        assertEquals("HDPE", afval.getType());

        afval = new Afval(3, "PS");
        assertEquals(3, afval.getAfvalID());
        assertEquals("PS", afval.getType());

        afval = new Afval(4, "PVC");
        assertEquals(4, afval.getAfvalID());
        assertEquals("PVC", afval.getType());
    }

    @Test
    public void testSettersAndValidation() {
        Afval afval = new Afval(1, "PP");

        afval.setType("Glas");
        assertEquals("Glas", afval.getType());

        afval.setAfvalID(5);
        assertEquals(5, afval.getAfvalID());

        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            afval.setAfvalID(-1); // Negatief of nul afvalID moet een fout genereren
        });
        assertEquals("AfvalID moet een positief getal zijn.", exception.getMessage());
    }
}
