public class Persona implements Comparable<Persona> {

	 private String nombre;
	 private int edad;
	 
	 public Persona(String nombre, int edad) {
		 this.nombre = nombre;
		 this.edad = edad;
	 }
	 
	 String retornarNombre() {
		 return nombre;
	 }
	 
	 int retornarEdad() {
		 return edad;		 
	 }
	 
	 public int compareTo(Persona persona) {
		 return nombre.compareTo(persona.nombre);
	 }
	 
}
