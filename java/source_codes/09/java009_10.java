import java.util.Scanner;
public class java009_10 {
	Scanner keyboard;
	String clave;
	java009_10() {
		keyboard = new Scanner(System.in);
		System.out.print("Ingrese la clave: ");
		clave = keyboard.nextLine();
	}
	void comparar() {
		if (clave.equals("123abc")==true) {
			System.out.print(clave +" es exactamente la correcta");
			} else {
				System.out.print(clave + " es incorrecta");
		}
	}
	public static void main(String[]ar) {
		java009_10 op=new java009_10();
		op.comparar();
	}
}

//Desarrollar un programa que solicite la carga de una clave. La clase debe tener dos métodos
//uno para la carga y otro que muestre si la clave es la correcta (la clave a comparar es "123abc")