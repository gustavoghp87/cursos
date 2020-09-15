public class java010_02_JuegoDeDados {
	private Dado dado1,dado2;

	public java010_02_JuegoDeDados() {
		dado1=new Dado();
		dado2=new Dado();
	}

	public void jugar() {
		dado1.tirar();
		dado1.imprimir();
		dado2.tirar();
		dado2.imprimir();
		if (dado1.retornarValor()==dado2.retornarValor() ) {
			System.out.println("Ganó");
		} else {
			System.out.println("Perdió");
		}
	}

	public static void main(String[] ar){
		java010_02_JuegoDeDados j=new java010_02_JuegoDeDados();
		j.jugar();
	}
}

//Plantear un programa que permita jugar a los dados. Las reglas de juego son: se tiran tres (dos)
//dados. Si los tres salen con el mismo valor mostrar un mensaje que "ganó", sino "perdió".