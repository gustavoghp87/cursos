package Operaciones;

public class PruebaOperaciones {
	
	public static void main(String[] args) {
		
		 int a = 100;
		 int b = 20;
	
		 Suma suma1 = new Suma(a, b);
		 suma1.operar();
		 suma1.imprimir();
		 
		 Resta resta1 = new Resta(a, b);
		 resta1.operar();
		 resta1.imprimir();
		 
		 Multiplicacion multiplicacion1 = new Multiplicacion(a, b);
		 multiplicacion1.operar();
		 multiplicacion1.imprimir();
		 
		 try {
			 Division division1 = new Division(a, b);
			 division1.operar();
			 division1.imprimir();
		 } catch (Exception ex) {
			 System.out.println(ex.getMessage());
		 }
	}

}
