import java.util.Scanner;
public class java008_2 {
	private Scanner teclado;
	int[][] matriz;
	void cargar() {
		teclado=new Scanner(System.in);
		matriz = new int[4][4];
		for (int fila=0; fila<4; fila++) {
			for (int columna=0; columna<4; columna++) {
				System.out.print("Cargue fila " + (fila+1) + ", columna " + (columna+1) + ": ");
				matriz[fila][columna] = teclado.nextInt();
			}
		}
	}
	void imprimir() {
		for (int fila=0; fila<4; fila++) {
			System.out.print(matriz[fila][fila] + " ");
		System.out.println();
		}
	}
	public static void main(String[]ar) {
		java008_2 jv=new java008_2();
		jv.cargar();
		jv.imprimir();
	}
}

//Crear y cargar una matriz de 4 filas por 4 columnas. Imprimir la diagonal principal.