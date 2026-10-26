package com.example.ejerciciotipoprueba.controller;

import com.example.ejerciciotipoprueba.model.VideoJuego;
import com.example.ejerciciotipoprueba.repository.VideoJuegoRepository;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;

public class VideoJuegoController {
    private final VideoJuegoRepository videoJuegoRepository = new VideoJuegoRepository();


    @FXML
    private TextField txtTitulo;

    @FXML
    private TextField txtStock;

    @FXML
    private ComboBox<String> cmbCategoria;

    @FXML
    public void initialize(){
        cmbCategoria.getItems().addAll("Deportes", "Carreras", "Accion");
    }





    @FXML
    private void agregarJuego(){
        //System.out.println("Categoria: " + cmbCategoria.getValue());
        videoJuegoRepository.cargarDesdeJson();
        int idVideoJuego = videoJuegoRepository.obtenerVideojuegos().size() + 1;

        String titulo = txtTitulo.getText();
        int  stock = Integer.valueOf(txtStock.getText());
        String categoria = cmbCategoria.getValue();
        videoJuegoRepository.agregarVideoJuego(new VideoJuego(1,1,"asd","asd"));
        System.out.println("VideoJuego agregado");
    }

    @FXML
    private void eliminarJuego(){

    }
}
