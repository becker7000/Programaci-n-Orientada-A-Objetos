package geometria;

public class Circulo {

	// Atributo:
	private double radio;
	
	// Constructor:
	public Circulo(double radio) {
		this.radio=radio;
	}
	
	// Método personalizado:
	public double calcularArea() {
		double area;
		area=Math.PI*Math.pow(radio,2);
		return area;
	}
	
	// TODO: calcular perimetro.
	
    // TODO: mostrar circulo.
	
}
