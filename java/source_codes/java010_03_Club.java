import java.util.Scanner;
public class java010_03_Club {
	private Socio socio1, socio2, socio3;
	private Scanner keyboard;
	
	public Club() {
		keyboard = new Scanner(System.in);
		socio1 = new Socio(keyboard);
		socio2 = new Socio(keyboard);
		socio3 = new Socio(keyboard);
	}
	
	public void mayorAntiguedad() {
		System.out.print("Socio con mayor antigüedad: ");
		if (socio1.retornarAntiguedad()>socio2.retornarAntiguedad() && socio1.retornarAntiguedad()>socio3.retornarAntiguedad()) {
			socio1.imprimir();
		} else {
			if (socio2.retornarAntiguedad()>socio3.retornarAntiguedad()) {
				socio2.imprimir();
			} else {
				socio3.imprimir();
			}
		}
	}
	
	public static void main(String[]ar) {
		java010_03_Club club1=new java010_03_Club();
		club1.mayorAntiguedad();
	}
}

//Plantear una clase Club y otra clase Socio.
//La clase Socio debe tener los siguientes atributos privados: nombre y la antigüedad en el club (en años).
//En el constructor pedir la carga del nombre y su antigüedad.
//La clase Club debe tener como atributos 3 objetos de la clase Socio. Definir una responsabilidad
//para imprimir el nombre del socio con mayor antigüedad en el club.