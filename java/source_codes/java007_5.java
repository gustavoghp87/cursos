import java.util.Scanner;
public class java007_5 {
	private Scanner teclado;
	String[] paises;
	int[] habitantes;
	void cargar() {
		teclado=new Scanner(System.in);
		paises = new String[5];
		habitantes = new int[5];
		for (int f=0; f<paises.length; f++) {
			System.out.print("Cargue país: ");
			paises[f] = teclado.next();
			System.out.print("Ingrese habitantes: ");
			habitantes[f] = teclado.nextInt();
		}
	}
	void ordenar() {
		for (int k=0; k<paises.length-1; k++) {
			for (int f=0; f<paises.length-1-k; f++) {
				if (paises[f].compareTo(paises[f+1])>0) {
					String aux1 = paises[f];
					paises[f] = paises[f+1];
					paises[f+1] = aux1;
					int aux2 = habitantes[f];
					habitantes[f] = habitantes[f+1];
					habitantes[f+1] = aux2;
				}
			}
		}
	}
	void imprimir() {
		for (int f=0; f<paises.length; f++) {
			System.out.print(" " + paises[f] + " ");
			System.out.println(" " + habitantes[f]);
		}
	}
	void ordenar2() {
		for (int k=0; k<paises.length-1; k++) {
			for (int f=0; f<paises.length-1-k; f++) {
				if (habitantes[f] < habitantes[f+1]) {
					String aux1 = paises[f];
					paises[f] = paises[f+1];
					paises[f+1] = aux1;
					int aux2 = habitantes[f];
					habitantes[f] = habitantes[f+1];
					habitantes[f+1] = aux2;
				}
			}
		}
	}
	void imprimir2() {
		for (int f=0; f<paises.length; f++) {
			System.out.print(" " + paises[f] + " ");
			System.out.println(" " + habitantes[f]);
		}
	}
	public static void main(String[]ar) {
		java007_5 jv=new java007_5();
		jv.cargar();
		jv.ordenar();
		jv.imprimir();
		jv.ordenar2();
		jv.imprimir2();
	}
}

//Cargar en un vector los nombres de 5 paises y en otro vector paralelo la cantidad de
//habitantes del mismo. Ordenar alfabéticamente e imprimir los resultados. Por último
//ordenar con respecto a la cantidad de habitantes (de mayor a menor) e imprimir
//nuevamente.