import java.util.Scanner;
public class java009_6 {
	private Scanner keyboard;
	String empleado;
	int sueldo;
	java009_6() {
		keyboard = new Scanner(System.in);
		System.out.print("Ingrese nombre de empleado: ");
		empleado = keyboard.next();
		System.out.print("Ingrese sueldo: ");
		sueldo = keyboard.nextInt();
	}
	void imprimir() {
		System.out.println("Empleado " +empleado +" cobra: " +sueldo);
		if (sueldo>3000) {
			System.out.print("Paga impuestos");
		} else {
			System.out.print("No paga impuestos");
		}
	}
	public static void main(String[]ar) {
		java009_6 op=new java009_6();
		op.imprimir();
	}
}

//Confeccionar una clase que represente un empleado. Definir como atributos su nombre y su sueldo.
//En el constructor cargar los atributos y luego en otro método imprimir sus datos
//y por último uno que imprima un mensaje si debe pagar impuestos, si el sueldo supera a 3000