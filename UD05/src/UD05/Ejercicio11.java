package UD05;

import java.util.Scanner;

public class Ejercicio11 {

	public static void main(String[] args) {
		
		/*Instanciamos un imput de datos del cliente*/
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce un dia de la semana: ");
		/*Imput por teclado del dia de la semana*/
		String diaS = sc.next();
		sc.close();
		
		/*Instanciamos un switch que nos permite definir el Output que realizara en cada caso posible*/
		switch(diaS) {
		case "Lunes":
			System.out.println(diaS + " es dia Laboral");
			break;
		case "Martes":
			System.out.println(diaS + " es dia Laboral");
			break;
		case "Miercoles":
			System.out.println(diaS + " es dia Laboral");
			break;	
		case "Jueves":
			System.out.println(diaS + " es dia Laboral");
			break;
		case "Viernes":
			System.out.println(diaS + " es dia Laboral");
			break;
		case "Sábado":
			System.out.println(diaS + " no es dia Laboral");
			break;
		case "Domingo":
			System.out.println(diaS + " no es dia Laboral");
			break;
			/*Controlamos los errores de introduccion de datos que puedan existir*/
		default:
			System.out.println("No has introducido el dia correctamente, vuelva a intentarlo: ");
		}
	}
}
