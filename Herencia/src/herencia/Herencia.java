/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package herencia;

import cl.duoc.mdoels.Gato;
import cl.duoc.mdoels.Perro;

/**
 *
 * @author Cetecom
 */
public class Herencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Perro firulais = new Perro("Firulais");
        Gato michi = new Gato("mushkin ","Michi");
        
        
        firulais.hacerSonido();
        michi.hacerSonido();
        
    }
    
}
