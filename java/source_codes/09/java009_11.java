import java.util.Scanner;
public class java009_11 {
	Scanner keyboard;
	String[] nombres;
	String[] emails;
	
	java009_11() {
		keyboard = new Scanner(System.in);
		nombres = new String[5];
		emails = new String[5];
		for (int f=0; f<nombres.length; f++) {
			System.out.print("Ingrese usuario " +(f+1) + ": ");
			nombres[f] = keyboard.nextLine();
			System.out.print("Ingrese su dirección de e-mail: ");
			emails[f] = keyboard.next();
			keyboard.nextLine();
		}
	}
	
	void imprimir() {
		for (int f=0; f<nombres.length; f++) {
			System.out.println(nombres[f] + ", dirección: " + emails[f]);
		}
	}
	
	void consultaMail() {
		String aux;
		System.out.print("Ingrese el nombre de la persona: ");
		aux = keyboard.nextLine();
		boolean existe=false;
		for (int f=0; f<nombres.length; f++) {
			if (aux.equals(nombres[f])) {
				System.out.println("Mail de la persona: " +emails[f]);
				existe=true;
			}
		}
		if (existe==false) {
			System.out.println("No existe una persona con ese nombre.");
		}
	}
	
	public void sinArroba() {
		for (int f=0; f<emails.length; f++) {
			boolean tiene=false;
			for (int k=0; k<emails[f].length(); k++) {
				if (emails[f].charAt(k)=='@') {
					tiene=true;
				}
			}
			if (tiene==false) {
				System.out.println(emails[f]+" no tiene @");
			}
		}
	}
	
	public static void main(String[]ar) {
		java009_11 op=new java009_11();
		op.imprimir();
		op.consultaMail();
		op.sinArroba();
	}
}

//Confeccionar un programa que permita cargar los nombres de 5 personas y sus
//mail, luego implementar los siguientes métodos:
//a) Mostrar por pantalla los datos.
//b) Consulta del mail ingresando su nombre.
//c) Mostrar los mail que no tienen el carácter @.