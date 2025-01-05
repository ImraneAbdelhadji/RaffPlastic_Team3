package org.example.raffplasticjava;

import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;

public class WinkelmandView {

    @FXML
    private VBox itemList;

    @FXML
    private Label lblTotal;

    @FXML
    private Button btnCheckout;

    private ObservableList<WinkelmandItem> winkelmandItems;

    public void setWinkelmandItems(ObservableList<WinkelmandItem> winkelmandItems) {
        this.winkelmandItems = winkelmandItems;
        updateWinkelmand();
    }

    private void updateWinkelmand() {
        itemList.getChildren().clear();
        double totaalBedrag = 0.0;

        for (WinkelmandItem item : winkelmandItems) {
            Label itemLabel = new Label(String.format("%s (%s) - %.2f ton - €%.2f",
                    item.getGrondstof(), item.getKwaliteit(), item.getHoeveelheid(), item.getPrijs()));
            itemList.getChildren().add(itemLabel);
            totaalBedrag += item.getPrijs(); // Prijs van elk item toevoegen aan totaal
        }

        lblTotal.setText(String.format("Totaal: €%.2f", totaalBedrag));
    }

    @FXML
    public void afrekenen() {
        if (winkelmandItems.isEmpty()) {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Lege winkelmand");
            alert.setHeaderText(null);
            alert.setContentText("De winkelmand is leeg. Voeg eerst items toe.");
            alert.showAndWait();
            return;
        }

        // Logica voor afrekenen
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Afrekenen");
        alert.setHeaderText(null);
        alert.setContentText("Afrekenen succesvol!");
        alert.showAndWait();

        // Winkelmand leegmaken
        winkelmandItems.clear();
        updateWinkelmand();
    }

    public void clickUitloggen(ActionEvent event) throws IOException {
        navigateTo(event, "hello-view.fxml");
    }

    private void navigateTo(ActionEvent event, String fxmlFile) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource(fxmlFile));
        Parent root = loader.load();
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(new Scene(root));
        stage.show();
    }
}
