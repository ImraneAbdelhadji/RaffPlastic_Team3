package org.example.raffplasticjava;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GrondstofValidatorTest {

    private GrondstofValidator validator;

    @BeforeEach
    void setUp() {
        validator = new GrondstofValidator();
    }

    // Testen voor Type grondstof (geldige en ongeldige waarden)
    @Test
    void testValidType() {
        assertTrue(validator.isValidType("HDPE"), "HDPE moet geldig zijn.");
        assertTrue(validator.isValidType("PP"), "PP moet geldig zijn.");
        assertTrue(validator.isValidType("PS"), "PS moet geldig zijn.");
        assertTrue(validator.isValidType("PVC"), "PVC moet geldig zijn.");
    }

    @Test
    void testInvalidType() {
        assertFalse(validator.isValidType(null), "NULL moet ongeldig zijn.");
    }

    // Testen voor Kwaliteit grondstof (geldige en ongeldige waarden)
    @Test
    void testValidKwaliteit() {
        assertTrue(validator.isValidKwaliteit("A"), "'A' moet geldig zijn.");
        assertTrue(validator.isValidKwaliteit("B"), "'B' moet geldig zijn.");
        assertTrue(validator.isValidKwaliteit("C"), "'C' moet geldig zijn.");
    }

    @Test
    void testInvalidKwaliteit() {
        assertFalse(validator.isValidKwaliteit(null), "NULL moet ongeldig zijn.");
    }

    // Testen voor Prijs grondstof (geldige en ongeldige waarden)
    @Test
    void testValidPrijs() {
        assertTrue(validator.isValidPrijs(25.0), "25.0 moet geldig zijn.");
        assertTrue(validator.isValidPrijs(30.0), "30.0 moet geldig zijn.");
        assertTrue(validator.isValidPrijs(100.0), "100.0 moet geldig zijn.");
    }

    @Test
    void testInvalidPrijs() {
        assertFalse(validator.isValidPrijs(null), "NULL moet ongeldig zijn.");
        assertFalse(validator.isValidPrijs(20.0), "20.0 moet ongeldig zijn.");
        assertFalse(validator.isValidPrijs(-25.0), "-25.0 moet ongeldig zijn.");
        assertFalse(validator.isValidPrijs(24.9), "24.9 moet ongeldig zijn.");
    }

    // Testen voor Gewicht grondstof (geldige en ongeldige waarden)
    @Test
    void testValidGewicht() {
        assertTrue(validator.isValidGewicht(250.0), "250.0 moet geldig zijn.");
        assertTrue(validator.isValidGewicht(350.0), "350.0 moet geldig zijn.");
        assertTrue(validator.isValidGewicht(1000.0), "1000.0 moet geldig zijn.");
    }

    @Test
    void testInvalidGewicht() {
        assertFalse(validator.isValidGewicht(null), "NULL moet ongeldig zijn.");
        assertFalse(validator.isValidGewicht(200.0), "200.0 moet ongeldig zijn.");
        assertFalse(validator.isValidGewicht(0.0), "0.0 moet ongeldig zijn.");
        assertFalse(validator.isValidGewicht(249.9), "249.9 moet ongeldig zijn.");
    }
}
