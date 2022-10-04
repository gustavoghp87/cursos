import java.util.Scanner;
public class java008_8 {
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
		matriz = new int[filas][columnas];
		for (int f=0; f<matriz.length; f++) {
			for (int c=0; c<matriz[f].length; c++) {
				System.out.print("Ingrese fila " + (f+1) + ", columna " + (c+1) + ": ");
				matriz[f][c] = teclado.nextInt();
			}
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
	void imprimir2() {
		System.out.println("Impresión de vértices: ");
		System.out.print(matriz[0][0] + " ");
		System.out.print(matriz[0][matriz[0].length-1] + " ");
		System.out.println();
		System.out.print(matriz[matriz.length-1][0] + " ");
		System.out.print(matriz[matriz.length-1][matriz[matriz.length-1].length-1]);
	}
	public static void main (String[] ar) {
		java008_8 jv=new java008_8();
		jv.cargar();
		jv.imprimir();
		jv.imprimir2();
	}
}

//Crear una matriz de n * m filas (cargar n y m por teclado) Imprimir los cuatro valores que se
//encuentran en los vértices de la misma (mat[0][0] etc.)