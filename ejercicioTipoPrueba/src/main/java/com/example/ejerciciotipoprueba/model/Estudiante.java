package com.example.ejerciciotipoprueba.model;

public class Estudiante  extends  Persona{
    private String nivelConocimientos;

    public Estudiante(int idPersona, int edadPersona, String nombrePersona, boolean casado, String nivelConocimientos) {
        super(idPersona, edadPersona, nombrePersona, casado);
        this.nivelConocimientos = nivelConocimientos;
    }

    public Estudiante(String nivelConocimientos) {
        this.nivelConocimientos = nivelConocimientos;
    }

    public Estudiante() {
    }

    public String getNivelConocimientos() {
        return nivelConocimientos;
    }


    public String setNivelConocimientos(String nivelConocimientos) {

        if (nivelConocimientos == null) {
            return "El nivel conocimientos es nullo";
        }
         this.nivelConocimientos = nivelConocimientos;
        return nivelConocimientos;

    }


    @Override
    public String toString() {
        return "Estudiante{" +
                "nivelConocimientos='" + nivelConocimientos + '\'' +
                ", idPersona=" + idPersona +
                ", edadPersona=" + edadPersona +
                ", nombrePersona='" + nombrePersona + '\'' +
                ", casado=" + casado +
                '}';
    }

    @Override
    public int calcularSueldo() {
        return 200;
    }
}
