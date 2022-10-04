import java.util.Scanner;
public class java007_1 {
	private Scanner teclado;
	private String[] nombres;
	private float[] sueldos;
	float mayor;
	public void cargar() {
		teclado=new Scanner(System.in);
		nombres=new String[5];
		sueldos=new float[5];
		for(int f=0;f<nombres.length;f++) {
			System.out.print("Ingrese el nombre del empleado: ");
			nombres[f]=teclado.next();
			System.out.print("Ingrese el sueldo: ");
			sueldos[f]=teclado.nextFloat();
		}
	}
	public void mayorSueldo() {
		int pos;
		mayor=sueldos[0];
		pos=0;
		for(int f=1;f<nombres.length;f++) {
			if (sueldos[f]>mayor) {
				mayor=sueldos[f];
				pos=f;
			}
		}
		System.out.println("El empleado con sueldo mayor es :" + nombres[pos]);
		System.out.println("Tiene un sueldo: " + mayor);
	}
	public void repiteMenor() {
		int cant=0;
		for(int f=0; f<sueldos.length; f++) {
			if (sueldos[f]==mayor) {
				cant++;
			}
		}
		if (cant>1) {
		System.out.println("Se repite el mayor en el vector.");
		} else {
		System.out.println("No se repite el mayor en el vector.");
		}
	}
	public static void main(String[] ar) {
		java007_1 pv=new java007_1();
		pv.cargar();
		pv.mayorSueldo();
		pv.repiteMenor();
	}
}

//Confeccionar un programa que permita cargar los nombres de 5 operarios y sus sueldos
//respectivos. Mostrar el sueldo mayor y el nombre del operario.
//y un mensaje si se repite dentro del vector.