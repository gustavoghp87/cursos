package ListaAbstracta;

public class Pila extends Lista {
	
	// Como heredamos de la clase Lista debemos obligatoriamente implementar los métodos insertar y extraer 

	public void insertar(int x) {
		 Nodo nuevo = new Nodo();
		 nuevo.info = x;
		 nuevo.sig = raiz;
		 raiz = nuevo;
	}
		
	public int extraer() {
		 if (raiz == null)
			 return Integer.MAX_VALUE;
		 else {
			 int valor = raiz.info;
			 raiz = raiz.sig;
			 return valor;
		 }
	}
	
	public static void main(String[] args) {
		 Pila pila1 = new Pila();
		 pila1.insertar(20);
		 pila1.insertar(5);
		 pila1.insertar(600);
		 System.out.print("Pila de último a primero: ");
		 pila1.imprimir();
		 pila1.extraer();
		 System.out.print("Se va el último porque es pila. Visto al revés: ");
		 pila1.imprimir();
	}
}