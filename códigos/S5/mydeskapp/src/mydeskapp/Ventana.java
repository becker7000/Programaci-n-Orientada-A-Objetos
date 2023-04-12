package mydeskapp;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class Ventana extends JFrame {

	private String titulo; // Título de la ventana.
	private JPanel panel; // Panel (Cubierta de la ventana)
	private JTextField entrada;
	private JTextArea reporte;
    private double consumo;
	
	
	public Ventana(String titulo,int ancho,int altura) {
		
		this.titulo=titulo;
		
		// Ajustamos el título de la ventana.
		this.setTitle(titulo);
		
		// Configuramos la visibilidad.
		this.setVisible(true); // Para que sí se vea.

		// Ajustamos el tamaño de la ventana.
		this.setSize(ancho, altura); // Será en píxeles.
		
		// Creando una dimensión para ajustar un tamaño mínimo.
		Dimension dimensionMin = new Dimension(400,400);
		
		// Le damos la dimensión al tamaño mínimo.
		this.setMinimumSize(dimensionMin);
		
		// Ajustamos la ventana en el centro sin importar el tamaño de la pantalla.
		this.setLocationRelativeTo(null);
		
		// Todos los componentes iniciamos a través de un método.
		iniciarComponentes();
		
		// Operación que se va a ejecutar por defecto al cerrar la ventana.
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		
	}

	private void iniciarComponentes() {
		
		colocarPanel();
		colocarEtiqueta();
		colocarEntradas();
		colocarBoton();
		
	}
	
	public void colocarPanel(){
		
		panel = new JPanel(); // Se crea un panel
		
		// Desactivamos el seguro que nos impide modificar el diseño.
		panel.setLayout(null);
		
		// Usamos la clase Color para crear un color y lo contruimos con el código RGB.
		panel.setBackground(new Color(129, 202, 222));
		
		// Agregamos el JPanel (panel) al JFrame (Ventana)
		this.getContentPane().add(panel);
		
	}
	
	public void colocarEtiqueta() {
		
		// Creamos una etiquetas JLabel (sirven para agregar textos).
		JLabel etiqueta = new JLabel();
		
		// Quitamos los seguros que nos impiden modificar el diseño.
		etiqueta.setOpaque(true);
		
		// Ajustamos el texto de la etiqueta.
		etiqueta.setText("Cotiza el monto a pagar de tu consumo de electricidad.");
		
		// Ajustomos el texto en el centro de la etiqueta.
		etiqueta.setHorizontalAlignment(SwingConstants.CENTER);
		
		// Ajustamos el tamaño.
		etiqueta.setSize(350,20);
		
		// Creamos una fuente.
		Font fuente = new Font("Arial",Font.BOLD,12);
		
		// Agregamos la fuente a la etiqueta.
		etiqueta.setFont(fuente);
		
		// Quitamos el fondo.
		etiqueta.setBackground(null);
		
		// Ajustamos la posición de la etiqueta.
		etiqueta.setLocation(50,20); // (x,y)
		
		// Agregamos la etiqueta al panel.
		panel.add(etiqueta);
		
	}
	
	public void colocarEntradas() {
		
		// Inicializamos la entrada.
		entrada = new JTextField();
		
		// Método que sustituye a los métodos setSize y setLocation
		entrada.setBounds(50,60,200,40);
		
		// Agregamos la caja de texto al panel.
		panel.add(entrada);
		
	}
	
	public void colocarBoton() {
		
		// Creamos un botón.
		JButton boton = new JButton("Calcular");
		
		// Ajustamos tamaños y posición.
		boton.setBounds(50,120,200,40);

		// Color del texto.
		boton.setForeground(Color.BLUE);
		
		// Agregamos el botón al panel.
		panel.add(boton);
		
		// Inicializamos el área texto
		reporte = new JTextArea();
		
		// Ajustamos posición y tamaño.
		reporte.setBounds(50,180,350,120);
		
		// Color del texto del área de texto.
		reporte.setForeground(Color.DARK_GRAY);

		// En caso de quere deshabilitar la edición de texto.
		//reporte.setEditable(false);
		
		// Agregamos el área de texto al panel.
		panel.add(reporte);
		
		// AGREGAMOS LA LÓGICA DE FUNCIONAMIENTO AL BOTÓN.
		// EL COMPORTAMIENTO DEL BOTÓN ESTARÁ DADO POR UN EVENTO (click)
		
		ActionListener click = new ActionListener() {
			
			// Dentro de este método va el comportamiento de la aplicación.
			@Override
			public void actionPerformed(ActionEvent e) {
				
				// TODO: agregar un compotamiento en caso de error.
				// Por ejemplo: que el usuario escriba el cosumo en palabras.
				// Hint: usar try-catch, usar JOptionPane.
				
				// Obtenemos el consumo del JTextField (entrada).
				consumo = Double.parseDouble(entrada.getText()); 
				
				// Creamos un objeto de la clase ReciboCFE.
				ReciboCFE recibo = new ReciboCFE(consumo);
				
				// Colocamos el reporte del consumo en el área de texto.
				reporte.setText(recibo.generarReporte());
				
			}
			
		}; // Nota: al momento de reescribir un método debemos agregar ; al final.
		
		// El comportamiento se le agrega al botón 
		boton.addActionListener(click);
		
		
	}
	
	
	
	
	
}
