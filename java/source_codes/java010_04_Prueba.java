public class java010_04_Prueba {
	public static void main(String[] ar) {
		
		java010_04_Multipl mult = new java010_04_Multipl();
		mult.cargar1();
		mult.cargar2();
		mult.imprimir();
		mult.operar1();
		System.out.print("El resultado de la suma es: ");
		mult.mostrarResultado1();
		mult.operar2();
		System.out.print("El resultado de la resta es: ");
		mult.mostrarResultado2();
		mult.operar3();
		System.out.print("El resultado de la multiplicación es: ");
		mult.mostrarResultado3();
		
	}
}