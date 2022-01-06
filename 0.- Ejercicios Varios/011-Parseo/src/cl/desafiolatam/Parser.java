package cl.desafiolatam;

/**
 *  Proyecto que contiene simulacion de Parseo
* 16/12/2021
* @author Cristian Jonhson
* @version 17/12/2021 (v1.0)
*/

public class Parser {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Variables de tipo String
		String stringFloat = "1.2";
		String stringDouble = "2.4";
		String stringInteger = "23";
		
		int intstring = 27;
		
		//Variables numéricas
		float datoFloat;
		double datoDouble;
		int datoInteger;
		
		String datoint;
		
		datoint = String.valueOf(intstring);
		
		System.out.println("de int a string"+ datoint);
		
		//Cada clase tiene su propio parse
		//
		datoFloat = Float.parseFloat(stringFloat);
		datoDouble = Double.parseDouble(stringDouble);
		datoInteger = Integer.parseInt(stringInteger);
		
		System.out.println("=====Parseo a dato primitivo=======");
		System.out.println(" ");
		System.out.println("Esto es un float: " + datoFloat);
		System.out.println("Esto es un double: " + datoDouble);
		System.out.println("Esto es un integer: " + datoInteger);
		
	}

}
