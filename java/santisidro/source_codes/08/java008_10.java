import java.util.Scanner;
public class java008_10 {
	private Scanner keyboard;
	String[] paises;
	int[][] temperaturas;
	int[] promedios;
	void cargar() {
		keyboard = new Scanner(System.in);
		paises = new String[4];
		temperaturas = new int[4][12];
		promedios = new int[4];
		for (int f=0; f<paises.length; f++) {
			System.out.print("Ingrese nombre de país " + (f+1) + ": ");
			paises[f] = keyboard.next();
			int suma = 0;
			for (int mes=0; mes<temperaturas[f].length; mes++) {
				System.out.print("Ingrese temperatura del país " + (f+1) + " en el mes " + (mes+1) + ": ");
				temperaturas[f][mes] = keyboard.nextInt();
				suma = suma + temperaturas[f][mes];
			}
		promedios[f] = suma/12;
		}
	}
	void imprimir() {
		for (int f=0; f<paises.length; f++) {
			System.out.println(paises[f] + ": temperatura promedio " + promedios[f]);
		}
	}
	public static void main(String[]ar) {
		java008_10 jv=new java008_10();
		jv.cargar();
		jv.imprimir();
	}
}

//Se desea saber la temperatura media trimestral de cuatro paises. Para ello se tiene
//como dato las temperaturas medias mensuales de dichos paises.
//Se debe ingresar el nombre del país y seguidamente las doce temperaturas medias mensuales.
//Seleccionar las estructuras de datos adecuadas para el almacenamiento de los datos en memoria.
//a - Cargar por teclado los nombres de los paises y las temperaturas medias mensuales.
//b - Calcular la temperatura media trimestral de cada país.
//c - Imprimr los nombres de los paises y las temperaturas medias trimestrales.
//b - Imprimir el nombre de la provincia con la temperatura media trimestral mayor.