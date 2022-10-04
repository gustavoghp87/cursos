import java.util.Scanner;
public class java009_2 {
	Scanner keyboard;
	int[][] matriz;		
	void cargar() {
		keyboard=new Scanner(System.in);
		matriz = new int[5][];
		matriz[0] = new int[1];
		matriz[1] = new int[2];
		matriz[2] = new int[3];
		matriz[3] = new int[4];
		matriz[4] = new int[5];
		for (int f=0; f< matriz.length; f++) {
			for (int c=0; c<matriz[f].length; c++) {
				System.out.print("Agregar valor fila " + (f+1) + " columna " + (c+1) +": ");
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
	public static void main(String[]ar) {
		java009_2 jv=new java009_2();
		jv.cargar();
		jv.imprimir();
	}
}

//Confeccionar una clase para administrar una matriz irregular de 5 filas y 1 columna la
//primer fila, 2 columnas la segunda fila y así sucesivamente hasta 5 columnas la última
//fila (crearla sin la intervención del operador)
//Realizar la carga por teclado e imprimir posteriormente