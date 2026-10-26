package com.example.ejerciciotipoprueba.repository;

import com.example.ejerciciotipoprueba.dao.VideoJuegoJsonDao;
import com.example.ejerciciotipoprueba.model.VideoJuego;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class VideoJuegoRepository {
    private final VideoJuegoJsonDao videoJuegoJsonDao = new VideoJuegoJsonDao();
    private final ObservableList<VideoJuego> videoJuegos = FXCollections.observableArrayList();


    public ObservableList<VideoJuego> obtenerVideojuegos() {
        return videoJuegos;
    }

    public void cargarDesdeJson(){
        videoJuegos.setAll(videoJuegoJsonDao.cargar());
    }

    public void agregarVideoJuego(VideoJuego videoJuego){
        videoJuegos.add(videoJuego);
        videoJuegoJsonDao.guardar(videoJuegos);
    }

    public void eliminarVideoJuego(VideoJuego videoJuego){
        videoJuegos.remove(videoJuego);
        videoJuegoJsonDao.guardar(videoJuegos);
    }


}
