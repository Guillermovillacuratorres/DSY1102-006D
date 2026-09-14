package org.example;

public class Juego {
    private int idJuego;
    private String nombreJuego;
    private String categoriaJuego;
    private int anioJuego;
    private int stockJuego;

    public Juego(int idJuego, String nombreJuego, String categoriaJuego, int anioJuego, int stockJuego) {
        this.idJuego = idJuego;
        this.nombreJuego = nombreJuego;
        this.categoriaJuego = categoriaJuego;
        this.anioJuego = anioJuego;
        this.stockJuego = stockJuego;
    }

    public Juego() {
    }


    public int getIdJuego() {
        return idJuego;
    }

    public void setIdJuego(int idJuego) {
        this.idJuego = idJuego;
    }

    public String getNombreJuego() {
        return nombreJuego;
    }

    public void setNombreJuego(String nombreJuego) {
        this.nombreJuego = nombreJuego;
    }

    public String getCategoriaJuego() {
        return categoriaJuego;
    }

    public void setCategoriaJuego(String categoriaJuego) {
        this.categoriaJuego = categoriaJuego;
    }

    public int getAnioJuego() {
        return anioJuego;
    }

    public void setAnioJuego(int anioJuego) {
        this.anioJuego = anioJuego;
    }

    public int getStockJuego() {
        return stockJuego;
    }

    public void setStockJuego(int stockJuego) {
        this.stockJuego = stockJuego;
    }

    @Override
    public String toString() {
        return "Juego{" +
                "idJuego=" + idJuego +
                ", nombreJuego='" + nombreJuego + '\'' +
                ", categoriaJuego='" + categoriaJuego + '\'' +
                ", anioJuego=" + anioJuego +
                ", stockJuego=" + stockJuego +
                '}';
    }
}
