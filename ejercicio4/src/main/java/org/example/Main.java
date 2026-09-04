package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {

        Empleado e1 = new Gerente();
        Empleado e2 = new Vendedor();
        Empleado e3 = new Vendedor();

        Gerente g1 = new Gerente();

        Empresa emp = new Empresa("hola spa", e1,e2,e3);

        System.out.println(emp.getGerente());

        e1.saludar();
        e2.saludar();
    }
}
