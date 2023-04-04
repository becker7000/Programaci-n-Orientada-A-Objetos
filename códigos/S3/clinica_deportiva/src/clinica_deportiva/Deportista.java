package clinica_deportiva;

public class Deportista extends Usuario {

	private String disciplina;
	
	public Deportista(String nombre, String telefono, String disciplina) {
		super(nombre, telefono); // Superclase
		this.disciplina = disciplina; // Subclase
	}
	
	public String getDisciplina() {
		return disciplina;
	}

	public void setDisciplina(String disciplina) {
		this.disciplina = disciplina;
	}


	@Override
	public void mostrar() {
		
		System.out.print("\n\t ----------DEPORTISTA-------------");
		System.out.print("\n\t Nombre: "+this.getNombre());
		System.out.print("\n\t Teléfono: "+this.getTelefono());
		System.out.print("\n\t Deporte: "+this.getDisciplina());
		
	}

	
	

	
	
}
