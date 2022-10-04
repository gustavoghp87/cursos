
public class RecursividadFactoriales {

		 int factorial(int fact) {
			 if (fact>1) {
			 int valor = fact * factorial(fact-1);
			 return valor;
			 }
			 else
				 return 1;
		 }

		 public static void main(String[] ar) {
			 RecursividadFactoriales re=new RecursividadFactoriales();
			 int f = re.factorial(4);
			 System.out.println("El factorial de 4 es "+f);
		 }
}

// Otro problema típico que se presenta para analizar la recursividad es el obtener el factorial de
// un número. 
