import java.util.Scanner;
public class java009_12 {
	Scanner keyboard=new Scanner(System.in);
	String oracion;
	
	java009_12() {
		System.out.print("Ingrese la oraci�n: ");
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

//Codifique un programa que permita cargar una oraci�n por teclado y luego mostrar cada
//palabra ingresada en una l�nea distinta.
//Por ejemplo si cargo: La ma�ana est� fr�a, debe aparecer:
//La
//ma�ana
//est�
//fr�a.