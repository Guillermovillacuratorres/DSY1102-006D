/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package automotora;

/**
 *
 * @author Cetecom
 */
public class Cliente {
    private int id_cliente;
    private Persona persona;

    public Cliente() {
    }

    public Cliente(int id_cliente, Persona persona) {
        this.id_cliente = id_cliente;
        this.persona = persona;
    }

    public int getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }
    
    @Override
    public String toString(){
        return "Nombre " + persona.getNombre();
    }
    
    
    
    public void sumar(){
        int n1,n2 = 0;
        
        n1 = 10;
        n2 = 10;
        
        System.out.println("El resultado es : " + n1 + n2 );

    }
    
    
    
    public int sumarDos(){
    int n1,n2 = 0;
        
        n1 = 10;
        n2 = 10;
    return  n1 + n2;
    }
    
}
