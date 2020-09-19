import javax.swing.*;
import java.awt.event.*;
public class Formulario8 extends JFrame implements ActionListener {
	private JButton boton1,boton2;
	
	public Formulario8() {
		setLayout(null);
		
		boton1=new JButton("Varón");
		boton1.setBounds(10,10,100,30);
		boton1.addActionListener(this);
		add(boton1);
		
		boton2=new JButton("Mujer");
		boton2.setBounds(10,70,100,30);
		boton2.addActionListener(this);
		add(boton2);
	}
	
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == boton1) {
			setTitle("Varón");
		}
		if (e.getSource() == boton2) {
			setTitle("Mujer");
		}
	}

	public static void main(String[] ar) {
		Formulario8 formulario1=new Formulario8();
		formulario1.setBounds(0,0,330,340);
		formulario1.setVisible(true);
	}
}

//Disponer dos objetos de la clase JButton con las etiquetas: "varón" y "mujer", al
//presionarse mostrar en la barra de títulos del JFrame la etiqueta del botón presionado