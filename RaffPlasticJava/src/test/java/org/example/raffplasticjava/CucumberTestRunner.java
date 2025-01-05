package org.example.raffplasticjava;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

/**
 * CucumberTestRunner voert Cucumber-feature-bestanden uit met Serenity voor rapportage.
 * @CucumberOptions specificeert de locaties van de feature-bestanden en step definitions.
 */
@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/", // Pad naar de feature-bestanden
        glue = "org.121example.raffplasticjava",      // Package met de step definitions
        plugin = {"pretty"}                        // Zorgt voor een leesbare uitvoer
)
public class CucumberTestRunner {
}
