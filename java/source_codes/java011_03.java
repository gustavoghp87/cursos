import javax.swing.*;
	public class Formulario3 extends JFrame{
		Formulario3() {
			setLayout(null);
		}
		public static void main(String[] ar) {
			Formulario3 form=new Formulario3();
			form.setBounds(10,10,1024,600);
			form.setResizable(false);           //fija ventana
			form.setVisible(true);
		}
}

//Crear una ventana de 1024 p�xeles por 800 p�xeles. Luego no permitir que el operador
//modifique el tama�o de la ventana. Sabiendo que hacemos visible al JFrame llamando
//al m�todo setVisible pasando el valor true, existe otro m�todo llamado setResizable que
//tambi�n requiere como par�metro un valor true o false.