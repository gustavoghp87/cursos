package z_interfaces;

public class PruebaDeJuegos {
	 
	 public static void main(String[] args) {
		 JuegoDeDados juego1 = new JuegoDeDados();
		 juego1.iniciar();
		 juego1.jugar();
		 juego1.finalizar();
		 
		 JuegoAdivinaNumero juego2 = new JuegoAdivinaNumero();
		 juego2.iniciar();
		 juego2.jugar();
		 juego2.finalizar();
	 }

}
