package java006;
import java.util.Scanner;
public class java006_2 {
	private Scanner teclado;
	private float[] alturas;
	private float promedio;
	void cargar() {
		alturas=new float[5];
		teclado=new Scanner(System.in);
		for (int f=0; f<5; f++) {
			System.out.print("Ingrese valor de altura " + f + " : ");
			alturas[f]=teclado.nextFloat();
		}
	}
	
	void imprimir() {
		for (int f=0; f<5; f++) {System.out.print(alturas[f] +"   ");}
	}

	void calcular() {
		float suma;
		suma=0;
		for(int f=0;f<5;f++) {suma=suma+alturas[f];}
		promedio=suma/5;
		System.out.println("Promedio de alturas: "+promedio);
	}
	
	void contar() {
		int may,men;
		may=0;
		men=0;
		for(int f=0;f<5;f++) {
			if (alturas[f]>promedio) {may++;}
			else {
				if (alturas[f]<promedio) {men++;}
			}
		}
		System.out.println("Cantidad de personas mayores al promedio: " +may);
		System.out.println("Cantidad de personas menores al promedio: " +men);
	}

	public static void main (String[]ar) {
		java006_2 jv2=new java006_2();
		jv2.cargar();
		jv2.calcular();
		jv2.contar();
	}
}


//Definir un vector de 5 componentes de tipo float que representen las alturas de 5 personas.
//Obtener el promedio de las mismas. Contar cuántas personas son más altas que el promedio y
//cuántas más bajas.