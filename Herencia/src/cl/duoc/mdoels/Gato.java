/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cl.duoc.mdoels;

/**
 *
 * @author Cetecom
 */
public class Gato extends Animal{
    
    private String raza;

    public Gato(String raza) {
        this.raza = raza;
    }

    public Gato(String raza, String nombre) {
        super(nombre);
        this.raza = raza;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    @Override
    public String toString() {
        return "Gato{" + "raza=" + raza + '}';
    }
    
    
    public void hacerSonido(){
        System.out.println("miiiauuuu...");
    }
    
}
