package ListaAbstracta;
public class Cola extends Lista {
	
	public void insertar(int x) {
		 Nodo nuevo = new Nodo();
		 nuevo.info = x;
		 if (raiz == null) {
			 nuevo.sig = raiz;
			 raiz = nuevo;
		 } else {
			 Nodo reco = raiz;
			 while (reco.sig != null)
				 reco = reco.sig;
			 reco.sig = nuevo;
		 }
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
		 Cola cola1 = new Cola();
		 cola1.insertar(20);
		 cola1.insertar(5);
		 cola1.insertar(600);
		 cola1.imprimir();
		 System.out.print("Se va el primero porque es cola: ");
		 cola1.extraer();
		 cola1.imprimir();
	}
}