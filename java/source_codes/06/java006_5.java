import java.util.Scanner;
public class java006_5 {
	int[] vector1, vector2;
	Scanner teclado;
		void cargar() {
			teclado=new Scanner(System.in);
			vector1 = new int [4];
			vector2 = new int [4];
			for (int f=0; f<vector1.length; f++) {
				System.out.println("Ingrese valor " + f + " para vector1: ");
				vector1[f]= teclado.nextInt();
			}
			for (int f=0; f<vector2.length; f++) {
				System.out.println("Ingrese valor " + f + " para vector2: ");
				vector2[f]= teclado.nextInt();
			}		
		}
		void sumar() {
			int suma;
			suma=0;
			for (int f=0; f<vector1.length; f++) {
				suma = suma + vector1[f] + vector2[f];
			}
			System.out.println("La suma de datos es: " + suma);
		}
		void sumarvect() {
			int[] vector3;
			vector3 = new int[4];
			System.out.print("El vector suma es: [ ");
			for (int f=0; f<vector3.length; f++) {
				vector3[f] = vector1[f] + vector2[f];
				System.out.print(vector3[f] + " ");
			}
			System.out.print("]");
		}
		
		public static void main(String[]ar) {
		java006_5 jv5=new java006_5();
		jv5.cargar();
		jv5.sumar();
		jv5.sumarvect();
	}	
}

//Realizar un programa que pida la carga de dos vectores numéricos enteros de 4
//elementos. Obtener la suma de los dos vectores, dicho resultado guardarlo en un tercer
//vector del mismo tamaño. Sumar componente a componente.