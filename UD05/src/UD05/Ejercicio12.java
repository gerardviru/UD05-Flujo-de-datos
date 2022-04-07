package UD05;

import java.util.Scanner;

public class Ejercicio12 {

	public static void main(String[] args) {
		
		/*Instanciamos un imput de datos del cliente*/
		Scanner sc = new Scanner(System.in);
		
		/*Declaramos y asignamos el valor a la variable que ser� la contrase�a*/
		String contrase�a = "BotCamp2022";
		
		/*Valiable constante, ya que solo va a tener 3 intentos para poder introducir la contrase�a correcta*/
		final int intentos=3;
		
		/*Declaramos una variable de tipo boolean, que en caso de que acierte la condicion nos controlara que cambie*/
		boolean correcto=false;
		
			/*Declaramos un bucle que realizara el numero de intentos determinado, a no ser que la condicion se cumpla*/
			for (int num=0; num<intentos && !correcto; num++) {
				System.out.println("Introduce la contrase�a: ");
				String prueba = sc.nextLine();	
				
				/*Comprobamos si coinciden los valores*/
					if(prueba.equals(contrase�a)){
						System.out.println("Contrase�a correcta! ");
						correcto=true;
			}
		}
	}
}
