import java.util.Scanner;
public class java006_6 {
	Scanner teclado;
	int[] sueldos;
	void cargar() {
		teclado=new Scanner(System.in);
		int cantidad;
		System.out.println("Ingrese cantidad de sueldos: ");
		cantidad=teclado.nextInt();
		sueldos = new int[cantidad];
		for (int f=0; f<cantidad; f++) {
			System.out.println("Ingrese ahora valor " + f + " del vector: ");
			sueldos[f] = teclado.nextInt();
		}
		System.out.print("El vector es: ");
		for (int f=0; f<cantidad; f++) {
			System.out.print(sueldos[f] + " ");
		}
	}
	public static void main(String[]ar) {
		java006_6 jv6=new java006_6();
		jv6.cargar();
	}
}


//Se desea almacenar los sueldos de operarios. Cuando se ejecuta el programa se debe pedir la
//cantidad de sueldos a ingresar. Luego crear un vector con dicho tamaño.