package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {

        Vendedor v1 = new Vendedor("Pedrito","Perez", 33, 300);

        v1.calcularAnioNcimiento();
        System.out.println(v1);
    }
}
