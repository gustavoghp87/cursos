package com.localesAmetodos;

public class Externa2 {
	 
	 int atributo1 = 10;
	 
	 public void imprimir(String parametro) {
		 System.out.println("Comienzo del método imprimir de la clase Externa.");
		 int variablelocal = 4;
		 class Local {
			 public void imprimir() {
				 System.out.println("Método imprimir de la clase Local.");
				 System.out.println(atributo1);
				 System.out.println(parametro);
				 System.out.println(variablelocal);
			 }
		 }
		 Local local1 = new Local();
		 local1.imprimir();
		 System.out.println("Fin del método imprimir de la clase Externa.");
	 }
	 
	 public static void main(String[] ar) {
		 Externa2 externa1 = new Externa2();
		 externa1.imprimir("Prueba");
	 }
}
