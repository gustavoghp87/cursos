package com.localesAmetodos;

public class Externa {
	
	public void imprimir() {
		 
		System.out.println("Comienzo del m�todo imprimir de la clase Externa.");
		 
		class Local {
			 public void imprimir2() {
				 System.out.println("M�todo imprimir de la clase Local.");
			 }
		}
		
		Local local1 = new Local();
		local1.imprimir2();
		System.out.println("Fin del m�todo imprimir de la clase Externa.");
	}
	
	public static void main(String[] ar) {
		 Externa externa1 = new Externa();
		 externa1.imprimir();
	}
}
