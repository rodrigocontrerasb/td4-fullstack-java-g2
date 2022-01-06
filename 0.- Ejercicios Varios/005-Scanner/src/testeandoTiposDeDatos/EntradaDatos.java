package testeandoTiposDeDatos;

import java.util.Scanner;

/**
 *  Proyecto que contiene simulacion la entrada de datos con Scanners
* 16/12/2021
* @author Cristian Jonhson
* @version 17/12/2021 (v1.0)
*/

public class EntradaDatos {
	
	public static void main(String[] args) {
		
		System.out.println("=====Ingresando valores por Scanner=======");
		// Se crea el objeto Scanner
		
		//Instancia input
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese un dato: ");
		// nextLine se ocupa scanner cuando string
		String i = sc.nextLine();
		//nextInt 
		int numero = sc.nextInt();
		
		float dexcimal = sc.nextFloat();
		double dec2 = sc.nextDouble();
		
		//Se lee una línea
		System.out.println("Usted ha ingresado: "+ i);
		System.out.println("Usted ha ingresado: "+ numero);

		
		
	}
	
}
