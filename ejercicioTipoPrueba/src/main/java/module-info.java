module com.example.ejerciciotipoprueba {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.bootstrapfx.core;
    requires com.google.gson;

    opens com.example.ejerciciotipoprueba to javafx.fxml,com.google.gson;
    exports com.example.ejerciciotipoprueba;
    exports com.example.ejerciciotipoprueba.app;
    opens com.example.ejerciciotipoprueba.app to javafx.fxml;
    exports com.example.ejerciciotipoprueba.controller;
    opens com.example.ejerciciotipoprueba.controller to javafx.fxml;
    opens com.example.ejerciciotipoprueba.model to com.google.gson;
}