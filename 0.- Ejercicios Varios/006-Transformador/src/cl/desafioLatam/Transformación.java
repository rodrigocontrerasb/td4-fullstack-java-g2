package cl.desafioLatam;

/**
 *  Proyecto que contiene simulacion de calculadora
* 16/12/2021
* @author Cristian Jonhson
* @version 17/12/2021 (v1.0)
*/

public class Transformación {

	public static void main(String[] args) {
		
		
		System.out.println("=====De flotante a entero=======");
		float a = 8.61f;
		int b;
		//transformacion
		b = (int)a;
		//El resultado será 8, es decir la variable a sin los decimales
		System.out.println("Conversion de Float a entero: "+b);
		
		System.out.println(" ");
		System.out.println("=====De número a String=======");
		
		int number = -782;
		String numeroAString = String.valueOf(number);// El resultado será "-782"
		String numeroAString2 = String.valueOf(-782);// El resultado será "-782"
		
		System.out.println("Transformación con variable: "+ numeroAString);
		System.out.println("Transformación a secas: "+ numeroAString2);
		
		
		System.out.println(" ");
		System.out.println("=====De String a int=======");
		String aux = "45";
		//La variable String debe ser númerica o si no habrá un error
		int numero = Integer.parseInt(aux);
		System.out.println("Transformación con variable: "+ numero);
	}

}
