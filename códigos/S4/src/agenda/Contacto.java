package agenda;

public class Contacto {

	// Atributos
	private int id;
	private String nombre;
	private String telefono;
	private int edad;
	
	// Constructor de la clase Contacto:
	public Contacto(int id,String nombre,String telefono) {
		this.id=id;
		this.nombre=nombre;
		this.telefono=telefono;
		this.edad=20; // Edad por defecto.
	}
	
	public Contacto() {
		this.id=(int)(Math.random()*1000)+2000; // Generando id's del 2000 al 2999
		this.nombre="Sin nombre";
		this.telefono="Sin telefono";
		this.edad=20; // Edad por defecto.
	}

	// Getters y setters:
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	public void mostrarContacto() {
		System.out.printf("\n\t Contacto { Id: %d | Nombre: %s | Telefono: %s } ",id,nombre,telefono);
	}
	
	
	
}
