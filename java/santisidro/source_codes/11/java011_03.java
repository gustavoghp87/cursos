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

//Crear una ventana de 1024 píxeles por 800 píxeles. Luego no permitir que el operador
//modifique el tamaño de la ventana. Sabiendo que hacemos visible al JFrame llamando
//al método setVisible pasando el valor true, existe otro método llamado setResizable que
//también requiere como parámetro un valor true o false.