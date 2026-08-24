package org.example;

public class Producto {
    private String nombre, codigo;
    private double precio;
    private int cantidadEnStock;

    public Producto() {
    }

    public Producto(String nombre, String codigo, double precio, int cantidadEnStock) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.precio = precio;
        this.cantidadEnStock = cantidadEnStock;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCantidadEnStock() {
        return cantidadEnStock;
    }

    public void setCantidadEnStock(int cantidadEnStock) {
        this.cantidadEnStock = cantidadEnStock;
    }

    @Override
    public String toString() {
        return "Producto{" +
                "nombre='" + nombre + '\'' +
                ", codigo='" + codigo + '\'' +
                ", precio=" + precio +
                ", cantidadEnStock=" + cantidadEnStock +
                '}';
    }


    public double calcularValorTotal(){
        return   precio*cantidadEnStock;
    }

//                                          25.5%
    public void aplicarDescuento(double porcentaje) {
        //  1000    =   1000     -  (    1000  * (25.5/100))
        //  1000     =    1000         - (       1000        *     0.255)
        // 1000      =     1000     -       255
        //  1000    =      745
        // 745
        this.precio = this.precio - (this.precio * (porcentaje / 100));
    }


    public void mostrarInfomacion(){
        System.out.println("Precio: " + this.precio);
        System.out.println("Cantidad en stock: " + this.cantidadEnStock);
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Codigo: " + this.codigo);
    }


    public boolean hayStock(){
        if (this.cantidadEnStock > 0){
            return true;
        }else{
            return false;
        }
    }
}
