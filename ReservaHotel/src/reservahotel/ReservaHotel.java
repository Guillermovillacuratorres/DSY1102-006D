/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package reservahotel;

import cl.duoc.models.Cliente;
import cl.duoc.models.Habitacion;
import cl.duoc.models.Hotel;
import cl.duoc.models.Reserva;

/**
 *
 * @author Cetecom
 */
public class ReservaHotel {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Hotel hotelUno = new Hotel("H001", "sheraton");
        hotelUno.agregarHabitacion(new Habitacion("HA001",3000));
        hotelUno.agregarHabitacion(new Habitacion("HA002", 6000));
        
        Cliente clienteUno = new Cliente("CL001", "Pedro");
        Cliente clienteDos = new Cliente("CL002", "Jairo");
        Cliente clienteTres = new Cliente("CL003", "Hitler");
        
        hotelUno.reservarHabitacion(clienteUno);
        hotelUno.reservarHabitacion(clienteDos);
        hotelUno.reservarHabitacion(clienteTres);
        
        
        System.out.println(hotelUno);
        
        
        System.out.println("Reservas del cliente: " + clienteUno.getNombreCliente());
       for(Reserva i : clienteUno.getReservasRealizadas()){
            System.out.println("Hotel: " + i.getHotel().getNombreHotel() + 
                    " Habitacion: " + i.getHabitacion().getNumeroHabitacion()
                    ); 
        }
        
    }
    
}
