import java.util.Scanner;
public class java010_04_Operacion {
	protected Scanner teclado;
	public int valor1;
	public int valor2;
		
	public Operacion() {
		teclado = new Scanner(System.in);
	}

	public void cargar1() {
		System.out.print("Ingrese el primer valor: ");
		valor1 = teclado.nextInt();
	}

	public void cargar2() {
		System.out.print("Ingrese el segundo valor: ");
		valor2 = teclado.nextInt();
	}
}

//Supongamos que necesitamos implementar dos clases que llamaremos Suma y Resta. Cada clase tiene
//como atributo valor1, valor2 y resultado. Los métodos a definir son cargar1 (que inicializa el 
//atributo valor1), carga2 (que inicializa el atributo valor2), operar (que en el caso de la clase
//"Suma" suma los dos atributos y en el caso de la clase "Resta" hace la diferencia entre valor1 y
//valor2, y otro método mostrarResultado.
//Si analizamos ambas clases encontramos que muchos atributos y métodos son idénticos. En estos casos
//es bueno definir una clase padre que agrupe dichos atributos y responsabilidades comunes.
//Solamente el método operar es distinto para las clases Suma y Resta (esto hace que no lo
//podamos disponer en la clase Operacion), luego los métodos cargar1, cargar2 y mostrarResultado}
//son idénticos a las dos clases, esto hace que podamos disponerlos en la clase Operacion. Lo mismo
//los atributos valor1, valor2 y resultado se definirán en la clase padre Operacion.