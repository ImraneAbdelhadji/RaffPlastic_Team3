package org.example.raffplasticjava;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
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

    // Winkelmand als ObservableList
    private static ObservableList<WinkelmandItem> winkelmandItems = FXCollections.observableArrayList();

    @FXML
    public void toevoegenAanWinkelmand() {
        // Ophalen van invoervelden
        String grondstof = grondstofChoice.getValue();
        String kwaliteit = kwaliteitChoice.getValue();
        String hoeveelheidText = txtHoeveelheid.getText();

        // Validatie van invoer
        if (grondstof == null || kwaliteit == null || hoeveelheidText.isEmpty()) {
            System.out.println("Vul alle velden in.");
            return;
        }

        try {
            double hoeveelheid = Double.parseDouble(hoeveelheidText);

            // Prijsberekening met de nieuwe PrijsBerekening-klasse
            PrijsBerekening prijsBerekening = new PrijsBerekening();
            double prijs = prijsBerekening.berekenPrijs(kwaliteit, hoeveelheid);

            // Item toevoegen aan winkelmand
            WinkelmandItem item = new WinkelmandItem(grondstof, kwaliteit, hoeveelheid, prijs);
            winkelmandItems.add(item);

            // Velden resetten
            txtHoeveelheid.clear();
            grondstofChoice.setValue(null);
            kwaliteitChoice.setValue(null);

            System.out.println("Toegevoegd aan winkelmand: " + grondstof + ", " + kwaliteit + ", " + hoeveelheid + " ton, €" + prijs);

        } catch (NumberFormatException e) {
            System.out.println("Ongeldige invoer voor hoeveelheid.");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    @FXML
    public void winkelmandBekijken() {
        System.out.println("Winkelmand bekijken...");

        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("winkelmaand-view.fxml"));
            Parent root = loader.load();

            // WinkelmandView-controller ophalen en items doorgeven
            WinkelmandView controller = loader.getController();
            controller.setWinkelmandItems(winkelmandItems);

            // Scene instellen
            Scene scene = new Scene(root);
            Stage stage = (Stage) btnBekijken.getScene().getWindow();
            stage.setScene(scene);
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Kan WinkelmandView niet laden.");
        }
    }
}
