package cl.desafioLatam;

/**
 *  Proyecto que contiene de metodos Strings
* 16/12/2021
* @author Cristian Jonhson
* @version 17/12/2021 (v1.0)
*/

public class StringsVariable {

	public static void main(String[] args) {
		
		
		System.out.println("=====Generando String con format=======");
		int edad = 34;
		String nombre = "William";
		//esto se usa cuando se asigna una variable
		String salida = String.format("%s tiene %d años.", nombre, edad);
		System.out.println(salida);
		//William tiene 34 años.
		//Otros tipos de format
		// int %d
		// char %c
		// float %f
		// String %s
		System.out.println(" ");
		System.out.println("=====Buscando un String=======");
		String s="Camila";
		System.out.printf("%s\n",s.substring(5)); // lelepipedo
		System.out.printf("%s\n",s.substring(1,4));// Para
		
		System.out.println(" ");
		System.out.println("=====Información del String=======");
		//Podemos ver la longitud de un String
		String cadena = "Mi primer programa";
		int longitud = cadena.length(); // - considera los espacios
		System.out.println("mi texto tiene estos caracteres "+longitud);
		
		System.out.println(" ");
		System.out.println("=====Buscar un sufijo=======");
		String cadena2 = "Mi primer programa";
		// Devuelve true si comienza con el sufijo especificado
		boolean resultado = cadena2.startsWith("Mi");
		System.out.println(resultado);
		
		System.out.println(" ");
		System.out.println("=====obtener la posición de alguna letra=======");
		//Desde cero, la p esta en la posición 16
		String cadena3 = "Buenos dias, como estan el dia de hoy?";
		int pos = cadena3.indexOf("p"); // 13 - se comienza a contar desde cero
		System.out.println(pos);

	}

}
