package UD05;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		
		/*Declaramos una variable constante ya que su valor no cambiará*/
		
		final double IVA = 0.21;
		
		/*Instanciamos el uso de Scanner para que el usuario nos pueda introducir el precio del producto*/
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduzca el precio del producto :");
		
		/*Recogemos el valor del producto y lo parseamos a tipo double*/
		
		String precio = sc.nextLine();
		double precioD = Double.parseDouble(precio);
		sc.close();
		
		/*Realizamos el calculo para obtener el precio con IVA y una salida Output para mostrarlo por consola*/
		double preciof;
		preciof = precioD +(precioD*IVA);
		System.out.println("El precio final aplicando el IVA es: " + preciof);
	}

}
