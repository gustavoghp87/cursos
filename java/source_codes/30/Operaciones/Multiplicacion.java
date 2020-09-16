package Operaciones;

public class Multiplicacion extends Operacion {
	 
	public Multiplicacion(int valor1, int valor2) {
		super(valor1, valor2);
	}
	 
	public void operar() {
		resultado = valor1 * valor2;
	}
	 
	public void imprimir() {
		 System.out.print("El producto de " + valor1 + " y " + valor2 + " es ");
		 super.imprimir();
	}
}
