/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cl.duoc.models;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Cetecom
 */
public class PersonaCrud {
    private List<Persona> personas = new ArrayList<>();
    private int idPersonaCrud = 1;
    
    
    //Create 
    public void crearPersona(String parNombre){
        Persona nuevaPersona = new Persona(idPersonaCrud++,parNombre);
        personas.add(nuevaPersona);
        System.out.println("Persona agregada correctamente.");
    }
    
    //Read
    public void listarPersonas(){
        System.out.println("LISTANDO PERSONAS: ");
        for(Persona i : personas){
            System.out.println("ID: " + i.getIdPersona() + 
                                " NOMBRE: " + i.getNombre());
        }
    }
    
    //Update
    public void actualizarPersona(String parNuevoNombre, int parId){
        for(Persona i : personas){
            if(i.getIdPersona() == parId){
                i.setNombre(parNuevoNombre);
                System.out.println("Persona actualizada!!!!");
                return;
            }
        }
        System.out.println("EL id no se encontro en la lista de personas.");
    }
    
    //Delete 
    public void eliminarPersona(int parId){
        for(Persona i : personas){
            if(i.getIdPersona() == parId){
                personas.remove(i);
                System.out.println("Persona eliminada correctamente.");
                return;
            }
        }
        System.out.println("El id no corresponde al listado de personas.");
    }
}

