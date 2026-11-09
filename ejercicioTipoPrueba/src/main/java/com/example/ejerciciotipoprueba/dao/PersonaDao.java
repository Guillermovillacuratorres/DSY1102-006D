package com.example.ejerciciotipoprueba.dao;

import com.example.ejerciciotipoprueba.model.Docente;
import com.example.ejerciciotipoprueba.model.Estudiante;
import com.example.ejerciciotipoprueba.model.Persona;

import java.util.List;

public interface PersonaDao {
//    List<Docente> cargarDocentes();
//    List<Estudiante>  cargarEstudiantes();

//    void guardarDocente(List<Docente> docentes);
//    void guardarEstudiante(List<Estudiante> estudiantes);

    List<Persona> listarPersonas();
    void insertar(Persona persona);
    void actualizar(Persona persona);
    void eliminar(int id);

}
