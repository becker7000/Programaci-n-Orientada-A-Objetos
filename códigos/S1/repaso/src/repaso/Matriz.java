package repaso;

public class Matriz {

	public static void main(String[] args) {
		
		int[][] matriz = new int[3][3];
		
		// Llenamos la matriz de números aleatorios.
		for(int i=0;i<matriz.length;i++) { // Filas
			for(int j=0;j<matriz[i].length;j++) { // Columnas
				// 10 al 50
				matriz[i][j] = (int)(Math.random()*41)+10; // 0*40=0 , 0.99*40=39.99
			}
		}
		
		
		// Imprimir la matriz.
		System.out.println("\n\t Matriz generada aleatoriamente:");
		for(int i=0;i<matriz.length;i++) { // Filas
			System.out.println("\n"); // Salto de línea.
			for(int j=0;j<matriz[i].length;j++) { // Columnas
				// Códigos de formato, printf (impresión con formato).
				System.out.printf("\t %d",matriz[i][j]); // %c(char), %d(entero), %.2f(flotante), %s(Strings)
			}	
		}
		
		
	}

}
