package org.example.raffplasticjava;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class AanvraagController {

    ObservableList<AanvraagController> aanvragen = FXCollections.observableArrayList();
    ObservableList<AanvraagController> bestellingen = FXCollections.observableArrayList();

    // Initialiseer de aanvragenlijst
    public void initialize() {
        aanvragen.add(new AanvraagController("Adam", "adam@example.com", 100.0, 10.0, "Hoog", "Plastic A"));
        // Hier kun je ook een ListView of TableView aan de aanvragen koppelen
    }

    // Methode om naar de inhoudspagina te navigeren
    public void openInhoudspagina(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("inhoud-view.fxml"));
        Parent root = loader.load();
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(new Scene(root));
        stage.show();
    }

    // Methode om een aanvraag te kiezen en naar bestellingen te verplaatsen
    public void kiesAanvraag(ActionEvent event) {
        // Logica om een aanvraag te selecteren en te verplaatsen
        AanvraagController gekozen = aanvragen.stream().findFirst().orElse(null); // Demo-selectie
        if (gekozen != null) {
            aanvragen.remove(gekozen);
            bestellingen.add(gekozen);
        }
    }
}
