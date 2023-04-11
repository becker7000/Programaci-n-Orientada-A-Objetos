package excepciones;

public class TestException1 {

	public static void main(String[] args) {
		
		String sueldo_str = "2500dolares";
		double sueldo_dou; // Vamos a intentar transformar la cadena a double.
		
		try {
			// Se va a intentar ejecutar....
			sueldo_dou=Double.parseDouble(sueldo_str);
			System.out.printf("\n\t El sueldo es: $%.2f ",sueldo_dou);	
		}catch(NumberFormatException exception) {
			// Esto se va a ejecutar en lugar de lo arriba...
			System.out.print("\n\t Error al transformar la cadena a número.");
			System.out.print("\n\t Error: "+exception.getMessage());
		}
		
		System.out.print("\n\t La aplicación continúa en ejecución aquí!");
	}

}
