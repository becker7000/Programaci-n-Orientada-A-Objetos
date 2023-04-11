package mydeskapp;

public class ReciboCFE {

	private double consumo;
	
	private final double tarifa1=1.2;
	private final double tarifa2=1.5;
	private final double tarifa3=1.8;
	
	// Constructor
	public ReciboCFE(double consumo) {
		this.consumo=consumo;
	}
	
	// Método que genera un reporte del consumo electrico.
	public String generarReporte() {
		
		// Variable auxiliar.
		double tarifa=0.0;
		
		// Asignamo tarifa de acuerdo al cosumo en kWh
		if(consumo<850) {
			tarifa=tarifa1;
		}else if(consumo<1500) {
			tarifa=tarifa2;
		}else {
			tarifa=tarifa3;
		}
		
		double monto= consumo*tarifa;
		
		// Generamos un reporte con un constructor de cadenas:
		StringBuilder reporte = new StringBuilder();
		
		reporte.append("\n\t +------ Reporte ---------+");
		reporte.append(String.format("\n\t | Consumo: %.2f kWh",consumo));
		reporte.append(String.format("\n\t | Tarifa: $%.2f por kWh",tarifa));
		reporte.append(String.format("\n\t | Monto: $%.2f",monto));
		reporte.append("\n\t +------------------------+");
		
		// Transformamos a cadena el StringBuilder para retornarlo.
		return reporte.toString();
		
	}
	
	
	
	
	
}
