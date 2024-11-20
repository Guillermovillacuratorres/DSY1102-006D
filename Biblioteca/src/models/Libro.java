/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

/**
 *
 * @author Cetecom
 */
public class Libro {
    private int idLibro;
    private String titulo;
    private int idCategoria;

    public Libro() {
    }

    public Libro(int idLibro, String titulo, int idCategoria) {
        this.idLibro = idLibro;
        this.titulo = titulo;
        this.idCategoria = idCategoria;
    }

    public int getIdLibro() {
        return idLibro;
    }

    public void setIdLibro(int idLibro) {
        this.idLibro = idLibro;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(int idCategoria) {
        this.idCategoria = idCategoria;
    }

    @Override
    public String toString() {
        return "Libro{" + "idLibro=" + idLibro + ", titulo=" + titulo + ", idCategoria=" + idCategoria + '}';
    }
    
    
    
}
