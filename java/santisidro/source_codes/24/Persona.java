
public class Persona {
     
	 private String nombre;
	 private int edad;
	 
	 public Persona(String nombre, int edad) {
		 this.nombre = nombre;
		 this.edad = edad;
	 }
	 
	 public void imprimir() {
		 System.out.println(nombre + " " + edad);
	 }

}


// Implementar una clase Pila que administre cualquier tipo de datos mediante el concepto de genéricos.
// Crear luego 4 objetos de la clase Pila y almacenar en la primer pila objetos de la clase Persona, en la
//  segunda objetos de la clase Carta, en la tercera objetos de la clase String y finalmente en la cuarta objetos
//  de la clase Integer.