package clinica_deportiva;

// Las clase abstractas no se instancían, 
// sólo se usan para crear otras clase (subclases).
public abstract class Usuario {

	// Atributos: 
    protected String nombre;
    protected String telefono;
	
	// Constructor
	public Usuario(String nombre, String telefono) {
		this.nombre = nombre;
		this.telefono = telefono;
	}
	
	// Getters
	public String getNombre() {
		String _nombre=this.nombre;
		return _nombre;
	}
	
	public String getTelefono() {
		String _telefono = this.telefono;
		return _telefono;
	}
	
	// Setters
	public void setNombre(String nombre) {
		this.nombre=nombre;
	}
	
	public void setTelefono(String telefono) {
		this.telefono=telefono;
	}
	
	// Método abstracto 
	// Son métodos que se implementan por otros programadores.
	// Será obligatorio que el siguiente programador la implemente.
	public abstract void mostrar();

}
