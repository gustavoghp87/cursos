import javax.swing.*;
import javax.swing.event.*;
import java.awt.event.*;
public class java013_08 extends JFrame implements ChangeListener
{
	private JRadioButton radio1,radio2;
	private ButtonGroup bg;
	private JTextField camp1, camp2;
	private JLabel etiq1, etiq2;
	public java013_08()
	{
		setLayout(null);
		etiq1 = new JLabel("Ingrese número uno:");
		etiq1.setBounds(10,10,150,30);
		add(etiq1);
		etiq2 = new JLabel("Ingrese número dos:");
		etiq2.setBounds(10,40,150,30);
		add(etiq2);
		
		camp1 = new JTextField();
		camp1.setBounds(140,15,120,25);
		add(camp1);
		camp2 = new JTextField();
		camp2.setBounds(140,40,120,25);
		add(camp2);
		bg = new ButtonGroup();
		
		radio1 = new JRadioButton("SUMAR");
		radio1.setBounds(10,90,100,30);
		radio1.addChangeListener(this);
		add(radio1);
		bg.add(radio1);
		
		radio2 = new JRadioButton("RESTAR");
		radio2.setBounds(10,130,100,30);
		radio2.addChangeListener(this);
		add(radio2);
		bg.add(radio2);
	}
	public void stateChanged(ChangeEvent e)
	{
		String cad1 = camp1.getText();
		String cad2 = camp2.getText();
		int n1 = Integer.parseInt(cad1);
		int n2 = Integer.parseInt(cad2);
		
		if (radio1.isSelected())
		{
			int suma = n1 + n2;
			setTitle("Resultado de la suma: " +suma);
		}
		if (radio2.isSelected())
		{
			int resta = n1 - n2;
			setTitle("Resultado de la resta: " +resta);
		}
	}
	public static void main(String[] ar)
	{
		java013_08 formulario1=new java013_08();
		formulario1.setBounds(0,0,350,230);
		formulario1.setVisible(true);
	}
	
}

// Permitir el ingreso de dos números en controles de tipo JTextField y mediante dos
// controles de tipo JRadioButton permitir seleccionar si queremos sumarlos o restarlos. Al
// presionar un botón mostrar en el título del JFrame el resultado de la operación.