/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package desarrollocrud;

import cl.duoc.models.PersonaCrud;

/**
 *
 * @author Cetecom
 */
public class DesarrolloCrud {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PersonaCrud crud = new PersonaCrud();
        
        crud.crearPersona("Mario");
        crud.crearPersona("Daniel");
        crud.crearPersona("Jorge");
        crud.crearPersona("David");
        crud.crearPersona("Fabian");
        crud.crearPersona("Crstopher");
        
        crud.eliminarPersona(4);
                
        crud.actualizarPersona("Carlos", 1);
        
        crud.listarPersonas();
        
        
    }
    
}
