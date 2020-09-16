package Mes;

public enum Mes {
	
	ENERO(1), FEBRERO(2), MARZO(3), ABRIL(4), MAYO(5), JUNIO(6), JULIO(7), AGOSTO(8), SEPTIEMBRE(9), OCTUBRE(10), NOVIEMBRE(11), DICIEMBRE(12);
	
	private final int numero;
	
	Mes(int numero) {
		this.numero = numero;
	}
	 
	public int retornarNumero() {
		return numero;
	}
	
}

// En algunas situaciones podemos crear tipos enum que además de las constantes tengan
//  asociados otros valores, cada constante, mediante atributos.

//  Cuando se declara un enum podemos definir constructores y otros métodos a la misma.

// Un enum es un tipo especial de clase que tiene una enumeración de constantes, pero puede
//  tener asociados atributos y métodos.