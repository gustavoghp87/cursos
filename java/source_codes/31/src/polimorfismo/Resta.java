package polimorfismo;

public class Resta extends Operacion {

	public Resta(int valor1, int valor2) {
		 super(valor1, valor2);
	}
	
	public void operar() {
		 resultado = valor1 - valor2;
	}

}

// Las dos subclases de la clase 'Operacion' cumplen con el contrato de implementar el método 'operar', en
//  caso de no hacerlo se genera un error sintáctico.
