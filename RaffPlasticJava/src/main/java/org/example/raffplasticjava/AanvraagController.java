package org.example.raffplasticjava;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TableView;
import javafx.stage.Stage;

import java.io.IOException;

public class AanvraagController {

    // FXML-elementen
    public TableView<Aanvraag> aanvragenLijst;
    public TableView<Aanvraag> bestellingenLijst;

    // Dummy lijsten met gegevens
    private final ObservableList<Aanvraag> aanvragen = FXCollections.observableArrayList();
    private final ObservableList<Aanvraag> bestellingen = FXCollections.observableArrayList();

    // Initialiseer gegevens (wordt automatisch aangeroepen door JavaFX)
    public void initialize() {
        // Controleer of de tabel niet null is
        if (aanvragenLijst != null) {
            // Voeg kolomkoppelingen toe
            aanvragenLijst.getColumns().get(0).setCellValueFactory(new PropertyValueFactory<>("naam"));
            aanvragenLijst.getColumns().get(1).setCellValueFactory(new PropertyValueFactory<>("email"));
            aanvragenLijst.getColumns().get(2).setCellValueFactory(new PropertyValueFactory<>("prijs"));
            aanvragenLijst.getColumns().get(3).setCellValueFactory(new PropertyValueFactory<>("gewicht"));
            aanvragenLijst.getColumns().get(4).setCellValueFactory(new PropertyValueFactory<>("kwaliteit"));
            aanvragenLijst.getColumns().get(5).setCellValueFactory(new PropertyValueFactory<>("soortPlastic"));

            // Voeg dummygegevens toe
            aanvragen.add(new Aanvraag("Jan", "jan@example.com", 100.0, 10.0, "Hoog", "Plastic A"));
            aanvragen.add(new Aanvraag("Eva", "eva@example.com", 200.0, 20.0, "Middel", "Plastic B"));
            aanvragenLijst.setItems(aanvragen); // Koppel data aan de tabel
        }
    }


    // Navigatiemethoden
    public void openInhoudspagina(ActionEvent event) throws IOException {
        navigateTo(event, "inhoud-view.fxml");
    }

    public void openAanvragenPagina(ActionEvent event) throws IOException {
        navigateTo(event, "aanvragen-view.fxml");
    }

    public void openBestellingenPagina(ActionEvent event) throws IOException {
        navigateTo(event, "bestellingen-view.fxml");
    }

    public void sluitenApp(ActionEvent event) {
        System.exit(0);
    }

    // Functionaliteit
    public void sortAanvragen(ActionEvent event) {
        if (aanvragenLijst != null) {
            aanvragen.sort((a1, a2) -> a1.getNaam().compareToIgnoreCase(a2.getNaam()));
            aanvragenLijst.refresh(); // Update de tabelweergave
        }
    }

    public void annuleerBestelling(ActionEvent event) {
        if (bestellingenLijst != null && !bestellingen.isEmpty()) {
            bestellingen.remove(0); // Verwijder de eerste bestelling als voorbeeld
            bestellingenLijst.refresh();
        }
    }

    // Algemene methode voor navigatie
    private void navigateTo(ActionEvent event, String fxmlFile) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource(fxmlFile));
        Parent root = loader.load();
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(new Scene(root));
        stage.show();
    }
}
