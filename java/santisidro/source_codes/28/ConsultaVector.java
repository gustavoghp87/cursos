import java.util.InputMismatchException;
import java.util.Scanner;

public class ConsultaVector {
	 public static void main(String[] ar) {
		 int[] vec = { 20, 45, 76, 81, 34, 567, 423, 6, 3, 5 };
		 Scanner teclado = new Scanner(System.in);
		 int indice;
		 
		 try {
			 System.out.print("Ingrese un valor entre 1 y 10: ");
			 indice = teclado.nextInt() - 1;
			 System.out.print("En el vector se almacena en la posici�n " + indice + " el valor " + vec[indice]);
		 
		 } catch (InputMismatchException ex) {
			 System.out.println("Debe ingresar obligatoriamente n�mero entero");
		 
		 } catch (IndexOutOfBoundsException ex) {
			 System.out.println("El valor debe estar entre 1 y 10");
		 }
	 }
}