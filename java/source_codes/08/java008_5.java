import java.util.Scanner;
public class java008_5 {
	private Scanner teclado;
	int[][] matriz;
	void cargar() {
		teclado=new Scanner(System.in);
		int filas;
		int columnas;
		System.out.print("Ingrese cantidad de filas: ");
		filas=teclado.nextInt();
		System.out.print("Ingrese cantidad de columnas: ");
		columnas=teclado.nextInt();
		matriz = new int[filas][columnas];
		for (int f=0; f<matriz.length; f++) {
			for (int c=0; c<matriz[f].length; c++) {
				System.out.print("Ingrese fila " + (f+1) + ", columna " + (c+1) + ": ");
				matriz[f][c] = teclado.nextInt();
			}
		}
	}
	void imprimir1() {
		for(int f=0;f<matriz.length;f++) {
			for(int c=0;c<matriz[f].length;c++) {
				System.out.print(matriz[f][c]+" ");
			}
			System.out.println();
		}
	}
	void imprimir2() {
		System.out.println("Última fila: ");
		for (int c=0; c<matriz[matriz.length-1].length; c++) {
			System.out.print(matriz[matriz.length-1][c] + " ");
		}
		System.out.println();
		System.out.print(matriz.length);
	}
	public static void main(String[]ar) {
		java008_5 jv=new java008_5();
		jv.cargar();
		jv.imprimir1();
		jv.imprimir2();
	}
}

//Crear una matriz de n * m filas (cargar n y m por teclado) Imprimir la matriz completa y la última fila.