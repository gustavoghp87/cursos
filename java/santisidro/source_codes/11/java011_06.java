import javax.swing.*;
import java.awt.event.*;
public class Formulario6 extends JFrame implements ActionListener {
	JButton boton1;
	public Formulario6() {
	setLayout(null);
	boton1 = new JButton("Finalizar");
	boton1.setBounds(300,250,100,30);
	add(boton1);
	boton1.addActionListener(this);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == boton1) {
			System.exit(0);
		}
	}

	public static void main(String[] ar) {
		Formulario6 formulario1=new Formulario6();
		formulario1.setBounds(0,0,450,350);
		formulario1.setVisible(true);
	}
}

//Ahora veremos la captura de eventos con los controles visuales. Uno de los eventos más
//comunes es cuando hacemos clic sobre un botón.

//Java implementa el concepto de interfaces para poder llamar a métodos de una clase existente
//a una clase desarrollada por nosotros.

//Confeccionar una ventana que muestre un botón. Cuando se presione finalizar la ejecución del
//programa Java.



//La mecánica para atrapar el clic del objeto de la clase JButton se hace mediante la
//implementación de una interface. Una interface es un protocolo que permite la comunicación


