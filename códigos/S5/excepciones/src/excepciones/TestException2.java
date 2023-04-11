package excepciones;

public class TestException2 {

	public static void main(String[] args) {
		
	    int x=10, y=0;
		double division;
		
		try {
			// Código que se intentará ejecutar...
			division=x/y;
			System.out.printf("\n\t La divisón es: %.3f",division);
		}catch(ArithmeticException exception) {
			System.out.print("\n\t Error, no puedes dividir por cero.");
			System.out.print("\n\t Error: "+exception.getMessage());
		}
		
		System.out.println("\n\t Excepción controlada...");
		
		
	}

}
