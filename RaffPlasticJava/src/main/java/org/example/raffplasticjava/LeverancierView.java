package org.example.raffplasticjava;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

/**
 * Controller voor LeverancierView. Hiermee kan een leverancier afvalspecificaties invoeren en biedingen bekijken.
 */
public class LeverancierView {

    @FXML
    private TextField txtAfvalType;

    @FXML
    private TextField txtHoeveelheid;

    @FXML
    private TextField txtPrijs;

    @FXML
    private Button btnBevestigen;

    @FXML
    private TableView<Bieding> tableBiedingen;

    private ObservableList<Bieding> biedingenLijst;

    // Constructor
    public LeverancierView() {
        // Initialiseer de biedingenlijst
        biedingenLijst = FXCollections.observableArrayList();
    }

    @FXML
    private void initialize() {
        // Bind the TableView to the ObservableList
        tableBiedingen.setItems(biedingenLijst);

        // Set up the columns to display the properties of Bieding
        TableColumn<Bieding, String> afvalTypeColumn = new TableColumn<>("Afval Type");
        afvalTypeColumn.setCellValueFactory(new PropertyValueFactory<>("afvalType"));

        TableColumn<Bieding, Double> hoeveelheidColumn = new TableColumn<>("Hoeveelheid (ton)");
        hoeveelheidColumn.setCellValueFactory(new PropertyValueFactory<>("hoeveelheid"));

        TableColumn<Bieding, Double> prijsColumn = new TableColumn<>("Prijs (€)");
        prijsColumn.setCellValueFactory(new PropertyValueFactory<>("prijs"));

        TableColumn<Bieding, String> statusColumn = new TableColumn<>("Status");
        statusColumn.setCellValueFactory(new PropertyValueFactory<>("status"));

        // Add columns to the TableView
        tableBiedingen.getColumns().addAll(afvalTypeColumn, hoeveelheidColumn, prijsColumn, statusColumn);
    }

    @FXML
    /**
     * Methode om een nieuwe bieding te bevestigen en toe te voegen aan de tabel.
     */
    public void handleBevestigen() {
        try {
            String afvalType = txtAfvalType.getText();
            if (afvalType.isEmpty()) {
                throw new IllegalArgumentException("Afvaltype mag niet leeg zijn.");
            }

            double hoeveelheid = Double.parseDouble(txtHoeveelheid.getText());
            if (hoeveelheid <= 0) {
                throw new IllegalArgumentException("Hoeveelheid moet een positief getal zijn.");
            }

            double prijs = Double.parseDouble(txtPrijs.getText());
            if (prijs <= 0) {
                throw new IllegalArgumentException("Prijs moet een positief getal zijn.");
            }

            // Voeg een nieuwe bieding toe aan de lijst met status "In afwachting"
            Bieding nieuweBieding = new Bieding(afvalType, hoeveelheid, prijs, "In afwachting");
            biedingenLijst.add(nieuweBieding);

            // Maak de invoervelden leeg
            clearInputFields();

            // Toon een bevestigingsmelding
            showAlert(Alert.AlertType.INFORMATION, "Bevestigd", "De bieding is succesvol toegevoegd!");

        } catch (NumberFormatException e) {
            showAlert(Alert.AlertType.ERROR, "Foutmelding", "Hoeveelheid en prijs moeten numerieke waarden zijn.");
        } catch (IllegalArgumentException e) {
            showAlert(Alert.AlertType.ERROR, "Foutmelding", e.getMessage());
        }
    }

    /**
     * Hulpmethode om invoervelden te resetten na bevestiging.
     */
    private void clearInputFields() {
        txtAfvalType.clear();
        txtHoeveelheid.clear();
        txtPrijs.clear();
    }

    /**
     * Hulpmethode om meldingen te tonen.
     */
    private void showAlert(Alert.AlertType alertType, String title, String message) {
        Alert alert = new Alert(alertType);
        alert.setTitle(title);
        alert.setContentText(message);
        alert.show();
    }
}