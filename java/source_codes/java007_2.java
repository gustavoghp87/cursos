import java.util.Scanner;
public class java007_2 {
	private Scanner teclado;
	int[] sueldos;
	void cargar() {
		teclado=new Scanner(System.in);
		sueldos = new int[5];
		for (int f=0; f<sueldos.length; f++) {
			System.out.print("Cargar sueldo: ");
			sueldos[f] = teclado.nextInt();
		}
	}
	void ordenar() {
		for(int k=0; k<4; k++) {
			for(int f=0; f<4-k; f++) {
				if (sueldos[f]>sueldos[f+1]) {
					int aux;
					aux=sueldos[f];
					sueldos[f]=sueldos[f+1];
					sueldos[f+1]=aux;
				}
			}
		}
	}
	void imprimir() {
		System.out.print("Sueldos ordenados de menor a mayor: [ ");
		for (int f=0; f<sueldos.length; f++) {
			System.out.print(sueldos[f] + " ");
		}
		System.out.print("]");
	}
	public static void main(String[]ar) {
		java007_2 jv7=new java007_2();
		jv7.cargar();
		jv7.ordenar();
		jv7.imprimir();
	}
}

//Se debe crear un vector donde almacenar 5 sueldos. Ordenar el vector sueldos de menor a mayor.