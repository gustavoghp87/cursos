import javax.swing.*;
import java.awt.event.*;
public class java012_06 extends JFrame implements ActionListener
{
	private JScrollPane scrollpane1;
	private JTextArea textarea1;
	private JButton boton1;
	public java012_06()
	{
		setLayout(null);
		textarea1 = new JTextArea();
		scrollpane1 = new JScrollPane(textarea1);
		scrollpane1.setBounds(10,10,300,200);
		add(scrollpane1);
		boton1 = new JButton("Verificar");
		boton1.setBounds(10,260,100,30);
		add(boton1);
		boton1.addActionListener(this);
		System.out.print("Hola \"mundo\"");
	}

	public void actionPerformed(ActionEvent evento)
	{
		if (evento.getSource()==boton1)
		{
			String texto = textarea1.getText();
			if (texto.indexOf("argentina")!=-1 || texto.indexOf("Argentina")!=-1 || texto.indexOf("ARGENTINA")!=-1) {
				setTitle("Sí contiene el texto \"argentina\"");
			} else {
				setTitle("No contiene el texto \"argentina\"");
			}
		}
	}

	public static void main(String[] ar) {
		java012_06 formulario1=new java012_06();
		formulario1.setBounds(0,0,400,380);
		formulario1.setVisible(true);
	}
}

// Confeccionar un programa que permita ingresar en un control de tipo JTextArea una carta.
// Luego, al presionar un botón, mostrar un mensaje si la carta contiene el String "argentina"