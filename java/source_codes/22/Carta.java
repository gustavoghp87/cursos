package CartaMazo;

public class Carta {
	private int numero;
	private String palo;
	
	Carta(int numero, String palo) {
		this.numero = numero;
		this.palo = palo;
	}
	
	public void imprimir() {
		System.out.println(numero + " - " + palo);
	}

}

// Crear un proyecto y dentro del mismo crear dos clases. La primer clase se debe llamar 'Carta' y
//  definir los atributos palo y numero. Por otro lado declarar una clase llamada 'Mazo' que
//  contenga un arreglo de 6 elementos de tipo 'Carta'.
//  Imprimir todas las cartas. Imprimir una carta al azar entre las 6 cartas