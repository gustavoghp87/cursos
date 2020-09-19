import java.util.Scanner;
public class java009_1 {
	private Scanner keyboard;
	int[][] matriz;
	void cargar() {
		keyboard = new Scanner(System.in);
		System.out.print("Ingrese cantidad de filas: ");
		int filas = keyboard.nextInt();
		matriz = new int[filas][];
		for (int f=0; f<matriz.length; f++) {
			System.out.print("Ingrese cantidad de columnas de la fila " + (f+1) + ": ");
			int columnas = keyboard.nextInt();
			matriz[f] = new int[columnas];
			for (int c=0; c<matriz[f].length;c++) {
				System.out.print("Cargue elemento fila " + (f+1) + " columna " + (c+1) + ": ");
				matriz[f][c] = keyboard.nextInt();
			}
		}
	}
	void imprimir() {
		System.out.println("Matriz:");
		for (int f=0; f<matriz.length; f++) {
			for (int c=0; c<matriz[f].length; c++) {
				System.out.print(matriz[f][c] + " ");
			}
			System.out.println();
		}
	}
	public static void main (String[]ar) {
		java009_1 jv=new java009_1();
		jv.cargar();
		jv.imprimir();
	}
}

//Confeccionaremos un programa que permita crear una matriz irregular y luego imprimir la
//matriz en forma completa.