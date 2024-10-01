/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arraylistas;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Cetecom
 */
public class ArrayListas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        List<String> listaMascotas = new ArrayList<>();
        
        listaMascotas.add("Perro");
        listaMascotas.add("Gato");
        listaMascotas.add("Leon");
        listaMascotas.add("Tortuga");
        listaMascotas.add("Conejo");
        listaMascotas.add("Gallina");
        
        
        
        
        listaMascotas.remove("Gallina");
        System.out.println(listaMascotas);
        System.out.println(listaMascotas.size());
        System.out.println(listaMascotas.get(3));
        System.out.println(listaMascotas.indexOf("Conejo"));
        System.out.println(listaMascotas.contains("Gallina"));
        
        
        //listaMascotas.clear();
        //System.out.println(listaMascotas);
        
        int contador = 0;
        for(String i : listaMascotas){
            contador++;
            System.out.println("Mascota "+ contador  + " " +i);
        }
        
        
        
    }
    
}
