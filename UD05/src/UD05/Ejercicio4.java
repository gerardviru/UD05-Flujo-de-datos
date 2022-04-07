package UD05;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		
		/*Declaramos la constante*/
		final double pi= 3.14;
		
		/*Output para pedir que el usuario introduzca el radio*/
		/*El radio introducido es de tipo String, declaramos una variable double para
		  poder parsear el valor introducido por el usuario y que pase de String a Double*/
		
		System.out.print("Introduzca el radio del circulo: ");
		Scanner sc = new Scanner(System.in);
		
		String radio = sc.nextLine();
		sc.close();
		double radioD = Double.parseDouble(radio);
		
		/*Declaramos una variable tipo double para poder operar con el método Math
		 y realizamos el output del resultado*/
		
		double operacion;
		operacion = pi * Math.pow(radioD, 2);
		System.out.println(operacion);
	}

}
