import java.util.Scanner;
public class java009_9 {
	Scanner keyboard;
	String palabra;
	java009_9() {
		keyboard = new Scanner(System.in);
		System.out.print("Ingrese la dichosa palabra: ");
		palabra = keyboard.next();
	}
	void imprimir() {
		String cad3 = palabra.substring(0,3);
		System.out.println("Los primeros tres caracteres de "+palabra +" son "+cad3);
		
		String miti = palabra.substring(0,palabra.length()/2);
		System.out.println("La primera mitad de la palabra " +palabra +" es: " +miti);
		
		char ultimo = palabra.charAt(palabra.length()-1);
		System.out.println("El último caracter de " +palabra + " es " +ultimo);
		
		for (int f=0; f<palabra.length(); f++) {
			System.out.print(palabra.charAt(palabra.length()-1-f));
		}
		System.out.println();
		for (int f=0; f<palabra.length()-1; f++) {
			System.out.print(palabra.charAt(f) +" - ");
		}
		System.out.println(ultimo);
		
		boolean existe=false;
		int vocales = 0;
		for (int f=0; f<palabra.length(); f++) {
			if (palabra.charAt(f)=='a' || palabra.charAt(f)=='e' || palabra.charAt(f)=='i' || palabra.charAt(f)=='o' || palabra.charAt(f)=='u') {
				existe=true;
				vocales++;
			}
		}
		System.out.println("La cantidad de vocales que contiene es: " +vocales);
		
		int cant=0;
		for (int f=0; f<palabra.length()/2; f++) {
			if (palabra.charAt(f)==palabra.charAt(palabra.length()-1-f)) {
				cant++;
			}
		}
		if (cant==palabra.length()/2) {
			System.out.println("Es capicúa la palabra " +palabra);
		} else {
			System.out.println("No es capicúa la palabra " +palabra);
		}
	}
	public static void main(String[]ar) {
		java009_9 op=new java009_9();
		op.imprimir();
	}
}

//Cargar un String por teclado e implementar los siguientes métodos:
//a) Imprimir la primera mitad de los caracteres de la cadena.
//b) Imprimir el último caracter.
//c) Imprimirlo en forma inversa.
//d) Imprimir cada caracter del String separado con un guión.
//e) Imprimir la cantidad de vocales almacenadas.
//f) Implementar un método que verifique si la cadena se lee igual de izquierda a derecha tanto
//como de derecha a izquierda (ej. neuquen se lee igual en las dos direcciones)