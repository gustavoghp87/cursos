package ArrayList;

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

// Crear un proyecto y dentro del mismo crear dos clases. La primer clase se debe llamar 'Carta', con dos
//  atributos el palo y el número de carta. Por otro lado declarar una clase llamada 'Mazo' que contenga un
//  ArrayList de tipo 'Carta'. Imprimir las cartas en forma ordenadas según como se insertaron y luego
//  mezclar y volver a imprimir.