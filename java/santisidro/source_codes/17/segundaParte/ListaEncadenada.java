package segundaParte;

public class ListaEncadenada {
	
	class Nodo {
		 int info;
		 Nodo sig;
	}

	private Nodo raiz;


	void insertarPrimero(int x) {
		 Nodo nuevo = new Nodo ();
		 nuevo.info = x;
		 nuevo.sig=raiz;
		 raiz=nuevo;
	}
		 
	public void imprimirInversa(Nodo reco) {
		 if (reco!=null) {
			 imprimirInversa(reco.sig);
			 System.out.print(reco.info+"-");
		 }
	}

	public void imprimirInversa () {
		 imprimirInversa(raiz);
	}

	public static void main(String[] ar) {
		ListaEncadenada r = new ListaEncadenada();
		 r.insertarPrimero (10);
		 r.insertarPrimero(4); 
		 r.insertarPrimero(5); 
		 r.insertarPrimero(8); 
		 r.insertarPrimero(100); 
		 r.insertarPrimero(999);
		 r.imprimirInversa();
	}
} 

/* 
* Imprimir la información de una lista simplemente encadenada de atrás para adelante.
* El empleo de estructuras repetitivas para resolver este problema es bastante engorroso y lento
* (debemos avanzar hasta el último nodo e imprimir, luego avanzar desde el principio hasta el
* anteúltimo nodo y así sucesivamente)
* El empleo de la recursividad para este problema hace más sencilla su solución. 
*/