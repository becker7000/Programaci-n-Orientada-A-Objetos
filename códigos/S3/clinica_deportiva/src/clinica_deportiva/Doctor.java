package clinica_deportiva;

public class Doctor extends Usuario {

	private String especialidad;

	public Doctor(String nombre, String telefono, String especialidad) {
		super(nombre, telefono); // Se hace referencia a la clase Usuario (Superclase)
		this.especialidad = especialidad; // this hace referencia a la clase Doctor (subclase)
	}
	
	public String getEspecialidad() {
		return especialidad;
	}

	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}

	@Override // Sobreescribiendo el método mostrar.
	public void mostrar() {
		
		System.out.print("\n\t ----------MÉDICO-------------");
		System.out.print("\n\t Nombre: "+this.getNombre());
		System.out.print("\n\t Teléfono: "+this.getTelefono());
		System.out.print("\n\t Especialidad: "+this.getEspecialidad());
		
	}
	
}
