/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sistemadecomercioelectronico;

import cl.duoc.models.Electronico;
import cl.duoc.models.Pedido;
import cl.duoc.models.Producto;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Cetecom
 */
public class SistemadeComercioElectronico {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        List<Electronico> listadoProductos = new ArrayList<>();
        Pedido pedidoUno = new Pedido();
        int opcion = 0;
        
        while(opcion != 5){
            System.out.println("****MENU****");
            System.out.println("[1] - Agregar producto Electronicos");
            System.out.println("[2] - Listar producto");
            System.out.println("[3] - Agregar producto al pedido");
            System.out.println("[4] - Listar productos del pedido");
            System.out.println("[5] - Extender garantia");
            System.out.println("[6] - Salir");
            opcion = entrada.nextInt();
            
            switch(opcion){
                case 1:
                    Electronico nuevoElectronico = new Electronico();
                    System.out.println("Ingrese el id: ");
                    nuevoElectronico.setIdProducto(entrada.next());
                    
                    System.out.println("Ingrese la marca: ");
                    nuevoElectronico.setMarcaDelProducto(entrada.next());
                    
                    System.out.println("Ingrese la garantia del producto: ");
                    nuevoElectronico.setGarantiaMeses(entrada.nextInt());
                    
                    System.out.println("Ingrese el nombre del producto: ");
                    nuevoElectronico.setNombreProducto(entrada.next());
                    
                    System.out.println("Ingrese el precio del producto: ");
                    nuevoElectronico.setPrecio(entrada.nextDouble());
                    
                    listadoProductos.add(nuevoElectronico);
                    break;
                case 2:
                    if(listadoProductos.size() > 0){
                        System.out.println("PRODUCTOS EN EL LISTADO: ");
                        for(Electronico i : listadoProductos){
                           System.out.println("ID: " + i.getIdProducto() + 
                                " NOMBRE: " + i.getNombreProducto() +
                                " PRECIO: " + i.getPrecio()
                                );
                        }
                    }else{
                        System.out.println("La lista de productos se encuentra vacia.");
                    }
                    break;
                    
                case 3: 
                    System.out.println("Ingrese el id del producto: ");
                    for(Electronico i : listadoProductos){ 
                        if(i.getIdProducto().equals(entrada.next())){
                            pedidoUno.agregarProducto(i);       
                            System.out.println("Producto agregado al pedido.");
                        }
                    }
                    break;
                
                case 4:
                    System.out.println("PRODUCTOS EN EL PEDIDO: ");
                    for(Producto i : pedidoUno.getProductos()){
                        System.out.println("ID: " + i.getIdProducto() + 
                                            " NOMBRE: " + i.getNombreProducto() +
                                            " PRECIO: " + i.getPrecio());
                    }
                    System.out.println("Total Pedido: " + pedidoUno.calcularTotal());
                    break;
                    
                case 5: 
                    String parIdProducto = "";
                    for(Electronico i : listadoProductos){
                        if(i.getIdProducto().equals(parIdProducto)){
                            System.out.println("Ingrese los mese extra de garantia:");
                            i.extenderGarantia(entrada.nextInt());
                            System.out.println("Garantia extendida!...");
                        }
                    }
                    break;
            }
        }
    }
    
}
