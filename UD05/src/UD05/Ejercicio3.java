package UD05;

import javax.swing.JOptionPane;

public class Ejercicio3 {

	public static void main(String[] args) {
		
		/*Declaramos y realizamos un OptionPanel para poder introducir el nombre*/
		/*Realizamos un Output del mensaje junto al nombre*/
		
		String nombre=JOptionPane.showInputDialog("Introduce tu nombre");
		
		JOptionPane.showMessageDialog(null, "Bienvenido "+ nombre);
	}

}
