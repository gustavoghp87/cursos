import java.util.Scanner;
public class java006_8 {
	Scanner teclado;
	float[] elementos;
	float suma;
	void cargar() {
		teclado = new Scanner(System.in);
		elementos = new float[8];
		for (int f=0; f<8; f++) {
		System.out.print("Ingrese valor: ");
		elementos[f] = teclado.nextFloat();
		}
	}
	
	void sumar() {
		float suma = 0;
		for (int f=0; f<8; f++) {
			suma = suma + elementos[f];
		}
		System.out.println(suma);
	}
	
	void sumar2() {
		float suma2 = 0;
		for (int f=0; f<8; f++) {
			if (elementos[f] > 36) {
			suma2 = suma2 + elementos[f];
			}}
		System.out.println(suma2);
	}
	
	void mayores() {
		int suma3 = 0;
		int f;
		for (f=0; f<8; f++) {
			if (elementos[f]>50) {
				suma3++;
			}
		}
		System.out.println("Mayores a 50: " + suma3);
	}
	
	
	
	public static void main(String[]ar) {
		java006_8 jv4=new java006_8();
		jv4.cargar();
		jv4.sumar();
		jv4.sumar2();
		jv4.mayores();
	}

}



//Desarrollar un programa que permita ingresar un vector de 8 elementos, e informe:
//El valor acumulado de todos los elementos del vector.
//El valor acumulado de los elementos del vector que sean mayores a 36.
//Cantidad de valores mayores a 50.