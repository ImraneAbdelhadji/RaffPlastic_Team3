package org.example.raffplasticjava;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class Login {

    @FXML
    private TextField txtUsername;

    @FXML
    private PasswordField txtWachtwoord;

    @FXML
    private Button btnLogIn;

    @FXML
    private void handleLogin(ActionEvent event) {
        String username = txtUsername.getText();
        String password = txtWachtwoord.getText();

        // Voorbeeld van eenvoudige validatie
        if (username.isEmpty() || password.isEmpty()) {
            showAlert("Error", "Vul alle velden in!");
            return;
        }

        // Voeg hier de logica toe om te controleren of de inloggegevens correct zijn
        if (username.equals("admin") && password.equals("admin")) {
            showAlert("Succes", "Welkom " + username + "!");
        } else {
            showAlert("Fout", "Ongeldige inloggegevens!");
        }
    }

    private void showAlert(String title, String message) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }
}
