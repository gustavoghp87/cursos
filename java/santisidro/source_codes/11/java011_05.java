import javax.swing.*;
public class Formulario5 extends JFrame {
	private JLabel label1,label2,label3;
	
	public Formulario5() {
		setLayout(null);
		
		label1 = new JLabel("Rojo");
		label1.setBounds(10,20,100,30);
		add(label1);
		
		label2 = new JLabel("Verde");
		label2.setBounds(10,60,100,30);
		add(label2);
		
		label3 = new JLabel("Azul");
		label3.setBounds(10,100,100,30);
		add(label3);
		}
	
		public static void main(String[] ar) {
		Formulario5 form=new Formulario5();
		form.setBounds(0,0,300,200);
		form.setVisible(true);
		}
}

//Crear tres objetos de la clase JLabel, ubicarlos uno debajo de otro y mostrar nombres
//de colores.