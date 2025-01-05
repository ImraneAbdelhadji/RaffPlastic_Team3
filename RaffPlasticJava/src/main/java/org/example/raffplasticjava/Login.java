package org.example.raffplasticjava;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;

import java.io.IOException;

public class Login {

    @FXML
    private TextField txtUsername;

    @FXML
    private PasswordField txtWachtwoord;

    @FXML
    private ChoiceBox<String> cbAccount;

    @FXML
    private void handleLogin() {
        String username = txtUsername.getText();
        String password = txtWachtwoord.getText();
        String userType = cbAccount.getValue();

        // Controleer of alle velden zijn ingevuld
        if (username.isEmpty() || password.isEmpty() || userType == null) {
            showAlert(Alert.AlertType.ERROR, "Foutmelding", "Vul alle velden in!");
            return;
        }

        // Simuleer authenticatie met testgegevens
        if (authenticateUser(username, password, userType)) {
            // Laad de juiste view op basis van het type gebruiker
            String fxmlFile;
            switch (userType) {
                case "Klant":
                    fxmlFile = "klant-view.fxml";
                    break;
                case "Leverancier":
                    fxmlFile = "leverancier-view.fxml";
                    break;
                case "Admin":
                    fxmlFile = "inhoud-view.fxml";
                    break;
                default:
                    showAlert(Alert.AlertType.ERROR, "Foutmelding", "Onbekend gebruikerstype!");
                    return;
            }
            switchToView(fxmlFile);
        } else {
            showAlert(Alert.AlertType.ERROR, "Foutmelding", "Ongeldige inloggegevens!");
        }
    }

    private boolean authenticateUser(String username, String password, String userType) {
        // Voeg hier echte authenticatie toe. Gebruik voorlopig testgegevens:
        if (userType.equals("Klant")) {
            return username.equals("testklant") && password.equals("1234");
        } else if (userType.equals("Leverancier")) {
            return username.equals("testleverancier") && password.equals("abcd");
        } else if (userType.equals("Admin")) {
            return username.equals("admin") && password.equals("admin");
        }
        return false;
    }

    private void switchToView(String fxmlFile) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource(fxmlFile));
            Parent root = loader.load();
            Stage stage = (Stage) txtUsername.getScene().getWindow();
            stage.setScene(new Scene(root));
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
            showAlert(Alert.AlertType.ERROR, "Foutmelding", "Kon het FXML-bestand niet laden: " + fxmlFile);
        }
    }

    private void showAlert(Alert.AlertType alertType, String title, String message) {
        Alert alert = new Alert(alertType);
        alert.setTitle(title);
        alert.setContentText(message);
        alert.show();
    }
}
