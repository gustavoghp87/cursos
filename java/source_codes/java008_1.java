import java.util.Scanner;
public class java008_1 {
	private Scanner teclado;
	private int[][] mat;
	public void cargar() {
		teclado=new Scanner(System.in);
		mat=new int[3][5];
		for(int f=0;f<3;f++) {
			for(int c=0;c<5;c++) {
				System.out.print("Ingrese componente " +  (c+1) + " de la fila " + (f+1) + " : ");
				mat[f][c]=teclado.nextInt();
			}
		}
	}
	public void imprimir() {
		for(int f=0;f<3;f++) {
			for(int c=0;c<5;c++) {
				System.out.print(mat[f][c]+" ");
			}
			System.out.println();
		}
	}
	public static void main(String[] ar) {
		java008_1 ma=new java008_1();
		ma.cargar();
		ma.imprimir();
	}
}

//Crear una matriz de 3 filas por 5 columnas con elementos de tipo int, cargar sus componentes
//y luego imprimirlas.