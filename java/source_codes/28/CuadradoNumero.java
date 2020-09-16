import java.util.Scanner;
import java.util.InputMismatchException;

public class CuadradoNumero {
	 public static void main(String[] ar) {
		 Scanner teclado = new Scanner(System.in);
		 int num;
		 boolean continua;

		 do {
			 try {
				 continua = false;
				 System.out.print("Ingrese un valor entero: ");
				 num = teclado.nextInt();
				 int cuadrado = num * num;
				 System.out.println("El cuadrado de " + num + " es " + cuadrado);
			 } catch (InputMismatchException ex) {
				 System.out.println("Debe ingresar obligatoriamente un n�mero entero.");
				 teclado.next();
				 continua = true;
			 }
		 } while (continua);
		 
	 }
}