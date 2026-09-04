package org.example;

public class Empresa {
    private String nombre;
    private Empleado gerente;
    private Empleado vendedor1;
    private Empleado vendedor2;

    public Empresa(String nombre, Empleado gerente, Empleado vendedor1, Empleado vendedor2) {
        this.nombre = nombre;
        this.gerente = gerente;
        this.vendedor1 = vendedor1;
        this.vendedor2 = vendedor2;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Empleado getGerente() {
        return gerente;
    }

    public void setGerente(Empleado gerente) {
        this.gerente = gerente;
    }

    public Empleado getVendedor1() {
        return vendedor1;
    }

    public void setVendedor1(Empleado vendedor1) {
        this.vendedor1 = vendedor1;
    }

    public Empleado getVendedor2() {
        return vendedor2;
    }

    public void setVendedor2(Empleado vendedor2) {
        this.vendedor2 = vendedor2;
    }


    @Override
    public String toString() {
        return "Empresa{" +
                "nombre='" + nombre + '\'' +
                ", gerente=" + gerente +
                ", vendedor1=" + vendedor1 +
                ", vendedor2=" + vendedor2 +
                '}';
    }
}
