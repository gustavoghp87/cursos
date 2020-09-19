import javax.swing.*;
import java.awt.Color;
import java.awt.event.*;
public class java012_11 extends JFrame implements ActionListener
{
	private JLabel label1, label2;
	private JComboBox combo2;
	private JTextField field1;
	private JButton boton1;
	public java012_11()
	{
		int x = 15;
		setLayout(null);
		label1 = new JLabel("Ingrese nombre: ");
		label1.setBounds(10+x, 10, 110, 30);
		add(label1);
		field1 = new JTextField();
		field1.setBounds(150, 10, 150, 30);
		add(field1);
		
		label2 = new JLabel("Ingrese país: ");
		label2.setBounds(10+x, 50, 110, 30);
		add(label2);
		combo2 = new JComboBox();
		combo2.setBounds(150, 50, 150, 30);
		add(combo2);
		combo2.addItem("Argentina");
		combo2.addItem("Brasil");
		combo2.addItem("Chile");
		combo2.addItem("Colombia");
		
		boton1 = new JButton("Aceptar");
		boton1.setBounds(60, 110, 190, 50);
		add(boton1);
		Color color1 = new Color(100,225,25);
		boton1.setBackground(color1);
		
		boton1.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent e)
	{
		if (e.getSource()==boton1)
		{
			String nombre = field1.getText();
			String pais = (String)combo2.getSelectedItem();
			setTitle(nombre +" de " +pais);
		}
	}
	
	public static void main(String[]ar)
	{
		java012_11 f1=new java012_11();
		f1.setBounds(0,0,350,220);
		f1.setVisible(true);
	}
}

// Solicitar el ingreso del nombre de una persona y seleccionar de un control JComboBox
// un país. Al presionar un botón mostrar en la barra del título del JFrame el nombre
// ingresado y el país seleccionado.