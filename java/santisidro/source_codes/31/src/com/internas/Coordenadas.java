package com.internas;
import java.util.ArrayList;

public class Coordenadas {
	
	private class Punto {
		 private int x, y;
		 
		 public Punto(int x, int y) {
			 fijarX(x);
			 fijarY(y);
		 }
		 
		 public void fijarX(int x) {
			 this.x = x;
		 }
		 
		 public void fijarY(int y) {
			 this.y = y;
		 }
		 
		 public int retornarCuadrante() {
			 if (x > 0 && y > 0)
				 return 1;
			 else if (x < 0 && y > 0)
				 return 2;
			 else if (x < 0 && y < 0)
				 return 3;
			 else if (x > 0 && y < 0)
				 return 4;
			 else
				 return -1;
		 }
	}
		 
	private ArrayList<Punto> puntos;
	
	public Coordenadas() {
		puntos = new ArrayList<Punto>();
	}
	
	public void agregarPunto(int x, int y) {
		puntos.add(new Punto(x, y));
	}
	
	public int cantidadPuntosCuadrante(int cuadrante) {
		int cant = 0;
		for (Punto pun : puntos)
			 if (pun.retornarCuadrante() == cuadrante)
				 cant++;
			 return cant;
	}
	
	public static void main(String[] ar) {
		 Coordenadas coordenadas = new Coordenadas();
		 coordenadas.agregarPunto(30, 30);
		 coordenadas.agregarPunto(2, 7);
		 coordenadas.agregarPunto(-3, 2);
		 coordenadas.agregarPunto(-5, -4);
		 coordenadas.agregarPunto(-5, -4);
		 coordenadas.agregarPunto(-5, 0);
		 coordenadas.agregarPunto(-5, -4);
		 coordenadas.agregarPunto(0, -4);
		 coordenadas.agregarPunto(-5, -4);
		 coordenadas.agregarPunto(0, 0);
		 coordenadas.agregarPunto(-9, -2);
		 System.out.println("Cantidad de puntos en el primer cuadrante: " +coordenadas.cantidadPuntosCuadrante(1));
		 System.out.println("Cantidad de puntos en el segundo cuadrante: " +coordenadas.cantidadPuntosCuadrante(2));
		 System.out.println("Cantidad de puntos en el tercer cuadrante: " +coordenadas.cantidadPuntosCuadrante(3));
		 System.out.println("Cantidad de puntos en el cuarto cuadrante: " +coordenadas.cantidadPuntosCuadrante(4));
		 System.out.println("Cantidad de puntos sobre los ejes: " +coordenadas.cantidadPuntosCuadrante(-1));
	}
	
}

// Confeccionar una clase llamada Coordenadas que almacene la referencia de puntos en el plano mediante x e y.
// Declarar una clase interna que represente un punto en el plano.
// La clase Coordenada debe almacenar en un ArrayList con elementos de tipo Punto. Además la clase Coordenadas
//  debe poder calcular la cantidad de puntos almacenados en cada cuadrante.