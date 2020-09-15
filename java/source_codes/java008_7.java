import java.util.Scanner;
public class java008_7 {
	private Scanner teclado;
	int[][] matriz;
	void cargar() {
		int filas;
		int columnas;
		teclado=new Scanner(System.in);
		System.out.print("Ingrese cantidad de filas: ");
		filas = teclado.nextInt();
		System.out.print("Ingrese cantidad de columnas: ");
		columnas = teclado.nextInt();
		if (filas<2) {
			System.out.print("Tiene que haber al menos 2 filas");
		} else {
			matriz = new int[filas][columnas];
			for (int f=0; f<matriz.length; f++) {
				for (int c=0; c<matriz[f].length; c++) {
					System.out.print("Ingrese fila " + (f+1) + ", columna " + (c+1) + ": ");
					matriz[f][c] = teclado.nextInt();
				}
			}
		}
	}
	void cambiar() {
		for(int c=0; c<matriz[0].length;c++) {
			int aux = matriz[0][c];
			matriz[0][c] = matriz[1][c];
			matriz[1][c] = aux;
			}
	}
	void imprimir() {
		for(int f=0;f<matriz.length;f++) {
			for(int c=0;c<matriz[f].length;c++) {
				System.out.print(matriz[f][c]+" ");
			}
			System.out.println();
		}
	}
	public static void main (String[] ar) {
		java008_7 jv=new java008_7();
		jv.cargar();
		jv.cambiar();
		jv.imprimir();
	}
}

//Crear una matriz de n * m filas (cargar n y m por teclado) Intercambiar la primer fila con la
//segunda. Imprimir luego la matriz.