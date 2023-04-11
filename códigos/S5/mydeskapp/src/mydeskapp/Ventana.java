package mydeskapp;

import javax.swing.JFrame;

public class Ventana extends JFrame {

	// Título de la ventana.
	private String titulo;
	
	public Ventana(String titulo,int ancho,int altura) {
		
		this.titulo=titulo;
		
		// Ajustamos el título de la ventana.
		this.setTitle(titulo);
		
		// Configuramos la visibilidad.
		this.setVisible(true); // Para que sí se vea.

		// Ajustamos el tamaño de la ventana.
		this.setSize(ancho, altura); // Será en píxeles.
		
		// Ajustamos la ventana en el centro sin importar el tamaño de la pantalla.
		this.setLocationRelativeTo(null);
		
		// Operación que se va a ejecutar por defecto al cerrar la ventana.
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		
	}
	
	
}
