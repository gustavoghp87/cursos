public class ListaGenerica2 {

 class Nodo {
	 int info;
	 Nodo sig;
 }

 private Nodo raiz;

 public ListaGenerica2 () {
	 raiz=null;
 }

 void insertarPrimero(int x)
 {
	 Nodo nuevo = new Nodo ();
	 nuevo.info = x;
	 nuevo.sig=raiz;
	 raiz=nuevo;
 }
 
 public void insertarUtlimo(int x) {
	 Nodo nuevo = new Nodo ();
	 nuevo.info = x;
	 if (raiz==null)
		 raiz=nuevo;
	 else {
		 Nodo reco=raiz;
		 while (reco.sig!=null) {
		 reco=reco.sig;
		 }
		 reco.sig=nuevo;
	 }
 }

 public void insertarSegundo(int x) {
	 if (raiz!=null) {
		 Nodo nuevo = new Nodo ();
		 nuevo.info = x;
		 if (raiz.sig==null) {
		 //Hay un solo nodo.
			 raiz.sig=nuevo;
		 } else {
			 nuevo.sig=raiz.sig;
			 raiz.sig=nuevo;
		 } 
	 }
 }

 public void insertarAnteUltimo(int x) {
	 if (raiz!=null) {
		 Nodo nuevo = new Nodo ();
		 nuevo.info = x;
		 if (raiz.sig==null) {
			 //Hay un solo nodo.
			 nuevo.sig=raiz;
			 raiz=nuevo;
		 }
		 else {
				 Nodo atras=raiz;
				 Nodo reco=raiz.sig;
				 while (reco.sig!=null) {
					 atras=reco;
					 reco=reco.sig;
				 }
				 nuevo.sig=atras.sig;
				 atras.sig=nuevo;
		 }
	 }
 }

 public void borrarPrimero() {
	 if (raiz!=null) {
		 raiz=raiz.sig;
	 }
 }

 public void borrarSegundo() {
	 if (raiz!=null) {
		 if (raiz.sig!=null) {
			 Nodo tercero=raiz.sig;
			 tercero=tercero.sig;
			 raiz.sig=tercero;
		 }
	 }
 }

 public void borrarUltimo () {
	 if (raiz!=null) {
	 if (raiz.sig==null) {
		 raiz=null;
	 } 
	 else {
			 Nodo reco=raiz.sig;
			 Nodo atras=reco;
			 while(reco.sig!=null) { 
				 atras=reco;
				 reco=reco.sig;
			 }
			 atras.sig=null;
	 	  }
	 }
 }
 
 public void imprimir () {
	 Nodo reco = raiz;
	 while (reco != null) {
		 System.out.print (reco.info + "-");
		 reco = reco.sig;
	 }
	 System.out.println();
 }

 public void borrarMayor() {
	 if (raiz!=null) {
	 Nodo reco=raiz;
	 int may=raiz.info;
	 while (reco!=null) {
	 if (reco.info>may) {
	 may=reco.info;
	 }
	 reco=reco.sig;
	 }
	 reco=raiz;
	 Nodo atras=raiz;
	 while (reco!=null) {
		 if (reco.info==may) {
			 if (reco==raiz) {
				 raiz=raiz.sig;
				 atras=raiz;
				 reco=raiz;
			 }
			 else {
					 atras.sig=reco.sig;
					 reco=reco.sig;
			 }
		 } 
			 else {
				 atras=reco;
				 reco=reco.sig;
			 }
	 }
	 }
 }

 
 public static void main(String[] ar) {
 ListaGenerica2 lg=new ListaGenerica2();
 lg.insertarPrimero (10);
 lg.insertarPrimero(45);
 lg.insertarPrimero(23);
 lg.insertarPrimero(89);
 lg.imprimir();
 System.out.println("Insertamos un nodo al final:");
 lg.insertarUtlimo(160);
 lg.imprimir();
 System.out.println("Insertamos un nodo en la segunda posición:");
 lg.insertarSegundo(13);
 lg.imprimir();
 System.out.println("Insertamos un nodo en la anteultima posición:");
 lg.insertarAnteUltimo(600);
 lg.imprimir();
 System.out.println("Borramos el primer nodo de la lista:");
 lg.borrarPrimero();
 lg.imprimir();
 System.out.println("Borramos el segundo nodo de la lista:");
 lg.borrarSegundo();
 lg.imprimir();
 System.out.println("Borramos el ultimo nodo de la lista:");
 lg.borrarUltimo();
 lg.imprimir();
 System.out.println("Borramos el mayor de la lista:");
 lg.borrarMayor();
 lg.imprimir();
 }
} 


// Plantear una clase para administrar una lista genérica implementando los siguientes
// métodos:
//    a) Insertar un nodo al principio de la lista.
//	  b) Insertar un nodo al final de la lista.
//    c) Insertar un nodo en la segunda posición. Si la lista está vacía no se inserta el nodo.
//    d) Insertar un nodo en la ante última posición.
//    e) Borrar el primer nodo.
//    f) Borrar el segundo nodo.
//    g) Borrar el último nodo.
//    h) Borrar el nodo con información mayor.