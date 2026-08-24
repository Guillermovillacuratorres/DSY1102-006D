package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        //System.out.println(1.5 * 2);

        Producto p1 = new Producto("Teclado","t123",500,10);
        Producto p2 = new Producto("Mouse","m321",1000,15);
        Producto p3 = new Producto("Notebook","n456",5000,3);

        p1.mostrarInfomacion();
        p2.mostrarInfomacion();
        p3.mostrarInfomacion();

        p2.aplicarDescuento(15);
        System.out.println(p2.getPrecio());

        double precioTotal = p1.getPrecio() + p2.getPrecio() + p3.getPrecio();

        System.out.println("Valor total inventario: " +  precioTotal);


        if (p1.hayStock() == false){
            System.out.println("P1 no tiene que hay stock");
        }else if(p2.hayStock() == false){
            System.out.println("P2 no tiene que hay stock");
        }else if(!p3.hayStock()){
            System.out.println("P3 no tiene que hay stock");
        }else{
            System.out.println("Todos los productos cuentan con stock.");
        }
    }
}
