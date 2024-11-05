/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cl.duoc.models;

import java.util.Date;



/**
 *
 * @author Cetecom
 */
public class Task {
    private int idTask;
    private String nombre;
    private Date FechaLimite;
    private int prioridad;
    private boolean completada;

    public Task() {
    }

    public Task(int idTask, String nombre, Date FechaLimite, int prioridad, boolean completada) {
        this.idTask = idTask;
        this.nombre = nombre;
        this.FechaLimite = FechaLimite;
        this.prioridad = prioridad;
        this.completada = completada;
    }

    public int getIdTask() {
        return idTask;
    }

    public void setIdTask(int idTask) {
        this.idTask = idTask;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFechaLimite() {
        return FechaLimite;
    }

    public void setFechaLimite(Date FechaLimite) {
        this.FechaLimite = FechaLimite;
    }

    public int getPrioridad() {
        return prioridad;
    }

    public void setPrioridad(int prioridad) {
        this.prioridad = prioridad;
    }

    public boolean isCompletada() {
        return completada;
    }

    public void setCompletada(boolean completada) {
        this.completada = completada;
    }
    
    
    
    
    
    
    
}
