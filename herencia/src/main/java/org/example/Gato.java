package org.example;

public class Gato extends Animal{
    private boolean garrasRetractil;

    public Gato(boolean garrasRetractil) {
        this.garrasRetractil = garrasRetractil;
    }

    public Gato(String nombre, String raza, int peso, int velocidad, boolean garrasRetractil) {
        super(nombre, raza, peso, velocidad);
        this.garrasRetractil = garrasRetractil;
    }

    public boolean isGarrasRetractil() {
        return garrasRetractil;
    }

    public void setGarrasRetractil(boolean garrasRetractil) {
        this.garrasRetractil = garrasRetractil;
    }

    @Override
    public void hacerSonido() {
        System.out.println("Miuau");
    }

    @Override
    public String toString() {
        return "Gato{" +
                "garrasRetractil=" + garrasRetractil +
                '}';
    }
}
