/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package automotora;

import java.time.LocalDate;
import java.time.Month;
import java.util.Scanner;

/**
 *
 * @author Cetecom
 */
public class Automotora {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        
        Persona pCliente = new Persona();
        Persona pVendedor = new Persona();        
        
        Cliente cliente = new Cliente();
        
        Vehiculo auto = new Vehiculo();
        
        
        
        
        int opcion = 0;
        
        while(opcion != 5 ){
            System.out.println("=== Menu ===");
            System.out.println("[1] - Agregar cliente");
            System.out.println("[2] - Agregar vendedor");
            System.out.println("[3] - Agregar vehiculo");
            System.out.println("[4] - Generar venta");
            System.out.println("[5] - Salir");
            
            opcion = entrada.nextInt();
            
            switch(opcion){
                case 1:
                    
                    entrada.nextLine();
                    
                    String apellido = "";
                    
                    while(true){
                        System.out.println("Ingrese el apellido del cliente:");
                        apellido = entrada.nextLine().trim();
                        pCliente.setApellido(apellido);
                        if(!apellido.isEmpty()){
                            break;
                        }else{
                            System.out.println("Debe ingresar un nombre.");
                        }
                    }
                    
                    System.out.println("Ingrese el nombre del cliente:");
                    pCliente.setNombre(entrada.next());
                    
                    System.out.println("Ingrese el rut del usuario: ");
                    pCliente.setRut(entrada.next());
                    
                    String telefonoCliente = "";
                    while(true){
                        
                        System.out.println("Ingrese el telefono del cliente:"); 
                        telefonoCliente = entrada.nextLine();
                        System.out.println("----> " + telefonoCliente);
                        if(telefonoCliente.length() > 0){
                            pCliente.setTelefono(Integer.parseInt(telefonoCliente));
                            break;
                        }else{
                            System.out.println("Debe ingresar un numero de telefono.");
                        }
                    }
                    
                    
                    
                    
                    
                    int anio,mes,dia = 0;
                    
                    while(true){
                        System.out.println("Ingrese el año:");
                        anio = entrada.nextInt();

                        System.out.println("Ingrese el mes:");
                        mes = entrada.nextInt();

                        System.out.println("Ingrese el dia:");
                        dia = entrada.nextInt();
                        
                        LocalDate fechaIngresada;
                        
                        fechaIngresada = LocalDate.of(anio,mes,dia);
                        
                        if(!LocalDate.now().isBefore(fechaIngresada)){
                            break;
                        }else{
                            System.out.println("Fecha no valida.");
                        }
                    
                    }
                    

                    
                    pCliente.setFecha_nacimiento(LocalDate.of(anio,mes,dia));
                    
                    cliente.setId_cliente(1);
                    cliente.setPersona(pCliente);
                    
                    
                    System.out.println(cliente);
                    break;
                    
                case 2:
                    System.out.println("opcion 2");
                    auto.setMarca("Toyota");
                    System.out.println(auto.verMarcaVehiculo());
                    
                    auto.mostrarNombrePersona("Pedro", true, pCliente);
                    auto.setPrecio(5000);
                    auto.calcularIvaVehiculo();
                    break;
                case 3:
                    System.out.println("opcion 3");
                    System.out.println(cliente.sumarDos());
                    break;
                case 4:
                    System.out.println("opcion  4");
                    break;
                case 5:
                    System.out.println("Saliendo!!!!");
                    break;
                default:
                    System.out.println("Opcion no valida.");
                    break;
            }
            
            
            
            
        }
        

        
        
    }
}
