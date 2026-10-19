package com.example.proyectojavafx;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.TextField;

import java.io.IOException;

public class VistaUnoController {

    @FXML
    private TextField txtId;

    @FXML
    private TextField txtNombre;

    @FXML
    private void guardar(){
        PersonasDAO pDao = new PersonasDAO();

        System.out.println("Guardando");
        System.out.println("ID: " + txtId.getText());
        System.out.println("Nombre: " + txtNombre.getText());
        Persona p1 =  new Persona(Integer.parseInt(txtId.getText()),txtNombre.getText());
        pDao.agregarPersona(p1);
        System.out.println("Persona agregada correctamente!!!");
    }

    @FXML
    private void navegarVistaDos() throws IOException {
        Parent root = FXMLLoader.load(HelloApplication.class.getResource("vistaDos.fxml"));
        txtNombre.getScene().setRoot(root);
    }
}
