package org.example;

public class Gerente extends Empleado {
    private double bono;

    public Gerente(String nombre, double sueldoBase, double bono) {
        super(nombre, sueldoBase);
        this.bono = bono;
    }

    public Gerente(double bono) {
        this.bono = bono;
    }

    public Gerente() {
    }

    public double getBono() {
        return bono;
    }

    public void setBono(double bono) {
        this.bono = bono;
    }

    @Override
    public String toString() {
        return "Gerente{" +
                "bono=" + bono +
                ", nombre='" + nombre + '\'' +
                ", sueldoBase=" + sueldoBase +
                '}';
    }

    @Override
    public double calcularSueldo() {
        return super.sueldoBase + bono;
    }


    @Override
    public void saludar(){
        System.out.println("Hola, soy un gerente.");
    }

}
