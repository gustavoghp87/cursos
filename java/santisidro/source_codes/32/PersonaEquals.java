public class PersonaEquals {
	 
	 private String nombre;
	 private int edad;
	 private String dni;
	 
	 public PersonaEquals(String nombre, int edad, String dni) {
		 this.nombre = nombre;
		 this.edad = edad;
		 this.dni = dni;
	 }
	 
	 public boolean equals(Object obj) {
		 PersonaEquals persona = (PersonaEquals) obj;
		 if (dni.equals(persona.dni))
			 return true;
		 else
			 return false;
	 }
	 
	 public static void main(String[] ar) {
		 
		 PersonaEquals persona1 = new PersonaEquals("juan", 22, "20456123");
		 PersonaEquals persona2 = new PersonaEquals("ana", 15, "21100200");
		 PersonaEquals persona3 = new PersonaEquals("juan", 22, "20456123");
		 
		 if (persona1.equals(persona2))
			 System.out.println("persona1 y persona2 si son la misma persona");
		 else
			 System.out.println("persona1 y persona2 no son la misma persona");
		 if (persona1.equals(persona3))
			 System.out.println("persona1 y persona3 si son la misma persona");
	 }

}
