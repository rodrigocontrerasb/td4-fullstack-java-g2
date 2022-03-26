package com.latam.booklet.modelo;

public class LibroAgregarForm {
    Integer idLibro;
    Integer anho;
    String titulo;
    String autor;
    String imprenta;
    Boolean disponibilidad;

    public LibroAgregarForm(Integer idLibro, Integer anho, String titulo, String autor, String imprenta, Boolean disponibilidad) {
        super();
        this.idLibro = idLibro;
        this.anho = anho;
        this.titulo = titulo;
        this.autor = autor;
        this.imprenta = imprenta;
        this.disponibilidad = disponibilidad;
    }

    public LibroAgregarForm(Libro libro) {
        super();
        this.idLibro = libro.getIdLibro();
        this.anho = libro.getAnho();
        this.titulo = libro.getTitulo();
        this.autor = libro.getAutor();
        this.imprenta = libro.getImprenta();
        this.disponibilidad = null != libro.getDisponibilidad() ? (libro.getDisponibilidad() == 1) : true;
    }

    public LibroAgregarForm() {
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

    public Boolean getDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(Boolean disponibilidad) {
        this.disponibilidad = disponibilidad;
    }

    @Override
    public String toString() {
        return "Libro [idLibro=" + idLibro + ", anho=" + anho + ", titulo=" + titulo + ", autor=" + autor
                + ", imprenta=" + imprenta + ", disponibilidad=" + disponibilidad + "]";
    }



}