import javax.swing.*;
import java.awt.event.*;
public class Formulario8 extends JFrame implements ActionListener {
	private JButton boton1,boton2;
	
	public Formulario8() {
		setLayout(null);
		
		boton1=new JButton("Var�n");
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
			setTitle("Var�n");
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

//Disponer dos objetos de la clase JButton con las etiquetas: "var�n" y "mujer", al
//presionarse mostrar en la barra de t�tulos del JFrame la etiqueta del bot�n presionado