import java.util.Scanner;
public class java008_9 {
	private Scanner keyboard;
	String[] empleados;
	int[][] sueldos;
	int[] suma;
	void cargar() {
		keyboard=new Scanner(System.in);
		empleados = new String[4];
		sueldos = new int[4][3];
		suma = new int[4];
		for (int f=0; f<4; f++) {
			System.out.print("Ingrese nombre de empleado " + (f+1) + ": ");
			empleados[f] = keyboard.next();
			suma[f] = 0;
			for (int mes=0; mes<3; mes++) {
				System.out.print("Ingrese sueldo del mes " + (mes+1) + ": ");
				sueldos[f][mes] = keyboard.nextInt();
				suma[f] = suma[f] + sueldos[f][mes];
			}
		}
	}
	void imprimir() {
		for (int f=0; f<4; f++) {
				System.out.println(empleados[f] + " " + suma[f]);
		}
	}
	void mayor() {
		int mayor;
		mayor = suma[0];
		String mayor1;
		mayor1 = empleados[0];
		for (int f=1; f<4; f++) {
			if (suma[f]>mayor) {
				mayor = suma[f];
				mayor1 = empleados[f];
			}
		}
		System.out.print("El sueldo mayor es " + mayor + " y corresponde a " + mayor1);
	}
	public static void main(String[]ar) {
		java008_9 jv=new java008_9();
		jv.cargar();
		jv.imprimir();
		jv.mayor();
	}
}

//Se tiene la siguiente información:
//Nombres de 4 empleados.
//Ingresos en concepto de sueldo, cobrado por cada empleado, en los últimos 3 meses.
//Confeccionar el programa para:
//a) Realizar la carga de la información mencionada.
//b) Generar un vector que contenga el ingreso acum en los últimos 3 meses para cada empleado.
//c) Mostrar por pantalla el total pagado en sueldos a todos los empleados en los últimos 3 meses
//d) Obtener el nombre del empleado que tuvo el mayor ingreso acumulado