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
public class Proyecto {
    private int idProyecto;
    private String nombreProyecto;
    private List<Task> tareas = new ArrayList<>();

    public Proyecto() {
    }

    public Proyecto(int idProyecto, String nombreProyecto) {
        this.idProyecto = idProyecto;
        this.nombreProyecto = nombreProyecto;
    }

    public int getIdProyecto() {
        return idProyecto;
    }

    public void setIdProyecto(int idProyecto) {
        this.idProyecto = idProyecto;
    }

    public String getNombreProyecto() {
        return nombreProyecto;
    }

    public void setNombreProyecto(String nombreProyecto) {
        this.nombreProyecto = nombreProyecto;
    }

    public List<Task> getTareas() {
        return tareas;
    }

    public void setTareas(List<Task> tareas) {
        this.tareas = tareas;
    }
    
    
    public void agregarTarea(Task parNuevaTarea){
        tareas.add(parNuevaTarea);
        System.out.println("Tarea agregada correctamente!");
    }
    
    
    public List<Task> obtenerTareas(){
        return new ArrayList<>(tareas);
    }
    
    
}
