
public class Operaciones {
	 private int valor1;
	 private int valor2;

	 public Operaciones(int valor1,int valor2) {
		 this.valor1=valor1;
		 this.valor2=valor2;
	 }

	 public void sumar() {
		 int suma = valor1+valor2;
		 System.out.println("La suma es " +suma);
	 }

	 public void restar() {
		 int resta = valor1-valor2;
		 System.out.println("La resta es " +resta);
	 }
	 
	 public void multiplicar() {
		 int producto = valor1*valor2;
		 System.out.println("El producto es " +producto);
	 }

	 public void dividir() throws Exception {
		 if (valor2==0)
			 throw new Exception("No se puede dividir por cero");
		 int division = valor1/valor2;
		 System.out.println("La división es " +division);
	 }


	 public static void main(String[] args) {
		 Operaciones operaciones1 = new Operaciones(10,0);
		 operaciones1.sumar();
		 operaciones1.restar();
		 operaciones1.multiplicar();
		 try {
			 operaciones1.dividir();
		 } catch (Exception ex) {
			 System.out.println(ex.getMessage());
		 }
	 }
}

// Implementar la clase Operaciones. Debe tener dos atributos enteros. Desarrollar los métodos
//  para calcular su suma, resta, multiplicación y división, imprimir dichos resultados. Lanzar una
//  excepción en el método que calcula la división si el segundo valor es cero.