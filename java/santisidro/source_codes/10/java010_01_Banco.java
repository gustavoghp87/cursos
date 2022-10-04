public class java010_01_Banco {
	private java010_01_Cliente cliente1,cliente2,cliente3;
	public java010_01_Banco() {
		cliente1=new java010_01_Cliente("Juan");
		cliente2=new java010_01_Cliente("Ana");
		cliente3=new java010_01_Cliente("Pedro");
	}
	public void operar() {
		cliente1.depositar(100);
		cliente2.depositar(150);
		cliente3.depositar(200);
		cliente3.extraer(150);
	}
	public void depositosTotales () {
		int t = cliente1.retornarMonto() + cliente2.retornarMonto() + cliente3.retornarMonto();
		System.out.println ("El total de dinero en el banco es:" + t);
		cliente1.imprimir();
		cliente2.imprimir();
		cliente3.imprimir();
	}
	public static void main(String[] ar) {
		java010_01_Banco banco1=new java010_01_Banco();
		banco1.operar();
		banco1.depositosTotales();
	}
}

//Un banco tiene 3 clientes que pueden hacer dep�sitos y extracciones. Tambi�n el banco
//requiere que al final del d�a calcule la cantidad de dinero que hay depositada.