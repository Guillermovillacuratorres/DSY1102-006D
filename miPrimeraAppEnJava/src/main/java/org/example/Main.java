package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        Persona p1 = new Persona();
        Persona p2 = new Persona(1.12f,80,"Pedro",true);
        p1.setNombre("Juanito");
        System.out.println(p1);
        System.out.println(p2);


        String txt1 = "hola";
        String txt2 = "hola";

        int edad = 20;
        double altura = 80;
        float peso = 80f;
        char genero = 'F';

        //           AND           OR
        if(edad > 18 && (edad == 18 || edad == 20) ){
            System.out.println("Se cumple la condicion");
        }else{
            System.out.println("no se cumple la condicion");
        }

        System.out.println(5.0/2.0);

        double result = 5/2;
        System.out.println(result);


        boolean casado = true;

        if(!casado == true){
            System.out.println("Estoy casado!!!!");
        }else{
            System.out.println("No estoy casdo!!");
        }



        if(txt1.equals(txt2)){
            System.out.println("SON IGUALES");
        }


        int suma = (5 + 3) * 8;
        System.out.println("RESULT SUMA ---> " + suma);



        if(edad > 5){
            System.out.println();
        }else if(edad == 10){
            System.out.println();
        }else if(edad == 20){
            System.out.println();
        }else{
            System.out.println();
        }

        int opc = 1;

        switch(opc){
            case 1:
                System.out.println("opc 1");
                break;
            case 2:
                System.out.println("opc 2");
                break;
            case 3:
                System.out.println("opc 3");
                break;
        }


    }
}
