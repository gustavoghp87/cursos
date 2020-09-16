package com.estaticas;

public class Externa {
	 
	 public static class Interna {
		 public void imprimir() {
			 System.out.println("Clase interna estática");
		 }
	 }
		
 	 public void imprimir() {
 		 System.out.println("Clase externa");
	 }
}
