import javax.swing.*;
	public class Formulario4 extends JFrame {
		private JLabel label1,label2;
		public Formulario4() {
			setLayout(null);
			label1=new JLabel("Sistema de Facturación.");
			label1.setBounds(10,20,300,30);
			add(label1);
			label2=new JLabel("Vesion 1.0");
			label2.setBounds(10,100,100,30);
			add(label2);
		}
		public static void main(String[] ar) {
			Formulario4 form=new Formulario4();
			form.setBounds(0,0,300,200);
			form.setResizable(false);
			form.setVisible(true);
		}
}

//Confeccionar una ventana que muestre el nombre de un programa en la parte superior y su n° de
//versión en la parte inferior. No permitir modificar el tamaño de la ventana en tiempo de ejecución.