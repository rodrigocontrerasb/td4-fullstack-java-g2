package com.desafio.sistemasolar;

import java.util.ArrayList;

public interface IPlaneta {
	public void setNombre(String nombre);
	public String getNombre();
	public void setTamano(int tamano);
	public int getTamano();
	public void setDistanciaSol(int distanciaSol);
	public int getDistanciaSol();
	public ArrayList<Luna> getLunas();
	public void setLunas(Luna lunas);
}
