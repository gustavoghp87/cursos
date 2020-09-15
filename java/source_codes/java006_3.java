package java006;
import java.util.Scanner;
public class java006_3 {
	
	void cargar() {
		Scanner teclado;
		teclado=new Scanner(System.in);
		float[] turno1;
		float[] turno2;
		turno1 = new float[4];
		float suma1;
		suma1=0;
		for (int f=0; f<4; f++) {
		System.out.println("Ingresar salario turno 1, dato " + f + " : ");
		turno1[f] = teclado.nextFloat();
		suma1=suma1+turno1[f];
		}
		
		turno2 = new float[4];
		float suma2;
		suma2=0;
		for (int f=0; f<4; f++) {
		System.out.println("Ingresar salario turno 2, dato " + f + " : ");
		turno2[f] = teclado.nextFloat();
		suma2=suma2+turno2[f];
		}
		System.out.println("Salarios turno mañana suman: " + suma1);
		System.out.println("Salarios turno tarde suman: " + suma2);
	}
	public static void main(String[]ar) {
		java006_3 jv3=new java006_3();
		jv3.cargar();
	}
}


//Una empresa tiene dos turnos (mañana y tarde) en los que trabajan 8 empleados (4 por la
//mañana y 4 por la tarde)
//Confeccionar un programa que permita almacenar los sueldos de los empleados agrupados por
//turno.
//Imprimir los gastos en sueldos de cada turno.