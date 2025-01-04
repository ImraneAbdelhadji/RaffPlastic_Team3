package org.example.raffplasticjava;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class KlantView {

    @FXML
    private ChoiceBox<String> grondstofChoice;

    @FXML
    private ChoiceBox<String> kwaliteitChoice;

    @FXML
    private TextField txtHoeveelheid;

    @FXML
    private Button btnBekijken;

    @FXML
    public void toevoegenAanWinkelmand() {
        // Functionaliteit om item aan de winkelmand toe te voegen
        String grondstof = grondstofChoice.getValue();
        String kwaliteit = kwaliteitChoice.getValue();
        String hoeveelheid = txtHoeveelheid.getText();

        // Validatie van invoer
        if (grondstof == null || kwaliteit == null || hoeveelheid.isEmpty()) {
            System.out.println("Vul alle velden in.");
            return;
        }

        System.out.println("Toegevoegd aan winkelmand: " + grondstof + ", " + kwaliteit + ", " + hoeveelheid + " ton");
        // Hier kun je code toevoegen om het item op te slaan in een winkelmand-lijst of database
    }

    @FXML
    public void winkelmandBekijken() {
        System.out.println("Winkelmand bekijken...");

        try {
            // Laad de WinkelmandView
            Parent root = FXMLLoader.load(getClass().getResource("winkelmaand-view.fxml"));
            Scene scene = new Scene(root);
            Stage stage = (Stage) btnBekijken.getScene().getWindow(); // Huidige stage ophalen
            stage.setScene(scene);
        } catch (IOException e) {
            e.printStackTrace(); // Print de stacktrace voor debugging
            System.out.println("Kan WinkelmandView niet laden.");
        }
    }

}
