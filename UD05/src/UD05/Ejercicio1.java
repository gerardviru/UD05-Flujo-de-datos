package UD05;

public class Ejercicio1 {

	public static void main(String[] args) {
		
		/*Declaramos dos variables de tipo int*/
		/*Aplicamos la primera condición acompañada de un Output en caso de que se cumpla*/
		/*En caso de que no se cumpla realizamos una segunda condición con su Output correspondiente,
		 y si esta última condición no se cumple el bloque acabara con el Else que lee el Output correspondiente*/
		
		int num1 = 6;
		int num2 = 12;
		
		if (num1 == num2) {
				System.out.println("Son iguales");
		}else if (num1 > num2) {
				System.out.println("Num1 es mayor");
		}else{
			System.out.println("Num2 es mayor");
		}
		
		System.out.println();
		
		/*Asignamos nuevos valores a las variables para confirmar si las condiciones se cumplen*/
		num1 = 113;
		num2 = 54;
		
		if (num1 == num2) {
				System.out.println("Son iguales");
		}else if (num1 > num2) {
				System.out.println("Num1 es mayor");
		}else{
			System.out.println("Num2 es mayor");
		}
		
		System.out.println();
		
		num1 = 33;
		num2 = 33;
		
		if (num1 == num2) {
				System.out.println("Son iguales");
		}else if (num1 > num2) {
				System.out.println("Num1 es mayor");
		}else{
			System.out.println("Num2 es mayor");
		}
	}
}
