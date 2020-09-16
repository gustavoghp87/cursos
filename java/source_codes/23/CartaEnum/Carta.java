package CartaEnum;

public class Carta {
	
	public enum Palo {
		 TREBOL, DIAMANTE, CORAZON, PICA
	};
	
	private int numero;
	private Palo palo;
	
	Carta(int numero, Palo palo) {
		 this.numero = numero;
		 this.palo = palo;
	}
	
	public void imprimir() {
		 System.out.println(numero + " - " + palo.toString().toLowerCase());
	}
	
	public Palo retornarPalo() {
		 return palo;
	}
}

// Crear un proyecto y dentro del mismo crear dos clases. La primer clase se debe llamar 'Carta',
//  declarar un enum que represente los cuatro palos del mazo y dos atributos uno del tipo de dato
//  enum y el número de carta. Por otro lado declarar una clase llamada 'Mazo' que contenga un
//  arreglo de 8 elementos de tipo 'Carta'. Extraer al azar una carta, mostrarla y según el tipo de
//  palo mostrar la cantidad de puntos que gana.
