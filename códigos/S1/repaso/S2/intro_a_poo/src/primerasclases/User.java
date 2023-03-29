package primerasclases;

public class User { // POJO: Plain old java object

	// Atributos de la clase:
	private int id;
	private String name;
	private String email;
	private String address;
	private String phoneNumber;
	
	// Métodos de la clase:
	
	// Definción del método constructor:
	public User(int id, String name, String email, String address, String phoneNumber) {
		this.id=id;
		this.name=name;
		this.email=email;
		this.address=address;
		this.phoneNumber=phoneNumber;
	}
	
	// Método creado por nosotros para visualizar a un Usuario.
	public void showUser() {
		System.out.print("\n\t Id: "+this.id);
		System.out.print("\n\t Name: "+this.name);
		System.out.print("\n\t Email: "+this.email);
		System.out.print("\n\t Addrees: "+this.address);
		System.out.print("\n\t Phone: "+this.phoneNumber);
	}
	
	
	
	
}
