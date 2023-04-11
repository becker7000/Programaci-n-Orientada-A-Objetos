package agenda;

import java.util.ArrayList;
import java.util.Scanner;

public class Agenda {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		ArrayList<Contacto> contactos = new ArrayList<>();
		
		// Variables auxiliares:
		int opcion=0;
		
		// Variables para crear un contacto:
		int id_global=1; // Inician en 1
		String nombre="";
		String telefono="";
		int id_contacto=0; // Se va usar buscar, eliminar, modificar,etc...
		boolean banderilla;
		
		// Menú:
		while(opcion!=5) {
			
			banderilla=false;
			
			System.out.print("\n\t +------Agenda de contactos-----+");
			System.out.print("\n\t | Selecciona una opción:       |");
			System.out.print("\n\t | 1. Ver contactos             |");
			System.out.print("\n\t | 2. Agregar contacto          |");
			System.out.print("\n\t | 3. Actualizar contacto       |");
			System.out.print("\n\t | 4. Eliminar contacto         |");
			System.out.print("\n\t | 5. Salir de la agenda        |");
			System.out.print("\n\t +------------------------------+");
			System.out.print("\n\t Opción: ");
			opcion=Integer.parseInt(entrada.nextLine());
			
			// Creando cada una de las funciones:
			switch(opcion) {
			case 1 ->{
				System.out.print("\n\t +------ Lista de contactos ------+");
				if(contactos.isEmpty()) {
					System.out.print("\n\t La agenda está vacía.");
				}else {
					for(Contacto contacto : contactos) {
						contacto.mostrarContacto(); // Vamos mostrando contacto por contacto.
					}
				}
			}
			case 2 -> {
				System.out.print("\n\t +------ Agregando contacto ------+");
				System.out.print("\n\t | Nombre: ");
				nombre=entrada.nextLine(); // Se guarda un nombre temporal.
				System.out.print("\n\t | Teléfono: ");
				telefono=entrada.nextLine(); // Se guarda un teléfono temporal.
				Contacto contacto = new Contacto(id_global,nombre,telefono);
				id_global++; // Incrementamos el id.
				contactos.add(contacto);
				System.out.print("\n\t Contacto guardado correctamente...");
				contacto.mostrarContacto();
			}
			case 3 -> { // Actualizar contacto.
				System.out.print("\n\t +------ Actualizar contacto ------+");
				System.out.print("\n\t | Dame el id: ");
				id_contacto=Integer.parseInt(entrada.nextLine());
				
				// Algoritmo de busqueda secuencial para buscar un Contacto por su id.
				for(Contacto contacto : contactos) {
					
					if(contacto.getId()==id_contacto) {
						
						System.out.print("\n\t | Contacto encontrado... ");
						contacto.mostrarContacto();
						
						//Modificando el contacto:
						System.out.print("\n\t | Nombre: ");
						nombre=entrada.nextLine(); // Se guarda un nombre temporal.
						System.out.print("\n\t | Teléfono: ");
						telefono=entrada.nextLine(); // Se guarda un teléfono temporal.
						
						// Modificamos el contacto por medio de sus setters.
						contacto.setNombre(nombre);
						contacto.setTelefono(telefono);
						
						System.out.print("\n\t | Contacto modificado...");
						contacto.mostrarContacto();
						banderilla=true; // El contacto sí fué encotrado.
						break;
						
					}
					
				}
				
				if(banderilla==false) {
					System.out.println("\n\t El contacto no está en la agenda...");
				}
				
			}
			
			case 4 -> {
				
				System.out.print("\n\t +------ Eliminar contacto ------+");
				System.out.print("\n\t | Dame el id: ");
				id_contacto=Integer.parseInt(entrada.nextLine());
				
				// Algoritmo de busqueda secuencial para buscar un Contacto por su id.
				for(Contacto contacto : contactos) {
					
					if(contacto.getId()==id_contacto) {
						
						System.out.print("\n\t | Contacto encontrado... ");
						contacto.mostrarContacto();
						
						// Eliminando el contacto
						contactos.remove(contacto);
						
						System.out.print("\n\t | Contacto eliminado...");
						banderilla=true; // El contacto sí fué encotrado.
						break;
						
					}
					
				}
				
				if(banderilla==false) {
					System.out.println("\n\t El contacto no está en la agenda...");
				}
			}
			case 5 -> {
				System.out.print("\n\t Saliendo de la agenda (tenga en cuenta que todos los contactos se perderan");
			}
			
			}
			
			System.out.print("\n\t Pulsa [Enter] para continuar...");
			entrada.nextLine(); // Simula una pulsación de tecla.
			
			
		}
		
		entrada.close();
		
	}

}

// Nota: CRUD quiere decir: Create, Read, Update and Delete (Crear, Leer, Actualizar y Eliminar).
