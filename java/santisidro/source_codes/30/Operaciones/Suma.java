package Operaciones;

public class Suma extends Operacion {

	 public Suma(int valor1, int valor2) {
		 super(valor1, valor2);
	 }
	
	 public void operar() {
		 resultado = valor1 + valor2;
	 }
	 
	 public void imprimir() {
		 System.out.print("La suma de " +valor1 + " y " +valor2 + " es ");	 
		 super.imprimir();
	 }
		 
}
