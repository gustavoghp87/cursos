public class java010_04_Suma extends Operacion {
	protected int resultado1;
	void imprimir() {
		System.out.println("Valor 1: " +valor1 +" - Valor 2: " +valor2);
	}
	
	void operar1() {
		resultado1 = valor1 + valor2;
	}
	
	public void mostrarResultado1() {
		System.out.println(resultado1);
	}
	
}