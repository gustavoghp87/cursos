import java.util.Scanner;
public class java008_6 {
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
	public void imprimirMayor() {
		int mayor = matriz[0][0];
		int filamay = 0;
		int columnamay = 0;
		for(int f=0;f<matriz.length;f++) {
			for(int c=0;c<matriz[f].length;c++) {
				if (matriz[f][c]>mayor) {
					mayor = matriz[f][c];
					filamay = f;
					columnamay = c;
				}
			}
		}
		System.out.println("El elemento mayor es: " + mayor);
		System.out.println("Se encuentra en la fila " + (filamay+1) + " y en la columna "+ (columnamay+1));
	}
	public static void main(String[]ar) {
		java008_6 jv=new java008_6();
		jv.cargar();
		jv.imprimirMayor();
	}
}

//Crear una matriz de n * m filas (cargar n y m por teclado) Imprimir el mayor elemento y la fila y columna
//donde se almacena.