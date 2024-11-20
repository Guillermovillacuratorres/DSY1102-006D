/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package biblioteca;

import BD.Conexion;
import controller.LibroController;
import views.ListarLibros;

/**
 *
 * @author Cetecom
 */
public class Biblioteca {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Conexion cx = new Conexion();
        cx.conectar();
        
        ListarLibros l = new ListarLibros();
        l.setVisible(true);
        
        LibroController lc = new LibroController();
        
        //lc.agregarLibro("EL gato con botas", 3);
        
        //lc.editarLibro(1, "Harry", 2);
        lc.eliminarLibro(1);
        
        
    }
    
}
