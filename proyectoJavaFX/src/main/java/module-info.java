module com.example.proyectojavafx {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.bootstrapfx.core;
    requires com.google.gson;


    opens com.example.proyectojavafx to javafx.fxml, com.google.gson;
    exports com.example.proyectojavafx;
}