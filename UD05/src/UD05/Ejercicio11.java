package UD05;

import java.util.Scanner;

public class Ejercicio11 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce un dia de la semana: ");
		String diaS = sc.next();
		sc.close();
		
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
		default:
			System.out.println("No has introducido el dia correctamente, vuelva a intentarlo: ");
		}
	}
}
