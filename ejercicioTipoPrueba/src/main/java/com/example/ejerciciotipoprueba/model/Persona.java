package com.example.ejerciciotipoprueba.model;

public abstract class Persona {
    protected int idPersona, edadPersona;
    protected String nombrePersona;
    protected  boolean casado;

    public Persona(int idPersona, int edadPersona, String nombrePersona, boolean casado) {
        this.idPersona = idPersona;
        this.edadPersona = edadPersona;
        this.nombrePersona = nombrePersona;
        this.casado = casado;
    }

    public Persona() {
    }


    public int getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(int idPersona) {
        this.idPersona = idPersona;
    }

    public int getEdadPersona() {
        return edadPersona;
    }

    public void setEdadPersona(int edadPersona) {
        this.edadPersona = edadPersona;
    }

    public String getNombrePersona() {
        return nombrePersona;
    }

    public void setNombrePersona(String nombrePersona) {
        this.nombrePersona = nombrePersona;
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
                "idPersona=" + idPersona +
                ", edadPersona=" + edadPersona +
                ", nombrePersona='" + nombrePersona + '\'' +
                ", casado=" + casado +
                '}';
    }

    public abstract int calcularSueldo();

}
