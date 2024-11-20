/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import BD.Conexion;

import java.util.ArrayList;
import models.Libro;

import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.List;


/**
 *
 * @author Cetecom
 */
public class LibroController {
    Conexion cx;
    
    public LibroController() {
        cx = new Conexion();
        cx.conectar();
    }
    
    public List<Libro> obtenerLibros(){
        List<Libro> libros = new ArrayList<>();
        try {
            ResultSet rs = cx.EjecutarQuery("SELECT * FROM libro");
            while(rs.next()){
                libros.add(new Libro(
                        rs.getInt("idLibro"),
                        rs.getString("titulo"),
                        rs.getInt("idCategoria")
                ));
            }
        } catch (Exception e) {
            System.out.println("Error: " +  e.getMessage());
        }
        return libros;
    }
    
        public List<Libro> obtenerLibrosCondicion(int id){
        List<Libro> libros = new ArrayList<>();
        try {
            ResultSet rs = cx.EjecutarQuery("SELECT * FROM libro WHERE idCategoria=" + id);
            while(rs.next()){
                libros.add(new Libro(
                        rs.getInt("idLibro"),
                        rs.getString("titulo"),
                        rs.getInt("idCategoria")
                ));
            }
        } catch (Exception e) {
            System.out.println("Error: " +  e.getMessage());
        }
        return libros;
    }
    
    
        public void agregarLibro(String nombre, int IdCategoria){
            String query = "INSERT INTO `libro` (titulo, idcategoria) VALUES (?,?)";
            try {
                PreparedStatement st = cx.getConnection().prepareStatement(query);
                st.setString(1,nombre);
                st.setInt(2,IdCategoria);
                st.executeUpdate();
                System.out.println("Libro agregado.");
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
            
        
        public Libro buscarLibroPorId(int id){
            Libro libro = null;
            String query = "SELECT * FROM libro WHERE idLibro = " + id;
            try {
                ResultSet rs = cx.EjecutarQuery(query);
                if(rs.next()){
                    libro = new Libro();
                    libro.setIdLibro(rs.getInt("idLibro"));
                    libro.setTitulo(rs.getString("titulo"));
                    libro.setIdCategoria(rs.getInt("idCategoria"));
                }
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
            return libro;
        }
        
        
        public boolean editarLibro(int idLibro, String titulo, int idcategoria){
            String query = "UPDATE libro SET titulo = '" + titulo +
                    "', idCategoria =" + idcategoria + 
                    " WHERE idLibro = "+ idLibro;
            System.out.println(query);
                        
            try {
                Libro libroEncontrado = buscarLibroPorId(idLibro);
                if(libroEncontrado != null){
                    Statement st = cx.getConnection().createStatement();
                    int filasAfectadas = st.executeUpdate(query);
                    System.out.println("Libro actualizado");
                    return filasAfectadas > 0;
                }else{
                    return false;
                }
            } catch (Exception e) {
                System.out.println("Error:  " + e.getMessage());
                return false;
            }
        }
        
        
        public boolean eliminarLibro(int id){
            String query = "DELETE FROM libro WHERE idLibro = " + id;
            try {
                Libro libroEncontrado = buscarLibroPorId(id);
                if(libroEncontrado != null){
                    Statement st = cx.getConnection().createStatement();
                    int filasAfectadas = st.executeUpdate(query);
                    System.out.println("libro eliminado.");
                    return filasAfectadas > 0;
                }else{
                    return false;
                }
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
                return false;
            }
        }
        
        
        
}
