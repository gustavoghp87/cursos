
public class PersonaAdulta {
	 
	 private String nombre;
	 private int edad;
	 
	 public PersonaAdulta(String nombre, int edad) throws Exception {
		 this.nombre = nombre;
		 if (edad < 18)
			 throw new Exception("No es adulta la persona " + nombre + " porque tiene " + edad + " años.");
		 this.edad = edad;
	 }
	
	 public void fijarEdad(int edad) throws Exception {
		 if (edad < 18)
			 throw new Exception("No es adulta la persona " + nombre + " porque tiene " + edad + " años.");
		 this.edad = edad;
	 }
	
	 public void imprimir() {
		 System.out.println(nombre + " - " + edad);
	 }
	
	 public static void main(String[] ar) {
		 try {
			 PersonaAdulta persona1 = new PersonaAdulta("Ana", 50);
			 persona1.imprimir();
			 PersonaAdulta persona2 = new PersonaAdulta("Juan", 13);
			 persona2.imprimir();
		 } catch (Exception ex) {
			 System.out.println(ex.getMessage());
		 }
	 }
}


// Declarar una clase llamada 'PersonaAdulta' con los atributos nombre y edad. Lanzar una excepción de
//  tipo IOException en caso que llegue en el constructor una edad menor a 18 años.
// Esto es porque a juicio del programador considera que es muy importante que nunca haya un objeto de
//  tipo PersonaAdulta que sea menor de edad.