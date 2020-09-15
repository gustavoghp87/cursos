import javax.swing.*;
import java.awt.event.*;
public class java012_08 extends JFrame implements ItemListener
{
	private JComboBox combo1;
	
	public java012_08()
	{
		setLayout(null);
		combo1 = new JComboBox();
		combo1.setBounds(10,10,80,20);
		add(combo1);
		combo1.addItem("rojo ");
		combo1.addItem("verde ");
		combo1.addItem("azul ");
		combo1.addItem("amarillo ");
		combo1.addItem("negro ");
		combo1.addItemListener(this);
	}
	
	public void itemStateChanged(ItemEvent e)
	{
		if (e.getSource()==combo1)
		{
			String seleccionado = (String)combo1.getSelectedItem();
			setTitle(seleccionado);
			System.out.print(seleccionado);
		}
	}
	
	public static void main(String[] ar)
	{
		java012_08 formulario1=new java012_08();
		formulario1.setBounds(0,0,300,150);
		formulario1.setVisible(true);
	}
}

// Cargar en un JComboBox los nombres de varios colores. Al seleccionar alguno mostrar en la
// barra de título del JFrame el String seleccionado.