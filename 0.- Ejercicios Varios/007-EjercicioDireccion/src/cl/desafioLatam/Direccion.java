package cl.desafioLatam;

import java.util.Scanner;

/**
 *  Proyecto que contiene las distintas formas 
 * de imprimir por pantalla. 
* 16/12/2021
* @author Cristian Jonhson
* @version 17/12/2021 (v1.0)
*/

public class Direccion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("=====Ingreso de datos=======");
		Scanner sc = new Scanner(System.in);

		System.out.print("Ingrese entero: ");
		String entero = sc.nextLine();
		
		System.out.print("el entero en string es: " +entero);
		
		System.out.print("Ingrese Nombre: ");
		String nombre = sc.nextLine();
		
		
		
				System.out.print("Ingrese Apellido: ");
		String apellido = sc.nextLine();

		System.out.print("Ingrese Direccion: ");
		String direccion = sc.nextLine();

		System.out.print("Ingrese Ciudad: ");
		String ciudad = sc.nextLine();

		System.out.print("Ingrese Nro Direccion: ");
		int numeroDireccion = sc.nextInt();

		System.out.print("Ingrese Telefono: ");
		long telefono = sc.nextLong(); // 562264895;
		
		System.out.println(" ");
		System.out.println("=====Imprimir etiqueta 1 =======");
		String etiqueta = String.format("DE:%s %s\nDirección: %s %d\nCiudad:%s\nContacto:%d\n", nombre, apellido,
				direccion, numeroDireccion, ciudad, telefono);
		System.out.println(etiqueta);
		System.out.println(" ");
		System.out.println("=====Imprimir etiqueta 2=======");

		String etiqueta2 = String.format("DE:%s %s\n" 
		+ "Dirección: %s %d\n" 
		+ "Ciudad: %s\n" 
		+ "Contacto:%d\n",
		nombre,apellido, direccion, numeroDireccion, ciudad, telefono);
		System.out.println(etiqueta2);
		System.out.println(" ");
		System.out.println("=====Imprimir con printf=======");
		System.out.printf("DE:%s %s\n" + "Dirección: %s %d\n" + "Ciudad: %s\n" + "Contacto:%d\n", nombre, apellido,
				direccion, numeroDireccion, ciudad, telefono);
		// System.out.println(etiqueta2);
	}

}
