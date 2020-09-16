package com.anonimas;

public class PruebaClaseAnonima {

	abstract class A {
		 public abstract void imprimir();
	}
	
	interface B {
		 void imprimir();
	}
	
	public void probar() {
		 (new A() {
			 public void imprimir() {
				 System.out.println("Clase");
			 }
		 }).imprimir();
		 
		 (new B() {
			 public void imprimir() {
				 System.out.println("Interface");
			 }
		 }).imprimir();
	}
		
	public static void main(String[] ar) {
		 PruebaClaseAnonima p = new PruebaClaseAnonima();
		 p.probar();
	}
}