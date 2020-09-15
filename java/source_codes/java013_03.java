import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class java013_03 extends JFrame implements ActionListener
{
	private JMenuBar mb;
	private JMenu menu1, menu2, menu3;
	private JMenuItem mi1, mi2, mi3, mi4;
	private JTextField text1, text2;
	private JLabel label1, label2;
	private JButton boton1;
	
	public java013_03()
	{
		setLayout(null);
		mb = new JMenuBar();
		setJMenuBar(mb);
		menu1 = new JMenu("Opciones...");
		mb.add(menu1);
	
		menu2 = new JMenu("Tamaño de la ventana");
		menu1.add(menu2);
	
		menu3=new JMenu("Color de fondo");
		menu1.add(menu3);
	
		mi1=new JMenuItem("640*480");
		menu2.add(mi1);
		mi1.addActionListener(this);
		mi2=new JMenuItem("Redimensionar");
		menu2.add(mi2);
		mi2.addActionListener(this);
		mi3=new JMenuItem("Rojo");
		menu3.add(mi3);
		mi3.addActionListener(this);
		mi4=new JMenuItem("Verde");
		menu3.add(mi4);
		mi4.addActionListener(this);
		
		label1 = new JLabel("Ingrese ancho:");
		label1.setBounds(10,10,150,30);
		add(label1);
		label1 = new JLabel("Ingrese alto:");
		label1.setBounds(10,40,150,30);
		add(label1);
		
		text1 = new JTextField();
		text1.setBounds(140,15,120,25);
		add(text1);
		text2 = new JTextField();
		text2.setBounds(140,40,120,25);
		add(text2);
		
		boton1 = new JButton("Cerrar");
		boton1.setBounds(60,80,200,30);
		add(boton1);
		boton1.addActionListener(this);
	}

	public void actionPerformed(ActionEvent e)
	{
		if (e.getSource()==mi1)
		{setSize(640,480);}
		
		if (e.getSource()==mi2)
		{
			String text1n = text1.getText();
			String text2n = text2.getText();
			int ancho = Integer.parseInt(text1n);
			int alto = Integer.parseInt(text2n);
			setSize(ancho,alto);
		}
		
		if (e.getSource()==mi3)
		{getContentPane().setBackground(new Color(255,0,0));}
		if (e.getSource()==mi4)
		{getContentPane().setBackground(new Color(0,255,0));}
		
		if (e.getSource()==boton1)
		{
			System.exit(0);
		}
	}

	public static void main(String[]ar)
	{
		java013_03 jv=new java013_03();
		jv.setBounds(0,0,300,200);
		jv.setVisible(true);
	}
}

// Mediante dos controles de tipo JTextField permitir el ingreso de dos números. Crear un
// menú que contenga una opción que redimensione el JFrame con los valores ingresados
// por teclado. Finalmente disponer otra opción que finalice el programa (Finalizamos un
// programa java llamando al método exit de la clase System: System.exit(0))