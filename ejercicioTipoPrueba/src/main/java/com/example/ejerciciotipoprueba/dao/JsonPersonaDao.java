package com.example.ejerciciotipoprueba.dao;

import com.example.ejerciciotipoprueba.model.Docente;
import com.example.ejerciciotipoprueba.model.Estudiante;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class JsonPersonaDao {


    private final String RUTA_DOCENTES = "docentes.json";
    private final String RUTA_ESTUDIANTES = "estudiantes.json";
    private final Gson gson = new GsonBuilder().setPrettyPrinting().create();

    //@Override
    public List<Docente> cargarDocentes() {
        if(!new File(RUTA_DOCENTES).exists()){
            return new ArrayList<>();
        }
        try(FileReader reader = new FileReader(RUTA_DOCENTES)){
            Docente[] arreglo = gson.fromJson(reader, Docente[].class);
            if (arreglo == null){
                return new ArrayList<>();
            }
            return new ArrayList<>(Arrays.asList(arreglo));
        }catch (Exception e){
            System.out.println(e.getMessage());
            return new ArrayList<>();
        }
    }

    //@Override
    public List<Estudiante> cargarEstudiantes() {
        if(!new File(RUTA_ESTUDIANTES).exists()){
            return new ArrayList<>();
        }
        try(FileReader reader = new FileReader(RUTA_ESTUDIANTES)){
            Estudiante[] arreglo = gson.fromJson(reader, Estudiante[].class);
            if (arreglo == null){
                return new ArrayList<>();
            }
            return new ArrayList<>(Arrays.asList(arreglo));
        }catch (Exception e){
            System.out.println(e.getMessage());
            return new ArrayList<>();
        }
    }

    //@Override
    public void guardarDocente(List<Docente> docentes) {
        try(FileWriter writer = new FileWriter(RUTA_DOCENTES)){
            gson.toJson(docentes, writer);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

   // @Override
    public void guardarEstudiante(List<Estudiante> estudiantes) {
        try(FileWriter writer = new FileWriter(RUTA_ESTUDIANTES)){
            gson.toJson(estudiantes, writer);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
