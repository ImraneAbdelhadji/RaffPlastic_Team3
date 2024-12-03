module org.example.raffplasticjava {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.raffplasticjava to javafx.fxml;
    exports org.example.raffplasticjava;
}