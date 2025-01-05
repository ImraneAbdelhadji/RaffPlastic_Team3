package org.example.raffplasticjava;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class DataModel {
    private static final DataModel instance = new DataModel();

    private final ObservableList<Aanvraag> aanvragen = FXCollections.observableArrayList();
    private final ObservableList<Aanvraag> bestellingen = FXCollections.observableArrayList();

    private DataModel() {
        // Voeg dummygegevens toe aan de aanvragenlijst
        aanvragen.add(new Aanvraag("Imrane", "Imrane@gmail.com", 200.0, 30.0, "Hoog", "Plastic A"));
        aanvragen.add(new Aanvraag("Noa", "Noa@gmail.com", 300.0, 40.0, "Normaal", "Plastic B"));
        aanvragen.add(new Aanvraag("No", "No@gmail.com", 30.0, 60.0, "Normal", "Plastic "));
    }

    public static DataModel getInstance() {
        return instance;
    }

    public ObservableList<Aanvraag> getAanvragen() {
        return aanvragen;
    }

    public ObservableList<Aanvraag> getBestellingen() {
        return bestellingen;
    }
}
