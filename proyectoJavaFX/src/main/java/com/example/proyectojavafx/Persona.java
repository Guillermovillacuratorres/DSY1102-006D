package com.example.proyectojavafx;

public class Persona {
    private int idPersona;
    private String nombrePersona;

    public Persona() {
    }

    public Persona(int idPersona, String nombrePersona) {
        this.idPersona = idPersona;
        this.nombrePersona = nombrePersona;
    }

    public int getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(int idPersona) {
        this.idPersona = idPersona;
    }

    public String getNombrePersona() {
        return nombrePersona;
    }

    public void setNombrePersona(String nombrePersona) {
        this.nombrePersona = nombrePersona;
    }


    @Override
    public String toString() {
        return "Persona{" +
                "idPersona=" + idPersona +
                ", nombrePersona='" + nombrePersona + '\'' +
                '}';
    }


}
