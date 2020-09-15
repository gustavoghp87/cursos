public class java010_05_Empleado extends java010_05_Persona {
	protected int sueldo;
	
	public void cargar2() {
		System.out.print("Cargue el sueldo de " +nombre + ": ");
		sueldo = keyboard.nextInt();
	}
	
	void imprimir2() {
		System.out.println("Persona: " +nombre +", sueldo: " +sueldo);
	}
	
}