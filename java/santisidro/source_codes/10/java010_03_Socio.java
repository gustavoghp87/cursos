import java.util.Scanner;
public class java010_03_Socio {
	private String nombre;
	private int antiguedad;

	public java010_03_Socio (Scanner keyboard) {
		System.out.print("Nombre de socio: ");
		nombre = keyboard.next();
		System.out.print("Antigüedad: ");
		antiguedad = keyboard.nextInt();
	}
	
	public void imprimir() {
		System.out.print("El socio " +nombre +" tiene " +antiguedad +" años de antigüedad");
	}
	
	public int retornarAntiguedad() {
		return antiguedad;
	}
}