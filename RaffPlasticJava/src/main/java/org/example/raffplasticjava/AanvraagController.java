package org.example.raffplasticjava;

import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;
import javafx.util.Callback;

import java.io.IOException;

public class AanvraagController {

    // FXML-elementen
    public TableView<Aanvraag> aanvragenLijst;
    public TableView<Aanvraag> bestellingenLijst;

    // Gegevensmodel
    private final ObservableList<Aanvraag> aanvragen = DataModel.getInstance().getAanvragen();
    private final ObservableList<Aanvraag> bestellingen = DataModel.getInstance().getBestellingen();

    // Initialiseer gegevens (wordt automatisch aangeroepen door JavaFX)
    public void initialize() {
        configureTable(aanvragenLijst, aanvragen, true);
        configureTable(bestellingenLijst, bestellingen, false);
    }

    // Methode om een tabel te configureren
    private void configureTable(TableView<Aanvraag> tableView, ObservableList<Aanvraag> data, boolean isAanvragen) {
        if (tableView != null) {
            tableView.getColumns().get(0).setCellValueFactory(new PropertyValueFactory<>("naam"));
            tableView.getColumns().get(1).setCellValueFactory(new PropertyValueFactory<>("email"));
            tableView.getColumns().get(2).setCellValueFactory(new PropertyValueFactory<>("prijs"));
            tableView.getColumns().get(3).setCellValueFactory(new PropertyValueFactory<>("gewicht"));
            tableView.getColumns().get(4).setCellValueFactory(new PropertyValueFactory<>("kwaliteit"));
            tableView.getColumns().get(5).setCellValueFactory(new PropertyValueFactory<>("soortPlastic"));

            tableView.setItems(data);

            if (isAanvragen) {
                TableColumn<Aanvraag, Void> actiesKolom = new TableColumn<>("Acties");
                actiesKolom.setCellFactory(createKiezenKnopFactory());
                tableView.getColumns().add(actiesKolom);
            }
        }
    }

    // Methode om de "Kiezen"-knoppen te genereren
    private Callback<TableColumn<Aanvraag, Void>, TableCell<Aanvraag, Void>> createKiezenKnopFactory() {
        return param -> new TableCell<>() {
            private final Button kiezenKnop = new Button("Kiezen");

            {
                kiezenKnop.setOnAction(event -> {
                    Aanvraag geselecteerdeAanvraag = getTableView().getItems().get(getIndex());
                    aanvragen.remove(geselecteerdeAanvraag); // Verwijder uit aanvragenlijst
                    bestellingen.add(geselecteerdeAanvraag); // Voeg toe aan bestellingenlijst
                });
            }

            @Override
            protected void updateItem(Void item, boolean empty) {
                super.updateItem(item, empty);
                setGraphic(empty ? null : kiezenKnop);
            }
        };
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

    public void sortAanvragen(ActionEvent event) {
        if (aanvragenLijst != null) {
            aanvragen.sort((a1, a2) -> a1.getNaam().compareToIgnoreCase(a2.getNaam()));
            aanvragenLijst.refresh(); // Update de tabelweergave
        }
    }

    // Functionaliteit
    public void annuleerBestelling(ActionEvent event) {
        if (bestellingenLijst != null) {
            Aanvraag geselecteerdeBestelling = bestellingenLijst.getSelectionModel().getSelectedItem();
            if (geselecteerdeBestelling != null) {
                bestellingen.remove(geselecteerdeBestelling); // Verwijder uit bestellingenlijst
                aanvragen.add(geselecteerdeBestelling); // Voeg terug toe aan aanvragenlijst
            }
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
