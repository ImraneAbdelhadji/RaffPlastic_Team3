package org.example.raffplasticjava;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class DataModel {
    private static final DataModel instance = new DataModel();

    private final ObservableList<Aanvraag> aanvragen = FXCollections.observableArrayList();
    private final ObservableList<Aanvraag> bestellingen = FXCollections.observableArrayList();

    private DataModel() {
        // Voeg dummygegevens toe aan de aanvragenlijst
        aanvragen.add(new Aanvraag("Jan", "jan@example.com", 100.0, 10.0, "Hoog", "Plastic A"));
        aanvragen.add(new Aanvraag("Eva", "eva@example.com", 200.0, 20.0, "Middel", "Plastic B"));
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
