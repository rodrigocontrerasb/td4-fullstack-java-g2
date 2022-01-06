package cl.desafioLatam;

import java.util.Scanner;

/**
 *  Proyecto que contiene la simulacion de la raiz cuadrada de un numero
* 16/12/2021
* @author Cristian Jonhson
* @version 17/12/2021 (v1.0)
*/

public class RaizCuadrada {
	public static void main(String[] args) {
		/*Se imprimirá Ingrese un número: por pantalla */
		System.out.printf("Ingrese un número: "); 
		
		/* La clase Scanner se utiliza para leer por consola un valor ingresado por el usuario */
		//estoy asignando a la variable escribir que es de tipo scanner insertar algo
		//porque la sintaxis es asi
		//instancia algo externo 
		Scanner consola = new Scanner(System.in);
		Scanner escribirporconsola = new Scanner(System.in);
		
		/* numero, recibe el valor ingresado por el usuario. nextLong devuelve un tipo de dato primitivo long */
		//variable numero de tipo long
		String texto = consola.nextLine();
		int num = escribirporconsola.nextInt();
		float decimal = consola.nextFloat();
		double decimal2 = consola.nextDouble();
		long numero = escribirporconsola.nextLong();
		
		/* result, recibe el resultado del método sqrt de la clase Math, la cual calcula la raíz cuadrada de un número */
		double result = Math.sqrt(numero);
		
		/* finalmente, se imprime el resultado 
				por pantalla con System.out */
		
		System.out.printf("La raíz cuadrada es: %f", result); 
	}
}
