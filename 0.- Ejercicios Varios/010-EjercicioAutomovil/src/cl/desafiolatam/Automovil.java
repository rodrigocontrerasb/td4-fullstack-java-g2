package cl.desafiolatam;

import java.util.Scanner;

/**
 *  Proyecto que contiene el ejercicio de Automovil
* 16/12/2021
* @author Cristian Jonhson
* @version 17/12/2021 (v1.0)
*/

public class Automovil {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// decimales float y double 
		
		float distancia;
		float tiempo;
		
		System.out.println("=====Ingreso de datos=======");
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingresa la distancia en km: ");
		distancia = sc.nextFloat();
		System.out.println("Ingresa el tiempo en horas: ");
		tiempo = sc.nextFloat();
		
		// Calcular
		float velocidad = distancia / tiempo;
		System.out.printf("La velocidad es: " +velocidad+ " km/h");
	}

}
