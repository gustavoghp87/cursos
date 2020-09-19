public class java010_02_Dado {
	private int valor;
	
	public void tirar() {
		valor=1+(int)(Math.random()*6);
	}
	
	public void imprimir() {
		System.out.println("El valor del dado es:"+valor);
	}
	
	public int retornarValor() {
		return valor;
	}
}