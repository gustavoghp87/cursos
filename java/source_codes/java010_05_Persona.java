import java.util.Scanner;
public class java010_05_Persona {
	protected Scanner keyboard;
	protected String nombre;
	protected int edad;
	
	public java010_05_Persona() {
		keyboard = new Scanner(System.in);
	}
	
	void cargar() {
		System.out.print("Cargue nombre de la persona: ");
		nombre = keyboard.next();
		System.out.print("Cargue edad: ");
		edad = keyboard.nextInt();
	}
	
	void imprimir() {
		System.out.println("Persona: " +nombre +", edad: " +edad);
	}
}

//Confeccionar una clase Persona que tenga como atributos el nombre y la edad. Definir
//como responsabilidades un método que cargue los datos personales y otro que los imprima.

//Plantear una segunda clase Empleado que herede de la clase Persona. Añadir un atributo
//sueldo y los métodos de cargar el sueldo e imprimir su sueldo.

//Definir un objeto de la clase Persona y llamar a sus métodos. También crear un objeto
//de la clase Empleado y llamar a sus métodos.