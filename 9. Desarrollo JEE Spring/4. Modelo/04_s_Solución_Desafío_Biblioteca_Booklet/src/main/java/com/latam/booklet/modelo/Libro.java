package com.latam.booklet.modelo;

public class Libro {
    Integer idLibro;
    Integer anho;
    String titulo;
    String autor;
    String imprenta;
    Integer disponibilidad;

    public Libro(Integer idLibro, Integer anho, String titulo, String autor, String imprenta, Integer disponibilidad) {
        super();
        this.idLibro = idLibro;
        this.anho = anho;
        this.titulo = titulo;
        this.autor = autor;
        this.imprenta = imprenta;
        this.disponibilidad = disponibilidad;
    }

    public Libro(LibroAgregarForm libro) {
        super();
        this.idLibro = libro.getIdLibro();
        this.anho = libro.getAnho();
        this.titulo = libro.getTitulo();
        this.autor = libro.getAutor();
        this.imprenta = libro.getImprenta();
        this.disponibilidad = null != libro.getDisponibilidad() ? (libro.getDisponibilidad() ? 1 : 0) : 1;
    }

    public Libro() {
        super();
    }

    public Integer getIdLibro() {
        return idLibro;
    }

    public void setIdLibro(Integer idLibro) {
        this.idLibro = idLibro;
    }

    public Integer getAnho() {
        return anho;
    }

    public void setAnho(Integer anho) {
        this.anho = anho;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getImprenta() {
        return imprenta;
    }

    public void setImprenta(String imprenta) {
        this.imprenta = imprenta;
    }

    public Integer getDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(Integer disponibilidad) {
        this.disponibilidad = disponibilidad;
    }

    @Override
    public String toString() {
        return "Libro [idLibro=" + idLibro + ", anho=" + anho + ", titulo=" + titulo + ", autor=" + autor
                + ", imprenta=" + imprenta + ", disponibilidad=" + disponibilidad + "]";
    }



}