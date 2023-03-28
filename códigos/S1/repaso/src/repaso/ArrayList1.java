package repaso;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayList1 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		ArrayList<Double> lista = new ArrayList<>(); // Lista vacía.
		
		System.out.print("\n\t Cuantos número quieres guardar? R:");
		int cantidad = Integer.parseInt(entrada.nextLine());
		
		// Llenando el ArrayList
		for(int i=0;i<cantidad;i++) {
			
			System.out.printf("\n\t Dato #%d: ",i+1);
			// ( Scope, alcance, ámbito ) La variable número tiene un alcance local a el for.
			Double numero = Double.parseDouble(entrada.nextLine()); // Variable auxiliar.
			lista.add(numero); // Agregamos el número a la lista con el método add.
			
		}
		
		// Imprimiendo el ArrayList
		// El método size() nos da el tamaño de un ArrayList.
		for(int i=0;i<lista.size();i++) {
			System.out.print("\n\t "+lista.get(i)); // El método get() recibe el índice del elemento solicitado.
		}//Nota. Los ArrayList tienen lógica cero.
		
		entrada.close();
		
	}

}

/*
 * Existen dos tipos de datos en Java
 * 1. Primitivos: (son ligeros y son indivisibles)
 * 	  Son int, char, float, byte y double.
 *    
 * 
 * 2. No primitivos: (son más pesados pero podemos aplicar métodos)
 *    Son Integer,Char,String,StringBuilder,Byte,Double
 *    Integer.parseInt() <- Sí se puede.
 * */

/*
 * 
 *  double(8 bytes) a int(4 bytes)  (No se puede hacer inferencia automatica.
 *  
 *  int(4 bytes) a double(8 bytes)
 *  
 * */






