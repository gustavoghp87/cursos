import java.util.Scanner;
public class java010_03_Club {
	private java010_03_Socio socio1, socio2, socio3;
	private Scanner keyboard;
	
	public Club() {
		keyboard = new Scanner(System.in);
		socio1 = new java010_03_Socio(keyboard);
		socio2 = new java010_03_Socio(keyboard);
		socio3 = new java010_03_Socio(keyboard);
	}
	
	public void mayorAntiguedad() {
		System.out.print("Socio con mayor antig�edad: ");
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
//La clase Socio debe tener los siguientes atributos privados: nombre y la antig�edad en el club (en a�os).
//En el constructor pedir la carga del nombre y su antig�edad.
//La clase Club debe tener como atributos 3 objetos de la clase Socio. Definir una responsabilidad
//para imprimir el nombre del socio con mayor antig�edad en el club.