package com.example.ejerciciotipoprueba.dao;

import com.example.ejerciciotipoprueba.model.VideoJuego;

import java.util.List;

public interface VideoJuegoDao {
    List<VideoJuego> cargar();
    void guardar(List<VideoJuego> juegos);
}
