package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {

        Gato gatito = new Gato("michi","nose", 15,45,true);
        gatito.setPeso(25);

        System.out.println(gatito);
    }
}
