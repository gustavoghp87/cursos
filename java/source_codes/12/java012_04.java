import javax.swing.*;
public class java012_04 extends JFrame
{
	private JTextField textfield1;
	private JTextArea textarea1;
	
	public java012_04()
	{
		setLayout(null);
		textfield1 = new JTextField();
		textfield1.setBounds(10,10,200,30);
		add(textfield1);
		textarea1 = new JTextArea();
		textarea1.setBounds(10,50,400,300);
		add(textarea1);
	}
	
	public static void main(String[] ar)
	{
		java012_04 formulario1=new java012_04();
		formulario1.setBounds(0,0,540,400);
		formulario1.setVisible(true);
	}
}

// Confeccionar un programa que permita ingresar un mail en un control de tipo JTextField y el
// cuerpo del mail en un control de tipo JTextArea