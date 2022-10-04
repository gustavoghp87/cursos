import java.util.Scanner;
public class java008_3 {
	private Scanner teclado;
	int[][] matriz;
	void cargar() {
		teclado=new Scanner(System.in);
		matriz = new int[3][4];
		for (int f=0; f<3; f++) {
			for (int c=0; c<4; c++) {
				System.out.print("Cargar fila " + (f+1) + ", columna " + (c+1) + ": ");
				matriz[f][c] = teclado.nextInt();
			}
		}
	}
	void imprimir1() {
		for (int c=0; c<4; c++) {
			System.out.print(matriz[0][c] + " ");
		}
		System.out.println();
	}
	void imprimir2() {
		for (int c=0; c<4; c++) {
			System.out.print(matriz[2][c] + " ");
		}
		System.out.println();
	}
	void imprimir3() {
		for (int f=0; f<3; f++) {
			System.out.print(matriz[f][3] + " ");
		}
		System.out.println();
	}
	public static void main(String[]ar) {
		java008_3 jv=new java008_3();
		jv.cargar();
		jv.imprimir1();
		jv.imprimir2();
		jv.imprimir3();
	}
}

//Crear y cargar una matriz de 3 filas por 4 columnas. Imprimir la primer fila. Imprimir la última fila
// e imprimir la primer columna.