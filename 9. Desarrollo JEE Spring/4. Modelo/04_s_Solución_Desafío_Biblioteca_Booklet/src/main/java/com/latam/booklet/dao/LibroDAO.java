package com.latam.booklet.dao;

import java.util.List;

import com.latam.booklet.modelo.Libro;

public interface LibroDAO {

    public List<Libro> findAll();

    public Libro findById(Integer idLibro);

    public int add(Libro libro);

    public int update(Libro libro);

    public int delete(Libro libro);

    List<Libro> findByTituloOrAutor(String textoBuscado);

}