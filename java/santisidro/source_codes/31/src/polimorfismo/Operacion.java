package polimorfismo;

public abstract class Operacion {
	
	protected int valor1, valor2, resultado;
	
	public Operacion(int valor1, int valor2) {
		 this.valor1 = valor1;
		 this.valor2 = valor2;
	}
	
	public void imprimir() {
		System.out.println(resultado);
	}
	
	public abstract void operar();
	
}

// La clase 'Operacion' es abstracta y define un m�todo abstracto llamado 'operar'. Luego significa que
//  cualquier clase que herede de 'Operacion' est� obligado a implementarlo.
// La implementaci�n del m�todo operar depende de la subclase y el concepto que represente la misma.