import java.util.Scanner;
public class java008_4 {
	private Scanner teclado;
	int[][] matriz;
	void cargar() {
		teclado=new Scanner(System.in);
		matriz = new int[2][5];
		for (int c=0; c<5; c++) {
			for (int f=0; f<2; f++) {
				System.out.print("Ingrese fila " + (f+1) + ", columna " + (c+1) + ": ");
				matriz[f][c] = teclado.nextInt();
			}
		}
	}
	void imprimir() {
		for (int f=0; f<2; f++) {
			for (int c=0; c<5; c++) {
				System.out.print(matriz[f][c] + " ");
			}
			System.out.println();
		}
	}
	public static void main(String[]ar) {
		java008_4 jv=new java008_4();
		jv.cargar();
		jv.imprimir();
	}
}

//Crear una matriz de 2 filas y 5 columnas. Realizar la carga de componentes por columna
//(es decir primero ingresar toda la primer columna, luego la segunda columna y así sucesivamente)
//Imprimir luego la matriz.