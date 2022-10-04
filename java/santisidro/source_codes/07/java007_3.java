import java.util.Scanner;
public class java007_3 {
	private Scanner teclado;
	String[] paises;
	void cargar() {
		teclado=new Scanner(System.in);
		paises=new String[5];
		for (int f=0; f<paises.length; f++) {
			System.out.print("Ingrese país: ");
			paises[f] = teclado.next();
		}
	}
	void ordenar() {
		for (int k=0; k<paises.length-1; k++) {
			for (int f=0; f<paises.length-1-k; f++) {
				if (paises[f].compareTo(paises[f+1]) > 0) {
					String aux;
					aux = paises[f];
					paises[f] = paises[f+1];
					paises[f+1] = aux;
				}
			}
		}	
	}
	void imprimir() {
		System.out.print("Países ordenados alfab.: ");
		for (int f=0; f<paises.length; f++) {
			System.out.print(paises[f] + " ");
		}
	}
	public static void main(String[]ar) {
		java007_3 jv=new java007_3();
		jv.cargar();
		jv.ordenar();
		jv.imprimir();
	}
}

//Definir un vector donde almacenar los nombres de 5 paises. Confeccionar el algoritmo de
//ordenamiento alfabético.