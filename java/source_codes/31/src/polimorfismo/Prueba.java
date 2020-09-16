package polimorfismo;
import java.util.ArrayList;

public class Prueba {
	 public static void main(String[] ar) {
		 ArrayList<Operacion> lista1 = new ArrayList<Operacion>();    // lista1 no es de objetos de Operacion sino de sus subclases
		 lista1.add(new Suma(2, 34));
		 lista1.add(new Resta(3, 2));
		 lista1.add(new Suma(100, 1));
		 for (Operacion op : lista1) {
			 op.operar();                // ejecuta el operar que corresponda al objeto
			 op.imprimir();              // el imprimir es el mismo, por eso está en la clase abstracta
		 }
	 }
}
