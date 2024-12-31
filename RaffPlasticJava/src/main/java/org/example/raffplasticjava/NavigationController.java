package org.example.raffplasticjava;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class NavigationController {

    private Stage stage;

    // Constructor voor initialisatie van het stage-object
    public NavigationController(Stage stage) {
        this.stage = stage;
    }

    // Methode om naar de inhoudspagina te navigeren
    public void goToInhoudPagina(ActionEvent event) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("inhoud-view.fxml"));
            Scene scene = new Scene(root);
            stage.setScene(scene);
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Kan de inhoudspagina niet laden!");
        }
    }

    // Methode om de applicatie te sluiten
    public void sluitApplicatie(ActionEvent event) {
        stage.close();
    }
}
