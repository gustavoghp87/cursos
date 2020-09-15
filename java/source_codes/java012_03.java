import javax.swing.*;
import java.awt.event.*;
public class java012_03 extends JFrame implements ActionListener {
	private JLabel label1, label2;
	private JTextField field1, field2;
	private JButton button1;
	public java012_03() {
		setLayout(null);		
		label1 = new JLabel("Usuario: ");
		label1.setBounds(10, 10, 70, 20);
		add(label1);
		label2 = new JLabel("Password: ");
		label2.setBounds(10, 50, 70, 20);
		add(label2);
		field1 = new JTextField();
		field1.setBounds(85, 10, 150, 25);
		add(field1);
		field2 = new JTextField();
		field2.setBounds(85, 50, 150, 25);
		add(field2);
		button1 = new JButton("Log in!");
		button1.setBounds(20, 100, 220, 30);
		add(button1);
		button1.addActionListener(this);
	}
	public void actionPerformed(ActionEvent evento) {
		if (evento.getSource()==button1) {
			String cad1 = field1.getText();
			String cad2 = field2.getText();
			if (cad1.equals("juan@gmail.com")==true && cad2.equals("abc123")==true) {
			setTitle("Correcto");
			} else {
			setTitle("Incorrecto");
			}
		}
	}
	public static void main(String[]ar) {
		java012_03 j2=new java012_03();
		j2.setBounds(30,60,280,200);
		j2.setVisible(true);
	}
}

// Ingresar el nombre de usuario y clave en controles de tipo JTextField. Si se ingresa las
// cadena (usuario: "juan", clave: "abc123") luego mostrar en el título del JFrame el mensaje
// "Correcto" en caso contrario mostrar el mensaje "Incorrecto".