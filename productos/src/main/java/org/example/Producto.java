package org.example;

import java.util.ArrayList;
import java.util.List;

public class Producto  implements ContratoInterface {
    private int idProducto, stockProducto, cantidadProducto;
    private String nombreProducto;
    private List<String> listaColores = new ArrayList<>();

    public Producto(int idProducto, int stockProducto, int cantidadProducto, String nombreProducto) {
        this.idProducto = idProducto;
        this.stockProducto = stockProducto;
        this.cantidadProducto = cantidadProducto;
        this.nombreProducto = nombreProducto;
    }

    public Producto() {
    }

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public int getStockProducto() {
        return stockProducto;
    }

    public void setStockProducto(int stockProducto) {
        this.stockProducto = stockProducto;
    }

    public int getCantidadProducto() {
        return cantidadProducto;
    }

    public void setCantidadProducto(int cantidadProducto) {
        this.cantidadProducto = cantidadProducto;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    @Override
    public String toString() {
        return "Producto{" +
                "idProducto=" + idProducto +
                ", stockProducto=" + stockProducto +
                ", cantidadProducto=" + cantidadProducto +
                ", nombreProducto='" + nombreProducto + '\'' +
                '}';
    }


    @Override
    public void vender() {
        System.out.println("Vendor Producto");
    }






    @Override
    public int carrito() {
        return 100;
    }



    public void agregarColor(String color) {
        listaColores.add(color);
    }



    public void getListaColores() {
        for (String i : listaColores) {
            System.out.printf(i);
        }
    }


}
