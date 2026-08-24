package org.example;

public class Persona {
    private float altura;
    private float peso;
    private String nombre;
    private boolean casado;

    public Persona() {}

    public Persona(float altura, float peso, String nombre, boolean casado) {
        this.altura = altura;
        this.peso = peso;
        this.nombre = nombre;
        this.casado = casado;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isCasado() {
        return casado;
    }

    public void setCasado(boolean casado) {
        this.casado = casado;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "altura=" + altura +
                ", peso=" + peso +
                ", nombre='" + nombre + '\'' +
                ", casado=" + casado +
                '}';
    }
}
