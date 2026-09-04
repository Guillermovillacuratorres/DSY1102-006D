package org.example;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        List<String> listaStrings = new ArrayList<>();
        listaStrings.add("hola");
        listaStrings.add("hola2");
        System.out.println(listaStrings);

        List<Persona> listaPersonas = new ArrayList<>();
        Persona p1 = new Persona("Juanito");
        listaPersonas.add(p1);
        listaPersonas.add(p1);
        listaPersonas.add(p1);


        System.out.println(listaStrings.get(0));

        listaPersonas.add(new Persona("Pedrito"));

        System.out.println(listaPersonas);

        System.out.println(listaPersonas.get(1));


        listaPersonas.remove(p1);

        System.out.println(listaPersonas);


        System.out.println("LARGO LISTA PERSONAS: " + listaPersonas.size());


        for(int i = 0; i < listaPersonas.size(); i++){
            System.out.println("PRIMER FOR: " + listaPersonas.get(i));
        }


        for(Persona i : listaPersonas){
            System.out.println("SGUNDO FOR: " + i);
        }


        listaPersonas.forEach(i ->{
            System.out.println("TERCER FOR: " + i);
        });


        Map<String, Persona> diccionarioPersona = new HashMap<>();

        diccionarioPersona.put("Pedrito", p1);
        diccionarioPersona.put("persona2", new Persona("Diego"));

        System.out.println(diccionarioPersona);

        System.out.println(diccionarioPersona.get("Pedrito"));


        System.out.println("BUSCAR LLAVE: " + diccionarioPersona.containsKey("Pedrito"));



        for(Persona i : diccionarioPersona.values()){
            System.out.println(i);
        }



    }
}
