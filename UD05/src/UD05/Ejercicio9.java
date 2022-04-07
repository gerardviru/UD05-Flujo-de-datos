package UD05;

public class Ejercicio9 {

	public static void main(String[] args) {
		
		/*Declaramos el bucle que inicia en 1 y acaba en 100*/
		for(int num=1; num<=100; num++) {
			/*Declaramos la primera condición*/
			if(num%2==0) {
				/*Declaramos la segunda condición*/
				if(num%3==0) {
						System.out.println(num+" es divisible entre 2 y 3 ");
						/*Output de los números que cumplen las dos condiciones*/
				}
			}		
		}
	}
}
