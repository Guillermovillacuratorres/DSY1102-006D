package org.example;

public class Vendedor extends Persona{
    private int comision;

    public Vendedor(int comision) {
        this.comision = comision;
    }

    public Vendedor(String nombre, String apellido, int edad, int comision) {
        super(nombre, apellido, edad);
        this.comision = comision;
    }

    public int getComision() {
        return comision;
    }

    public void setComision(int comision) {
        this.comision = comision;
    }

    @Override
    public String toString() {
        return "org.example.Vendedor{" +
                "comision=" + comision +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", edad=" + edad +
                '}';
    }
}
