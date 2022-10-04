package ListaAbstracta;

public abstract class Lista {

	public class Nodo {
		 int info;
		 Nodo sig;
	}
	
	protected Nodo raiz;
	 
	public abstract void insertar(int x);
	 
	public abstract int extraer();
	 
	public void imprimir() {
		
		 Nodo reco = raiz;
		
		 while (reco != null) {
			 System.out.print(reco.info + " ");
			 reco = reco.sig;
		 }
		 System.out.println();
	}
}


// Confeccionar una clase abstracta que represente una Lista simplemente encadenada que defina dos
//  métodos abstractos llamados: insertar y extraer un entero. Además definir un método que imprima la lista.
// Luego plantear dos clases llamadas Pila y Cola que hereden de la clase abstracta Lista e implementen los
//  dos métodos abstractos.