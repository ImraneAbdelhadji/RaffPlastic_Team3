package org.example.raffplasticjava;

import io.cucumber.java.en.*;
import static org.junit.jupiter.api.Assertions.*;

public class PrijsBerekeningSteps {

    private String kwaliteit;
    private double gewicht;
    private double resultaat;
    private Exception exception;

    @Given("de kwaliteit is {string}")
    public void de_kwaliteit_is(String kwaliteit) {
        this.kwaliteit = kwaliteit;
    }

    @Given("het gewicht is {double}")
    public void het_gewicht_is(double gewicht) {
        try {
            if (gewicht < 25 || gewicht > 50) {
                throw new IllegalArgumentException("Gewicht moet tussen 25t en 50t liggen.");
            }
            this.gewicht = gewicht;
        } catch (IllegalArgumentException e) {
            exception = e;
            // Stop hier door de exception te gooien zodat het scenario direct faalt
            throw e;
        }
    }

    @When("de prijs wordt berekend")
    public void de_prijs_wordt_berekend() {
        if (exception != null) {
            // Als er eerder een exception was, geen verdere berekening uitvoeren
            return;
        }
        try {
            PrijsBerekening prijsBerekening = new PrijsBerekening();
            resultaat = prijsBerekening.berekenPrijs(kwaliteit, gewicht);
        } catch (Exception e) {
            exception = e;
        }
    }

    @Then("de totale prijs moet {double} zijn")
    public void de_totale_prijs_moet_zijn(double verwachtePrijs) {
        assertEquals(verwachtePrijs, resultaat, 0.01);
    }

    @Then("moet een foutmelding worden gegenereerd met {string}")
    public void moet_een_foutmelding_worden_gegenereerd_met(String foutmelding) {
        assertNotNull(exception);
        assertEquals(foutmelding, exception.getMessage());
    }
}
