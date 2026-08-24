package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public void saludar(){
        System.out.println("Hola como estas?");
    }

    public void saludar(String nombre){
        System.out.println("Hola " + nombre +  " como estas?");
    }

    public int suma(){
        return 100 + 1;
    }



     void main() {
        saludar();
        int resultadoSuma = suma();
        System.out.println(resultadoSuma);
        saludar("Pedro");

    }
}
