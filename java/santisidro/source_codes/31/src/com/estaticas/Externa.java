package com.estaticas;

public class Externa {
	 
	 public static class Interna {
		 public void imprimir() {
			 System.out.println("Clase interna est�tica");
		 }
	 }
		
 	 public void imprimir() {
 		 System.out.println("Clase externa");
	 }
}
