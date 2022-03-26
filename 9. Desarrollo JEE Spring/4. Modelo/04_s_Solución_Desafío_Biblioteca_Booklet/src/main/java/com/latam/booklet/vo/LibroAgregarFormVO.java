package com.latam.booklet.vo;

import java.util.List;

import com.latam.booklet.modelo.LibroAgregarForm;

public class LibroAgregarFormVO {
	List<LibroAgregarForm> libros;
	String mensaje;
	String codigo;

	public LibroAgregarFormVO(List<LibroAgregarForm> libros, String mensaje, String codigo) {
		super();
		this.libros = libros;
		this.mensaje = mensaje;
		this.codigo = codigo;
	}

	public LibroAgregarFormVO() {
		super();
	}

	public List<LibroAgregarForm> getLibros() {
		return libros;
	}

	public void setLibros(List<LibroAgregarForm> libros) {
		this.libros = libros;
	}

	public String getMensaje() {
		return mensaje;
	}

	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

}