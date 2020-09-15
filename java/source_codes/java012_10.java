import javax.swing.*;
import java.awt.*;   // contiene la clase Color()
import java.awt.event.*;
public class java012_10 extends JFrame implements ItemListener
{
	private JLabel label1, label2, label3;
	private JComboBox combo1, combo2, combo3;
	private JButton boton1;
	public java012_10()
	{
		int x = 15;
		setLayout(null);
		label1 = new JLabel("Rojo:");
		label1.setBounds(10+x,10,100,30);
		add(label1);
		combo1 = new JComboBox();
		combo1.setBounds(120,10,50,30);
		for (int f=0; f<=5; f++)
		{
			combo1.addItem(String.valueOf(f*50));
		}
		add(combo1);
		
		label2 = new JLabel("Verde:");
		label2.setBounds(10+x,50,100,30);
		add(label2);
		combo2 = new JComboBox();
		combo2.setBounds(120,50,50,30);
		for (int f=0; f<=255; f++)
		{
			combo2.addItem(String.valueOf(f));
		}
		add(combo2);
		label3 = new JLabel("Azul:");
		label3.setBounds(10+x,90,100,30);
		add(label3);
		combo3 = new JComboBox();
		combo3.setBounds(120,90,50,30);
		for(int f=0;f<=255;f++)
		{
			combo3.addItem(String.valueOf(f));
		}
		add(combo3);
		
		boton1 = new JButton("");
		boton1.setBounds(15,150,200,50);
		add(boton1);
		combo1.addItemListener(this);
		combo2.addItemListener(this);
		combo3.addItemListener(this);
	}
	
	public void itemStateChanged(ItemEvent e)
	{
		if (e.getSource()==combo1 || e.getSource()==combo2 || e.getSource()==combo3)
		{
			String cad1 = (String)combo1.getSelectedItem();
			String cad2 = (String)combo2.getSelectedItem();
			String cad3 = (String)combo3.getSelectedItem();
			int rojo = Integer.parseInt(cad1);
			int verde = Integer.parseInt(cad2);
			int azul = Integer.parseInt(cad3);
			Color color1 = new Color(rojo,verde,azul);
			boton1.setBackground(color1);
		}
	}
	
	public static void main(String[] ar)
	{
		java012_10 formulario1=new java012_10();
		formulario1.setBounds(0,0,250,300);
		formulario1.setVisible(true);
	}
}

// Disponer tres controles de tipo JComboBox con valores entre 0 y 255 (cada uno representa la
// cantidad de rojo, verde y azul). Luego al presionar un botón pintar el mismo con el color que se
// genera combinando los valores de los JComboBox.