
public class Recursividad {
	void imprimir(int x) {
		 if (x>0) {
			 System.out.println(x);
			 imprimir(x-1);
		 }
    }

	public static void main(String[] ar) {
		Recursividad re=new Recursividad();
		re.imprimir(5);
	}
}

/* 
*  Implementar un método recursivo que imprima en forma descendente de 5 a 1 de uno en uno. 
*/