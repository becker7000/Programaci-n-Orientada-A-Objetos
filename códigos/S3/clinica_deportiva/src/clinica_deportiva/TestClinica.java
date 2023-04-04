package clinica_deportiva;

import java.util.ArrayList;

public class TestClinica {

	public static void main(String[] args) {
		
		// Creamos instancias de la clase Doctor que su vez son de la clase Usuario
		Doctor doc1 = new Doctor("Eduardo","5561725342","Cardiología");
		Doctor doc2 = new Doctor("Laura","5500918299","Neurología");
		
		// Creamos instancias de la clase Deportista que su vez son de la clase Usuario
		Deportista dep1 = new Deportista("Samantha","5512345688","Altletísmo");
		Deportista dep2 = new Deportista("Marco","5591827366","Natación");
		
		// Creamos una lista que va a guardar instancias de la clase Usuario
		ArrayList<Usuario> usuarios = new ArrayList<>();
		
		// Agregamos las instancias a lista
		usuarios.add(doc1);
		usuarios.add(doc2);
		usuarios.add(dep1);
		usuarios.add(dep2);
		
		// Mostramos a todos los usuarios (doctores o deportistas)
		for(Usuario usuario : usuarios) {
			usuario.mostrar(); // Método polimórfico.
		}
		
		
		
		
	}

}
