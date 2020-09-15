import java.util.Scanner;
public class java009_12 {
	Scanner keyboard=new Scanner(System.in);
	String oracion;
	
	java009_12() {
		System.out.print("Ingrese la oración: ");
		oracion = keyboard.nextLine();
	}
	
	void imprimir() {
		for (int f=0; f<oracion.length(); f++) {
			if (oracion.charAt(f)==' ') {
				System.out.println();
			} else {
				System.out.print(oracion.charAt(f));
			}
		}
		System.out.println();
		System.out.print(oracion.charAt(2) + " ");
		System.out.print(oracion.charAt(6));
	}
	
	public static void main(String[]ar) {
		java009_12 op=new java009_12();
		op.imprimir();
	}
}

//Codifique un programa que permita cargar una oración por teclado y luego mostrar cada
//palabra ingresada en una línea distinta.
//Por ejemplo si cargo: La mañana está fría, debe aparecer:
//La
//mañana
//está
//fría.