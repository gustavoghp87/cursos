import javax.swing.*;
import java.awt.event.*;
public class java012_01 extends JFrame implements ActionListener
{
	private JTextField textfield1;
	private JLabel label1;
	private JButton boton1;
	public java012_01()
	{
		setLayout(null);
		label1 = new JLabel("Ingrese usuario:");
		label1.setBounds(10,10,100,30);
		add(label1);
		textfield1 = new JTextField();
		textfield1.setBounds(120,15,150,25);
		add(textfield1);
		boton1 = new JButton("Aceptar");
		boton1.setBounds(10,80,100,30);
		add(boton1);
		boton1.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent evento)
	{
		if (evento.getSource()==boton1)
		{
			String escrito = textfield1.getText();
			setTitle(escrito);
		}
	}
	
	public static void main(String[] ar)
	{
		java012_01 formulario1=new java012_01();
		formulario1.setBounds(0,0,350,170);
		formulario1.setVisible(true);
	}
}

//Confeccionar un programa que permita ingresar el nombre de usuario y cuando se presione un
//botón mostrar el valor ingresado en la barra de títulos del JFrame.