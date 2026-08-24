package org.example;

public abstract class Animal {
    private String nombre, raza;
    private int peso, velocidad;

    public Animal() {
    }

    public Animal(String nombre, String raza, int peso, int velocidad) {
        this.nombre = nombre;
        this.raza = raza;
        this.peso = peso;
        this.velocidad = velocidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }


    public abstract void hacerSonido();

    @Override
    public String toString() {
        return "Animal{" +
                "nombre='" + nombre + '\'' +
                ", raza='" + raza + '\'' +
                ", peso=" + peso +
                ", velocidad=" + velocidad +
                '}';
    }
}
