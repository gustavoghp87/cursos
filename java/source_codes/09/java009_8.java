import java.util.Scanner;
public class java009_8 {
	Scanner teclado;
	String mail;
	
	java009_8() {
		teclado=new Scanner(System.in);
		System.out.print("Ingrese un mail: ");
		mail = teclado.next();
	}
	
	void verificarArroba() {
		boolean existe=false;
		for (int f=0; f<mail.length(); f++) {
			if (mail.charAt(f)=='@') {
				existe=true;
			}
		}
		if (existe==true) {
			System.out.println(mail+" contiene el caracter @");
		} else {
			System.out.println(mail+" no contiene el caracter @");
		}
	}
	public static void main(String[] ar) {
		java009_8 cad=new java009_8();
		cad.verificarArroba();
	}
}

//Realizar una clase, que permita cargar una dirección de mail en el constructor,
//luego en otro método mostrar un mensaje si contiene el caracter '@'.