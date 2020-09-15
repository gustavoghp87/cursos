import java.util.Scanner;
public class java006_7 {
	Scanner teclado;
	String[] nombres;
	int[] edades;
	void cargar() {
		teclado=new Scanner(System.in);
		nombres = new String[5];
		edades = new int[5];
		for (int f=0; f<nombres.length; f++) {
			System.out.print("Ingrese nombre: ");
			nombres[f] = teclado.next();
			System.out.print("Ingrese edad: ");
			edades[f] = teclado.nextInt();
		}
	}
	void imprimir() {
		System.out.print("Personas mayores de edad: ");
		for (int f=0; f<nombres.length; f++) {
			if (edades[f]>17) {
				System.out.print(nombres[f] + " ");
			}
		}
	}
	public static void main(String[]ar) {
		java006_7 jv7=new java006_7();
		jv7.cargar();
		jv7.imprimir();
	}
}

//Desarrollar un programa que permita cargar 5 nombres de personas y sus edades respectivas.
//Luego de realizar la carga por teclado de todos los datos imprimir los nombres de las personas
//mayores de edad (mayores o iguales a 18 años)