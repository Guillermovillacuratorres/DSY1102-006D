/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cl.duoc.models;

/**
 *
 * @author Cetecom
 */
public class Electronico extends Producto{
    private String marcaDelProducto;
    private int garantiaMeses;

    public Electronico() {
    }
    
    
    

    public Electronico(String marcaDelProducto, int garantiaMeses) {
        this.marcaDelProducto = marcaDelProducto;
        this.garantiaMeses = garantiaMeses;
    }

    public Electronico(String marcaDelProducto, int garantiaMeses, String idProducto, String nombreProducto, double precio) {
        super(idProducto, nombreProducto, precio);
        this.marcaDelProducto = marcaDelProducto;
        this.garantiaMeses = garantiaMeses;
    }

    public String getMarcaDelProducto() {
        return marcaDelProducto;
    }

    public void setMarcaDelProducto(String marcaDelProducto) {
        this.marcaDelProducto = marcaDelProducto;
    }

    public int getGarantiaMeses() {
        return garantiaMeses;
    }

    public void setGarantiaMeses(int garantiaMeses) {
        this.garantiaMeses = garantiaMeses;
    }

    @Override
    public String toString() {
        return "Electronico{" + "marcaDelProducto=" + marcaDelProducto + ", garantiaMeses=" + garantiaMeses + '}';
    }
    
    public void extenderGarantia(int mesesExtras){
       this.garantiaMeses += mesesExtras;
        System.out.println("garantia extendida  " + this.garantiaMeses);
    }
}
