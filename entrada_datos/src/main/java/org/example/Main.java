package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        Scanner input = new Scanner(System.in);

        String nombre = "       ";

        System.out.println(nombre.length());

        if(nombre.isBlank()){
            System.out.println("verdadero");
        }


        try{

            System.out.println("Ingrese su edad: ");
            int edad = input.nextInt();

        }catch(Exception ex){
            System.out.println("No se pueden ingrsar letras.");
        }finally {
            System.out.println("Siempre me ejecuto");
        }
    }
}
