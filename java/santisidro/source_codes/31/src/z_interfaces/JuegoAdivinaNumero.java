package z_interfaces;
import java.util.Scanner;

public class JuegoAdivinaNumero implements Juego {
	
	private int numAdivina;
	private Scanner teclado;
	private int intentos;

	public void iniciar() {
		numAdivina = 1 + (int) (Math.random() * 100);
	}

	public void jugar() {
		int numero;
		teclado = new Scanner(System.in);
		do {
			System.out.print("Adivina un n�mero entre 1 y 100: ");
			numero = teclado.nextInt();
			if (numAdivina < numero)
				System.out.println("El n�mero a adivinar es menor");
			else if (numAdivina > numero)
				System.out.println("El n�mero a adivinar es mayor");
			intentos++;
		} while (numero != numAdivina);
	}

	public void finalizar() {
		 System.out.println("Ganaste luego de " +intentos +" intentos");		
	}

}
