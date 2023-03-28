package repaso;

import java.util.Scanner;

public class Adivina {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		System.out.print("\n\t Estoy pensando en un número del 1 al 100.");
		System.out.print("\n\t Adivina cual es!");
		
		int numero = (int) (Math.random()*100)+1; // 0*100=0 a 0.99*100=99.99
	
		//System.out.println("\n\t El número es: "+numero);

		int respuesta,intentos=0;
		
		while(true) {
			
			intentos++; // Aumentamos los intentos.
			
			System.out.print("\n\t Respuesta: ");
			respuesta = Integer.parseInt(entrada.nextLine());
			
			if(respuesta==numero) {
				System.out.print("\n\t Felicidades, has logrado adivinar el número.");
				System.out.printf("\n\t Lograste adivinaer en %d intentos",intentos);
				break; // Rompe el ciclo while.
			}
			
			if(respuesta<numero) // 79(número a adivinar) y el usuario 50(respuesta).
				System.out.print("\n\t El número a adivinar es mayor.");
			
			if(respuesta>numero)
				System.out.print("\n\t El número a adivinar es menor.");
			
		}
		
		System.out.print("\n\t Fin del juego, gracias por jugar...");
		
		
		entrada.close();
	}

}

/*
 * Estoy pensando en un número del 1 al 100.
 * Adivina cual es! (79)
 * 
 * Respuesta:
 * 50
 * El número a adivinar es mayor.
 * Respuesta:
 * 75
 * El número a adivinar es mayor.
 * Respuesta:
 * 87
 * El número a adivinar es menor.
 * Respuesta:
 * 79
 * Felicidades, has logrado adivinar el número en 4 intentos.
 * 
 * */
