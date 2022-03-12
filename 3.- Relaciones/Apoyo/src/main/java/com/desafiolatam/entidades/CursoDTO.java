package com.desafiolatam.entidades;

public class CursoDTO {
	
	private int idCurso;
	
	private String descricion;
	
	private double precio;
	
	public int getIdCurso() {
		return idCurso;
	}
	public void setIdCurso(int idCurso) {
		this.idCurso = idCurso;
	}
	public String getDescricion() {
		return descricion;
	}
	public void setDescricion(String descricion) {
		this.descricion = descricion;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
}
