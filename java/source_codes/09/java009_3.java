import java.util.Scanner;
public class java009_3 {
	Scanner keyboard;
	String[] empleados;
	int[][] faltados;
	void cargar() {
		keyboard = new Scanner(System.in);
		empleados = new String[3];
		faltados = new int[3][];
		for (int f=0; f<empleados.length; f++) {
			System.out.print("Ingrese cantidad de d�as faltados por empleado " + (f+1) + ": ");
			int cantidad = keyboard.nextInt();
			faltados[f] = new int[cantidad];

			for (int c=0; c<faltados[f].length; c++) {
				System.out.print("Cargue los d�as  faltados por el empleado " + (f+1) + ": ");
				faltados[f][c] = keyboard.nextInt();
			}
		}
	}
	void imprimir() {
		System.out.println();
		for (int f=0; f<faltados.length; f++) {
			System.out.println("Cantidad de d�as faltados por el empleado " + (f+1) + ": " + faltados[f].length);
		}
		if (faltados[0].length<=faltados[1].length && faltados[0].length<=faltados[2].length) {
			System.out.print("El empleado 1 fue el que menos falt�");
		} else {
			if (faltados[1].length<faltados[0].length && faltados[1].length<faltados[2].length) {
				System.out.print("El empleado 2 fue el que menos falt�");
			} else {
				System.out.print("El empleado 3 fue el que menos falt�");
			}
		}
	}
	public static void main(String[]ar) {
		java009_3 jv=new java009_3();
		jv.cargar();
		jv.imprimir();
	}
}

//Confeccionar una clase para administrar los d�as que han faltado los 3 empleados de una empresa.
//Definir un vector de 3 elementos de tipo String para cargar los nombres y una matriz
//irregular para cargar los d�as que han faltado cada empleado (cargar el n�mero de d�a que falt�)
//Cada columna de la matriz representan los d�as de cada empleado.
//Mostrar los empleados con la cantidad de inasistencias.
//Cu�l empleado falt� menos d�as.