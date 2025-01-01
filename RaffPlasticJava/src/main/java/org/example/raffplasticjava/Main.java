package org.example.raffplasticjava;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        // Laad het FXML-bestand
        Parent root = FXMLLoader.load(getClass().getResource("/org/example/raffplasticjava/hello-view.fxml")); // Vervang met de naam van je FXML-bestand

        // Stel de titel van de applicatie in
        primaryStage.setTitle("Login");

        // Maak een nieuwe Scene met de geladen root
        Scene scene = new Scene(root, 600, 400); // Pas de breedte en hoogte aan indien nodig

        // Stel de Scene in op de primaire Stage
        primaryStage.setScene(scene);

        // Toon de Stage
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args); // Start de applicatie
    }
}