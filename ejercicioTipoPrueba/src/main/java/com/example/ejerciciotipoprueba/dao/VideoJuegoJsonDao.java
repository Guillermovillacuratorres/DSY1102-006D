package com.example.ejerciciotipoprueba.dao;

import com.example.ejerciciotipoprueba.model.VideoJuego;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonIOException;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class
VideoJuegoJsonDao implements VideoJuegoDao{

    private final String RUTA = "videoJuegos.json";
    private final Gson gson = new GsonBuilder().setPrettyPrinting().create();

    @Override
    public List<VideoJuego> cargar() {
        if(!new File(RUTA).exists()){
            return new ArrayList<>();
        }
        try(FileReader reader = new FileReader(RUTA)){
            VideoJuego[] arreglo = gson.fromJson(reader,VideoJuego[].class);
            if(arreglo==null){
                return new ArrayList<>();
            }
            return new ArrayList<>(Arrays.asList(arreglo));
        }catch (IOException | JsonIOException e){
            System.out.println("Error al leer el archivo: " + e.getMessage());
            return new ArrayList<>();
        }
    }

    @Override
    public void guardar(List<VideoJuego> juegos) {
        try(FileWriter escribir = new FileWriter(RUTA)){
            gson.toJson(juegos,escribir);
        }catch (IOException e){
            System.out.println("Error al escribir el archivo: " + e.getMessage());
        }
    }
}
