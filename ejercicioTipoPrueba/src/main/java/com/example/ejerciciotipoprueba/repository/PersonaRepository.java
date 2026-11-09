package com.example.ejerciciotipoprueba.repository;

import com.example.ejerciciotipoprueba.dao.JsonPersonaDao;
import com.example.ejerciciotipoprueba.dao.PersonaDao;
import com.example.ejerciciotipoprueba.dao.PersonaMysqlDao;
import com.example.ejerciciotipoprueba.model.Docente;
import com.example.ejerciciotipoprueba.model.Estudiante;
import com.example.ejerciciotipoprueba.model.Persona;

import java.util.ArrayList;
import java.util.List;

public class PersonaRepository {
    //private final PersonaDao dao = new JsonPersonaDao();
    private final PersonaMysqlDao personaMysqlDao = new PersonaMysqlDao();
    private final List<Persona> personas = new ArrayList<>();


    public void cargar(){
        personas.clear();
        personas.addAll(personaMysqlDao.listarPersonas());
    }

    public List<Persona> listar(){
        return new ArrayList<>(personas);
    }


    public void guardar(Persona persona){
        personaMysqlDao.insertar(persona);
        cargar();
    }


    public void eliminar(Persona persona){
        personaMysqlDao.eliminar(persona.getIdPersona());
        cargar();
    }


}
