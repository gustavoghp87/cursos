package java006;
import java.util.Scanner;
public class java006_1 {
	
	
	private int[] sueldos;
	
	public void cargar() {
		Scanner teclado;
		teclado=new Scanner(System.in);
		sueldos=new int[5];
		for(int f=0; f<5; f++) {
			System.out.print("Ingrese valor de sueldo " +f + " : ");
			sueldos[f]=teclado.nextInt();
		}
	}

	public void imprimir() {
		for (int f=0; f<5; f++) {
			System.out.println(sueldos[f]);
		}
	}
			
	public static void main(String[] ar) {
		java006_1 jv6=new java006_1();
		jv6.cargar();
		jv6.imprimir();
	}
}