package UD05;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		
		/*Instanciamos el uso de Scanner para que el usuario introduzca el numero*/
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduzca un n�mero :");
		
		 int num1 = sc.nextInt();
		 sc.close();
		 
		 /*Aplicamos la condici�n, si es divisible tenemos un Output por consola que lo determina
		   si no lo es, sigue la ejecuci�n pasando por el Else y un Output nos muestra la resoluci�n de la condici�n*/
		 
		 if(num1%2==0){
			 System.out.println("El n�mero introducido es divisible");
		 }else{
			 System.out.println("El n�mero introducido no es divisible");
		 }
	}
}
