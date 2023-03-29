package primerasclases;

public class PruebaPlaneta {

	public static void main(String[] args) {
	
		// Objetos(Instancias) de la clase Planeta 
		Planeta planeta1 = new Planeta("Mercurio",1,"Café claro");
		Planeta planeta2 = new Planeta("Venus",2,"Anaranjado");
		Planeta planeta3 = new Planeta("Tierra",3,"Azul");
		Planeta planeta4 = new Planeta("Marte",4,"Rojo");
		
		// Usando un método de la clase Planeta.
		// Se aplica a cada uno de los objetos.
		planeta1.mostrarPlaneta();
		planeta2.mostrarPlaneta();
		planeta3.mostrarPlaneta();
		planeta4.mostrarPlaneta();
		
	
	}

}
