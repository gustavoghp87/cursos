import javax.swing.*;
import java.awt.event.*;

public class java013_06 extends JFrame implements ActionListener
{
	private JTextField camp1, camp2;
	private JLabel etiq1, etiq2;
	private JMenuBar mb;
	private JMenu menu1;
	private JMenuItem mi1, mi2;

	public java013_06()
	{
		setLayout(null);
		etiq1 = new JLabel("Ingrese ancho:");
		etiq1.setBounds(10,10,150,30);
		add(etiq1);
		etiq2 = new JLabel("Ingrese alto:");
		etiq2.setBounds(10,40,150,30);
		add(etiq2);
		
		camp1 = new JTextField();
		camp1.setBounds(140,15,120,25);
		add(camp1);
		camp2 = new JTextField();
		camp2.setBounds(140,40,120,25);
		add(camp2);
		
		mb = new JMenuBar();
		setJMenuBar(mb);
		menu1 = new JMenu("Opciones");
		mb.add(menu1);
		
		mi1=new JMenuItem("Redimensionar ventana");
		menu1.add(mi1);
		mi1.addActionListener(this);
		mi2=new JMenuItem("Cerrar");
		menu1.add(mi2);
		mi2.addActionListener(this);
		
	}
	public void actionPerformed(ActionEvent e)
	{
		if (e.getSource()==mi1)
		{
			String text1n = camp1.getText();
			String text2n = camp2.getText();
			int ancho = Integer.parseInt(text1n);
			int alto = Integer.parseInt(text2n);
			setSize(ancho,alto);
		}
		if (e.getSource()==mi2)	{System.exit(0);}
	}
	
	public static void main(String[]args)
	{
		java013_06 jv=new java013_06();
		jv.setBounds(0,0,350,200);
		jv.setVisible(true);
	}
}

// Mediante dos controles de tipo JTextField permitir el ingreso de dos números. Crear un
// menú que contenga una opción que redimensione el JFrame con los valores ingresados
// por teclado. Finalmente disponer otra opción que finalice el programa (Finalizamos un
// programa java llamando al método exit de la clase System: System.exit(0))