package java006;
import java.util.Scanner;

public class java006_4 {

	Scanner teclado;
	float[] elementos;

	void cargar() {
		teclado = new Scanner(System.in);
		System.out.print("Ingrese valor: ")
		elementos = new float[8];
		elementos[f] = teclado.nextFloat();	
	}
	
	public static void main(String[]ar) {
		java006_4 jv4=new java006_4;
		jv4.cargar();
	}
}

//Desarrollar un programa que permita ingresar un vector de 8 elementos, e informe:
//El valor acumulado de todos los elementos del vector.
//El valor acumulado de los elementos del vector que sean mayores a 36.
//Cantidad de valores mayores a 50.