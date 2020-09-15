import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
public class java012_02 extends JFrame implements ActionListener
{
	private JTextField textfield1, textfield2;
	private JLabel label1, label2;
	private JButton boton1;
	public java012_02()
	{
		setLayout(null);
		label1 = new JLabel("Ingrese número 1:");
		label1.setBounds(10,10,150,30);
		add(label1);
		label1 = new JLabel("Ingrese número 2:");
		label1.setBounds(10,40,150,30);
		add(label1);
		
		textfield1 = new JTextField();
		textfield1.setBounds(140,15,120,25);
		add(textfield1);
		textfield2 = new JTextField();
		textfield2.setBounds(140,40,120,25);
		add(textfield2);
		
		boton1 = new JButton("Sumar");
		boton1.setBounds(60,80,200,30);
		add(boton1);
		boton1.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent evento)
	{
		if (evento.getSource()==boton1)
		{
			String text1 = textfield1.getText();
			String text2 = textfield2.getText();
			int n1 = Integer.parseInt(text1);
			int n2 = Integer.parseInt(text2);
			int suma = n1 + n2;
			String sumado = String.valueOf(suma);
			setTitle(sumado);
		}
	}
	
	public static void main(String[] ar)
	{
		java012_02 formulario1=new java012_02();
		formulario1.setBounds(0,0,320,170);
		formulario1.setVisible(true);
	}
}

//Confeccionar un programa que permita ingresar dos números en controles de tipo JTextField,
//luego sumar los dos valores ingresados y mostrar la suma en la barra del título del control JFrame.