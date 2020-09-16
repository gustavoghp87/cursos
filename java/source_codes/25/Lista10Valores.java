import java.util.Set;
import java.util.TreeSet;

public class Lista10Valores {

	public static void main(String[] args) {
		 Set<Integer> conjunto1 = new TreeSet<Integer>();
		 while (conjunto1.size() < 8) {
			 int aleatorio = (int) (Math.random() * 10) + 1;
			 conjunto1.add(aleatorio);
		 }
		 System.out.println(conjunto1);
		 System.out.print("Cantidad: " + conjunto1.size());
	}

}

// Busca 8 valores al azar entre 1 y 10 pero sin repetir