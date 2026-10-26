package com.example.ejerciciotipoprueba.model;

public class VideoJuego {
    private int idJuego,stock;
    private String tituloJuego, categoriaJuego;

    public VideoJuego(int idJuego, int stock, String tituloJuego, String categoriaJuego) {
        this.idJuego = idJuego;
        this.stock = stock;
        this.tituloJuego = tituloJuego;
        this.categoriaJuego = categoriaJuego;
    }

    public VideoJuego() {
    }


    public String getCategoriaJuego() {
        return categoriaJuego;
    }

    public void setCategoriaJuego(String categoriaJuego) {
        this.categoriaJuego = categoriaJuego;
    }

    public int getIdJuego() {
        return idJuego;
    }

    public void setIdJuego(int idJuego) {
        this.idJuego = idJuego;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String getTituloJuego() {
        return tituloJuego;
    }

    public void setTituloJuego(String tituloJuego) {
        this.tituloJuego = tituloJuego;
    }

    @Override
    public String toString() {
        return "VideoJuego{" +
                "idJuego=" + idJuego +
                ", stock=" + stock +
                ", tituloJuego='" + tituloJuego + '\'' +
                ", categoriaJuego='" + categoriaJuego + '\'' +
                '}';
    }
}
