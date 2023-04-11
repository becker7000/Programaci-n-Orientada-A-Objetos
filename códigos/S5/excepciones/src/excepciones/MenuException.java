package excepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MenuException {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		int opcion;
		
		// Presentamos un menú de opciones del 1 al 4.
		System.out.print("\n\t Selecciona una opción.");
		System.out.print("\n\t 1. Primera opción.");
		System.out.print("\n\t 2. Segunda opción.");
		System.out.print("\n\t 3. Tercera opción.");
		System.out.print("\n\t 4. Cuarta opción.");
		System.out.print("\n\t Opción: ");
		
		// Guardamos la opción del usuario.
		try {
			opcion = entrada.nextInt(); entrada.nextLine();
		}catch(InputMismatchException exception) {
			System.out.print("\n\t La opción debe ser un número. (Ejemplo: 3)");
			System.out.print("\n\t Mensaje de la excepción: "+exception.getMessage());
		}catch(Exception exception) {
			System.out.print("\n\t Mensaje de error: "+exception.getMessage());
		}
		
		System.out.print("\n\t El programa continua...");
		
		
		entrada.close();
		

	}

}
