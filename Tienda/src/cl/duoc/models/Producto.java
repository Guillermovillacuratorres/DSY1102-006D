/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cl.duoc.models;

/**
 *
 * @author Cetecom
 */
public abstract class Producto implements ICalcular{
    private final String idProducto;
    private String nombre;
    private double precio;
    private int stock;


    public Producto(String idProducto, String nombre, double precio, int stock) {
        this.idProducto = idProducto;
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }

    public String getIdProducto() {
        return idProducto;
    }

  

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public abstract String toString();
    
    public abstract void verProducto();
    
    public void listar(){
        
    }
    
    public void precioConIva(){
        System.out.println("Precio producto: " + this.precio + ((this.precio * IVA) / 100));
    }
    
}
