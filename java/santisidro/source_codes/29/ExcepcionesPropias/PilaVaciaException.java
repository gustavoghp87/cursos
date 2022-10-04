package ExcepcionesPropias;

public class PilaVaciaException extends Exception {
	public PilaVaciaException(String mensaje) {
		 super("Problema: " + mensaje);
	}
}

// Confeccionar una clase que administre una lista tipo pila (se debe poder insertar, extraer e imprimir los datos de la pila).
// En el método extraer lanzar una excepción si la pila se encuentra vacía, crear una excepción propia que herede de Exception.