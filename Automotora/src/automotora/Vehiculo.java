/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package automotora;

import java.time.LocalDate;

/**
 *
 * @author Cetecom
 */
public class Vehiculo {
    private String modelo, patente, marca;
    private int precio;
    private LocalDate fecha_fabricacion;
    private boolean usado;

    public Vehiculo() {
    }

    public Vehiculo(String modelo, String patente, String marca, int precio, LocalDate fecha_fabricacion, boolean usado) {
        this.modelo = modelo;
        this.patente = patente;
        this.marca = marca;
        this.precio = precio;
        this.fecha_fabricacion = fecha_fabricacion;
        this.usado = usado;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }



    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public LocalDate getFecha_fabricacion() {
        return fecha_fabricacion;
    }

    public void setFecha_fabricacion(LocalDate fecha_fabricacion) {
        this.fecha_fabricacion = fecha_fabricacion;
    }

    public boolean isUsado() {
        return usado;
    }

    public void setUsado(boolean usado) {
        this.usado = usado;
    }
    
    @Override
    public String toString(){
        return "Marca " + marca + " Patente: " +
                patente + " Precio: " + precio;
    }
}
