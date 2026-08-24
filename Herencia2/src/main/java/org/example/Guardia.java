package org.example;

public class Guardia extends Persona {
    private boolean cursoSeguridad;

    public Guardia(boolean cursoSeguridad) {
        this.cursoSeguridad = cursoSeguridad;
    }

    public Guardia(String nombre, String apellido, int edad, boolean cursoSeguridad) {
        super(nombre, apellido, edad);
        this.cursoSeguridad = cursoSeguridad;
    }

    public Guardia() {
    }

    public boolean isCursoSeguridad() {
        return cursoSeguridad;
    }

    public void setCursoSeguridad(boolean cursoSeguridad) {
        this.cursoSeguridad = cursoSeguridad;
    }


    @Override
    public String toString() {
        return "org.example.Guardia{" +
                "cursoSeguridad=" + cursoSeguridad +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", edad=" + edad +
                '}';
    }
}
