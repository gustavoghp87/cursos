
public class Cliente {
	 String nombre;
	 float monto;
	 
	 public Cliente(String nombre, float monto) {
		 this.nombre = nombre;
		 this.monto = monto;
	 }
	 
	 public void depositar(float importe) {
		 monto = monto + importe;
	 }
	 
	 public void extraer(float importe) throws Exception {
		 if (importe > monto)
			 throw new Exception("No se puede extraer más dinero que el depositado.");
		 monto = monto - importe;
	 }
	 
	 public void imprimir() {
		 System.out.println(nombre + " tiene " + monto);
	 }
	 
	 public static void main(String[] args) {
		 Cliente cliente1 = new Cliente("Pedro", 10000);
		 cliente1.imprimir();
		 cliente1.depositar(2000);
		 cliente1.imprimir();
		 try {
			 cliente1.extraer(5000);
			 cliente1.imprimir();
			 cliente1.extraer(3000);
			 cliente1.imprimir();
			 cliente1.extraer(70000);
			 cliente1.imprimir();
		 } catch (Exception ex) {
			 System.out.println(ex.getMessage());
		 }
	 }
}

// Declarar una clase 'Cliente' que represente un cliente de un banco. Definir los siguientes atributos y métodos:
// Cliente, atributos: nombre, monto, métodos, constructor, depositar, extraer, imprimir
// Generar una excepción si se intenta extraer más dinero del que tiene el atributo 'monto'.