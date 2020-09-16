package com.estaticas;

public class PruebaClaseInterna {
	
	public static void main(String[] args) {
		 Externa.Interna interna = new Externa.Interna();
		 interna.imprimir();
		 
		 new Externa.Interna().imprimir();
		 
		 System.out.print("\n\n");
		 
		 Externa externa = new Externa();
		 externa.imprimir();
	}
	
}
