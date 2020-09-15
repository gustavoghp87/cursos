import javax.swing.*;
	
	public class Formulario2 extends JFrame {
	
		public Formulario2() {
			setLayout(null);
		}
		
		public static void main(String[] ar) {
			Formulario2 form=new Formulario2();
			form.setBounds(10,20,400,300);
			form.setVisible(true);
		}
}

//Lo m�s correcto es plantear una clase que herede de la clase JFrame y extienda sus
//responsabilidades agregando botones, etiquetas, editores de l�nea etc.
//Entonces la estructura b�sica que emplearemos para crear una interfaz visual ser�...
	
//En el constructor indicamos que ubicaremos los controles visuales con coordenadas absolutas
//mediante la desactivaci�n del Layout heredado (m�s adelante veremos otras formas de ubicar
//los controles visuales dentro del JFrame)
	
//El m�todo setBounds ubica el JFrame (la ventana) en la columna 10, fila 20 con un ancho de
//400 p�xeles y un alto de 300.
//Debemos llamar al m�todo setVisible y pasarle el valor true para que se haga visible la ventana.