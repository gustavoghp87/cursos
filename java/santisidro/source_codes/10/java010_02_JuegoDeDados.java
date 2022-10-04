public class java010_02_JuegoDeDados {
	private java010_02_Dado dado1,dado2;

	public java010_02_JuegoDeDados() {
		dado1=new java010_02_Dado();
		dado2=new java010_02_Dado();
	}

	public void jugar() {
		dado1.tirar();
		dado1.imprimir();
		dado2.tirar();
		dado2.imprimir();
		if (dado1.retornarValor()==dado2.retornarValor() ) {
			System.out.println("Gan�");
		} else {
			System.out.println("Perdi�");
		}
	}

	public static void main(String[] ar) {
		java010_02_JuegoDeDados j=new java010_02_JuegoDeDados();
		j.jugar();
	}
}




//Plantear un programa que permita jugar a los dados. Las reglas de juego son: se tiran tres (dos)
//dados. Si los tres salen con el mismo valor mostrar un mensaje que "gan�", sino "perdi�".