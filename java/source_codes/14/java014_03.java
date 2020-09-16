
public class java014_03 {
	
	class java014_02
	{
		int info;
		java014_02 sig;
	}

	private java014_02 raiz;

	java014_03 () {
		raiz=null;
	}

	public void insertar(int x) {
		java014_02 nuevo;
		nuevo = new java014_02();
		nuevo.info = x;
		if (raiz==null) {
			nuevo.sig = null;
			raiz = nuevo; 
		}
		else {
			nuevo.sig = raiz;
			raiz = nuevo;
		}
	}

	public int extraer () {
		if (raiz!=null) {
			int informacion = raiz.info;
			raiz = raiz.sig;
			return informacion;
		}
		else {
			return Integer.MAX_VALUE;
		}
	}

	public int retornar () {
		if (raiz!=null) {
			int informacion = raiz.info;
			return informacion;
		}
		else {
			return Integer.MAX_VALUE;
		}
	}

	public void imprimir() {
		java014_02 reco=raiz;
		System.out.println("Listado de todos los elementos de la pila.");
		while (reco!=null) {
		System.out.print(reco.info+"-");
		reco=reco.sig;
		}
		System.out.println();
	}

	public static void main(String[] ar) {
	java014_03 pila1=new java014_03();
	pila1.insertar(10);
	pila1.insertar(40);
	pila1.insertar(3); 
	pila1.imprimir();
	System.out.println("Extraemos de la pila:"+pila1.extraer());
	pila1.imprimir();
	System.out.println("Retornamos primero de la pila:"+pila1.retornar());
	pila1.imprimir();
	}
}

// Agregar un método a la clase Pila que retorne la información del primer nodo de la
//Pila sin borrarlo.