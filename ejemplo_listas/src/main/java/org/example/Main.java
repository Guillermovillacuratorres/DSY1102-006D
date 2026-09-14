package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {

        List<Juego> juegos = new ArrayList<>();


        int opcion = 0;
        Scanner entradaNumeros = new Scanner(System.in);
        Scanner entradaTexto = new Scanner(System.in);

        while(true){
            System.out.println("[1] - Agrega juego");
            System.out.println("[2] - Eliminar juego");
            System.out.println("[3] - Mostrar juego");
            System.out.println("[4] - Editar juego");
            System.out.println("[5] - Salir");

            System.out.println("Ingrese una opción: ");
            opcion = entradaNumeros.nextInt();

            if(opcion == 1){
                Juego j1 = new Juego();

                boolean idValido = true;
                int entradaIdJuego = 0;
                String entradaNombreJuego = "";
                String entradaCategoriaJuego = "";
                int entradaAnioJuego = 0;
                int entradaStockJuego = 0;

                while(idValido) {
                    System.out.println("Ingrese el id del juego: ");
                    entradaIdJuego = entradaNumeros.nextInt();
                    if(juegos.isEmpty() == false){
                        for (Juego i : juegos) {
                            if (i.getIdJuego() != entradaIdJuego) {
                                System.out.println("agrego");
                                idValido = false;
                                break;
                            } else {
                                System.out.println("Id de juego incorrecto");
                                break;
                            }
                        }
                    }else{
                        idValido = false;
                    }

                    System.out.println("Ingrese el nombre del juego: ");
                    entradaNombreJuego = entradaTexto.next();

                    System.out.println("Ingrese la categoria del juego: ");
                    entradaCategoriaJuego = entradaTexto.next();

                    while(true){
                        System.out.println("Ingrese el anio del juego: ");
                        try{
                            entradaAnioJuego = entradaNumeros.nextInt();
                            break;
                        }catch (Exception e){
                            System.out.println("Error, no se permiten letras, solo puede ingresar numeros.");
                            entradaNumeros.nextLine();
                        }
                    }


                    System.out.println("Ingrese el stock del juego: ");
                    entradaStockJuego = entradaNumeros.nextInt();
                }


                j1.setIdJuego(entradaIdJuego);
                j1.setNombreJuego(entradaNombreJuego);
                j1.setAnioJuego(entradaAnioJuego);
                j1.setCategoriaJuego(entradaCategoriaJuego);
                j1.setStockJuego(entradaStockJuego);
                juegos.add(j1);
                System.out.println("juego agregado correctamente a la lista!!");


            }

            if (opcion == 2){
                System.out.println("Ingrese el id del juego a eliminar: ");
                int idEliminar =  entradaNumeros.nextInt();
                for(Juego j : juegos){
                    if(j.getIdJuego() == idEliminar){
                        juegos.remove(j);
                        System.out.println("juego eliminado correctamente a la lista!!");
                        break;
                    }
                }
                System.out.println("juego no encontrado.");
            }

            if (opcion == 3){
                if (juegos.isEmpty()){
                    System.out.println("La lista está vacía.");
                }else{
                    for(Juego i : juegos){
                        System.out.println("ID: " +  i.getIdJuego() + " - "  + "NOMBRE: " + i.getNombreJuego());
                    }
                }
            }
            if (opcion == 4){

            }

            if (opcion == 5){
                System.out.println("Saliendo de la app....");
                break;
            }


        }


    }
}
