import javax.swing.*;
import java.awt.event.*;

public class Formulario extends JFrame implements ActionListener {
 private JTextField textfield1, textfield2;
 private JButton boton1;
 public Formulario() {
	 setLayout(null);
	 
	 textfield1 = new JTextField();
	 textfield1.setBounds(120, 10, 150, 20);
	 add(textfield1);
	 
	 textfield2 = new JTextField();
	 textfield2.setBounds(120, 40, 150, 20);
	 add(textfield2);
	 
	 boton1 = new JButton("Dividir");
	 boton1.setBounds(10, 80, 100, 30);
	 add(boton1);
	 boton1.addActionListener(this);
 }

 public void actionPerformed(ActionEvent e) {
	 if (e.getSource() == boton1) {
		 String cad1 = textfield1.getText();
		 String cad2 = textfield2.getText();
		 try {
			 int valor1 = Integer.parseInt(cad1);
			 int valor2 = Integer.parseInt(cad2);
			 int resultado = valor1 / valor2;
			 int sobra = valor1 % valor2;
			 setTitle("La divisi�n de " + cad1 + " con respecto a " + cad2 + " es " + resultado + " sobra " + sobra);
		 } catch (NumberFormatException ex) {
			 setTitle("Debe ingresar n�meros enteros.");
		 } catch (ArithmeticException ex) {
			 setTitle("No se puede dividir por cero.");
		 }
	 }
 }
 
 public static void main(String[] ar) {
	 Formulario formulario1 = new Formulario();
	 formulario1.setBounds(0, 0, 450, 170);
	 formulario1.setDefaultCloseOperation(EXIT_ON_CLOSE);
	 formulario1.setVisible(true);
 }
}
