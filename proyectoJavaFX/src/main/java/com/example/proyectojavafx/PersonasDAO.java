package com.example.proyectojavafx;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PersonasDAO {
    private final String RUTA = "Personas.json";
    private final Gson gson = new GsonBuilder().setPrettyPrinting().create();


    private List<Persona> leerJson(){
        try (FileReader reader = new FileReader(RUTA)){
            Persona[] lista = gson.fromJson(reader, Persona[].class);
            if (lista == null){
                return new ArrayList<>();
            }
            return new ArrayList<>(Arrays.asList(lista));
        }catch (IOException e){
            System.out.println("ERROR: " + e.getMessage());
            return new ArrayList<>();
        }
    }



    private void escribirJson(List<Persona> personas)  {
        try (FileWriter writer = new FileWriter(RUTA)){
            gson.toJson(personas, writer);
        }catch (Exception e){
            System.out.println("Error" + e.getMessage());
        }
    }


    public void agregarPersona(Persona persona){
        List<Persona> personas = leerJson();
        personas.add(persona);
        escribirJson(personas);
    }





}
