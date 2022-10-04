import java.util.ArrayList;
import java.util.Collections;

public class PruebaPersona {
 
	 public static void main(String[] args) {
		 
		 ArrayList<Persona> lista1 = new ArrayList<Persona>();
		 
		 lista1.add(new Persona("Juan", 33));
		 lista1.add(new Persona("Ana", 22));
		 lista1.add(new Persona("Pedro", 50));
		 
		 for (Persona per : lista1)
			 System.out.println(per.retornarNombre() + "-" + per.retornarEdad());
		 
		 Collections.sort(lista1);           // método que ordena
		 
		 System.out.println("Lista luego de ordenar en forma alfabética.");
		 
		 for (Persona per : lista1)
			 System.out.println(per.retornarNombre() + "-" + per.retornarEdad());
	 }
}
