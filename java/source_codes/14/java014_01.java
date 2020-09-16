public class java014_01
{
	class Nodo {int info; Nodo sig;}

	private Nodo raiz;
	
	public java014_01() {raiz = null;}
	
	public void insertar(int x)
	{
		Nodo nuevo = new Nodo();
		nuevo.info = x;
		if(raiz==null)
		{ 
			nuevo.sig = null;
			raiz = nuevo;
		}
		else
		{ 
			nuevo.sig = raiz;
			raiz = nuevo;
		}
	}
	
	public int extraer()
	{ 
		if(raiz!=null)
		{ 
			int informacion = raiz.info;
			raiz = raiz.sig;
			return informacion;
		}
		else
		{ 
			return Integer.MAX_VALUE;
		}
	}
	
	public void imprimir()
	{
		Nodo reco = raiz;
		System.out.println("Listado de todos los elementos de la pila:");
		while(reco!=null)
		{
			System.out.print(reco.info +"-");
			reco = reco.sig;
		}
		System.out.println();
	}

	public static void main(String[]args)
	{
		java014_01 pila1 = new java014_01();
		pila1.insertar(10);
		pila1.insertar(40);
		pila1.insertar(3);
		pila1.imprimir();
		System.out.println("Extraemos de la pila: " +pila1.extraer());
		pila1.imprimir();
	}
}


// Confeccionar una clase que administre una lista tipo pila. Se debe poder insertar, extraer e
// imprimir los datos de la pila: 10, 40 y 3. Extraer el 3 y volver a imprimir.
