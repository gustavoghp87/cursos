package ExcepcionesPropias;

public class PilaVaciaException extends Exception {
	public PilaVaciaException(String mensaje) {
		 super("Problema: " + mensaje);
	}
}

// Confeccionar una clase que administre una lista tipo pila (se debe poder insertar, extraer e imprimir los datos de la pila).
// En el m�todo extraer lanzar una excepci�n si la pila se encuentra vac�a, crear una excepci�n propia que herede de Exception.