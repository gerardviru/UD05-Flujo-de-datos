package UD05;

import java.util.Scanner;

public class CalculadoraInversa {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		/*Declaramos las variables de los valores que se introduciran y una que sera el resultado*/
		 double valor1;
	     double valor2;
	     double resultado=0;
	     
	     /*Instanciamos la entrada de los valores y el signo de la operacion*/
	     
	     System.out.println("Introduce el primer valor");
	     valor1=sc.nextDouble();
	     
	     System.out.println("Introduzca la operacion");
	     String signo = sc.next();
	     
	     System.out.println("Introduce el segundo valor");
	     valor2=sc.nextDouble();
	     
	     /*Tenemos diferentes operaciones, por lo que usaremos un switch para asignar un resultado por cada signo*/
	     /*Controlamos los posibles errores de entrada en el default*/
	     /*Se realiza el Output que muestra los valores su operacion y el resultado */
	     switch (signo){
         	case "+":
         		resultado=valor1+valor2;
         		break;
         	case "-":
         		resultado=valor1-valor2;
         		break;
         	case "*":
         		resultado=valor1*valor2;
         		break;
         	case "/":
         		resultado=valor1/valor2;
         		break;
         	case "^":
         		resultado=(int)Math.pow(valor1, valor2);
         		break;
         	case "%":
         		resultado=valor1%valor2;
         		break;
         	default:
         		System.out.println("El signo de la operación no valido, intentelo de nuevo");
         	}
	     System.out.println( valor1+" "+signo+" "+valor2+" = "+resultado);
	}

}
