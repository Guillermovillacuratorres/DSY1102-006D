package com.example.ejerciciotipoprueba.controller;

import javafx.scene.control.Alert;

public class HelperController {

    public void mostrarError(String msg){
        Alert erorr = new Alert(Alert.AlertType.ERROR);
        erorr.setTitle("Error");
        erorr.setHeaderText(null);
        erorr.setContentText(msg);
        erorr.show();
    }


    public void mostrarInformacion(String msg){
        Alert erorr = new Alert(Alert.AlertType.INFORMATION);
        erorr.setTitle("Informacion");
        erorr.setHeaderText(null);
        erorr.setContentText(msg);
        erorr.show();
    }


}
