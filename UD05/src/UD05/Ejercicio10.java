package UD05;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		
		/*Instanciamos un imput de datos del cliente*/
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduzca cuantos productos comprará? ");
		
		/*Le pedimos la cantidad de productos y declaramos la variable que calculará el total*/
		int compra = sc.nextInt();
		int total= 0;
		
		/*Instanciamos un for que recorre tantos productos como se hayan introducido*/
		for (int productos = 1; productos <= compra; productos++) {
		System.out.println("Introduce el precio del producto " + productos);
		total += sc.nextInt();
		
		/*Recorremos el for introduciendo el precio de cada producto y acumulando cada valor */
		}

		/*Output de salida del total de la compra realizada*/
		System.out.println("Total artículos : " + total);
		sc.close();
	}	
}
