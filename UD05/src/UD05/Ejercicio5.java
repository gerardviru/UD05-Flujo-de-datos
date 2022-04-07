package UD05;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		
		/*Instanciamos el uso de Scanner para que el usuario introduzca el numero*/
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduzca un número :");
		
		 int num1 = sc.nextInt();
		 sc.close();
		 
		 /*Aplicamos la condición, si es divisible tenemos un Output por consola que lo determina
		   si no lo es, sigue la ejecución pasando por el Else y un Output nos muestra la resolución de la condición*/
		 
		 if(num1%2==0){
			 System.out.println("El número introducido es divisible");
		 }else{
			 System.out.println("El número introducido no es divisible");
		 }
	}
}
