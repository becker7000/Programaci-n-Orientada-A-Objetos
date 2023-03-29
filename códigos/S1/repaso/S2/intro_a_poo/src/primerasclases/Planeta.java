package primerasclases;

public class Planeta {
	
	// Atributos:
	private String nombre;
	private int posicion;
	private String color;
	
	// Constructor:
	public Planeta(String nombre, int posicion, String color) {
		this.nombre = nombre;
		this.posicion = posicion;
		this.color = color;
	}
	
	// Método personalizado:
	public void mostrarPlaneta() {
		System.out.printf("\n\n\t Nombre: %s",this.nombre);
		System.out.printf("\n\t Posición: %d",this.posicion);
		System.out.printf("\n\t Color: %s",this.color);
	}
	
}


