package com.example.ejerciciotipoprueba.model;

public class Docente extends Persona{
    private String tituloProfesional;
    private int sueldo;

    public Docente(int idPersona, int edadPersona, String nombrePersona, boolean casado, String tituloProfesional, int sueldo) {
        super(idPersona, edadPersona, nombrePersona, casado);
        this.tituloProfesional = tituloProfesional;
        this.sueldo = sueldo;
    }

    public Docente(String tituloProfesional, int sueldo) {
        this.tituloProfesional = tituloProfesional;
        this.sueldo = sueldo;
    }

    public Docente() {
    }


    public String getTituloProfesional() {
        return tituloProfesional;
    }

    public void setTituloProfesional(String tituloProfesional) {
        this.tituloProfesional = tituloProfesional;
    }

    public int getSueldo() {
        return sueldo;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {
        return "Docente{" +
                "tituloProfesional='" + tituloProfesional + '\'' +
                ", sueldo=" + sueldo +
                ", idPersona=" + idPersona +
                ", edadPersona=" + edadPersona +
                ", nombrePersona='" + nombrePersona + '\'' +
                ", casado=" + casado +
                '}';
    }

    @Override
    public int calcularSueldo() {
        return 100;
    }
}
