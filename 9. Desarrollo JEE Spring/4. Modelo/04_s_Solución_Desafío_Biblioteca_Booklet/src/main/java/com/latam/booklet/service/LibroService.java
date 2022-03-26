package com.latam.booklet.service;

import com.latam.booklet.modelo.Libro;
import com.latam.booklet.vo.LibroVO;

public interface LibroService {

	public LibroVO findAll();

	public LibroVO findById(Integer idLibro);

	public LibroVO changeAvailability(Integer idLibro);

	public LibroVO add(Libro usuario);

	public LibroVO update(Libro usuario);

	public LibroVO delete(Libro usuario);

	LibroVO findByTituloOrAutor(String textoBuscado);

}