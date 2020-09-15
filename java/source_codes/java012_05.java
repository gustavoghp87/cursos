import javax.swing.*;
public class java012_05 extends JFrame
{
	private JTextField textfield1;
	private JScrollPane scrollpane1;
	private JTextArea textarea1;
	public java012_05()
	{
		setLayout(null);
		textfield1 = new JTextField();
		textfield1.setBounds(10,10,200,30);
		add(textfield1);
		textarea1 = new JTextArea();
		scrollpane1 = new JScrollPane(textarea1);
		scrollpane1.setBounds(10,50,400,300);
		add(scrollpane1);
	}
	public static void main(String[] ar)
	{
		java012_05 formulario1=new java012_05();
		formulario1.setBounds(0,0,540,400);
		formulario1.setVisible(true);
	}
}

//El inconveniente que tiene este control es que si ingresamos más texto que el que puede
//visualizar no aparecen las barras de scroll y no podemos ver los caracteres tipeados.
//Para salvar el problema anterior debemos crear un objeto de la clase JScrollPane y añadir en
//su interior el objeto de la clase JTextArea, luego el programa definitivo es el siguiente: