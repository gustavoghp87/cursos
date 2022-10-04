package com.anonimas;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

public class FormularioBoton extends JFrame {
	 
	 private JButton boton1;
	 public FormularioBoton() {
		 setLayout(null);
		 boton1 = new JButton("0");
		 boton1.setBounds(40, 20, 100, 50);
		 add(boton1);
		 
		 // Al método addActionListener le pasamos la referencia de un objeto de una clase anónima
		 //  que implementa la interfaz ActionListener
		 
		 boton1.addActionListener(new ActionListener() {
			 public void actionPerformed(ActionEvent e) {
				 int valor = Integer.parseInt(boton1.getText());
				 valor++;
				 boton1.setText(String.valueOf(valor));
			 }
		 });
	 }
	 
	 public static void main(String[] args) {
		 FormularioBoton fb = new FormularioBoton();
		 fb.setBounds(0, 0, 200, 120);
		 fb.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		 fb.setVisible(true);
	 }
}


// VERSUS

//public FormularioBoton() {
//	 setLayout(null);
//	 boton1 = new JButton("0");
//	 boton1.setBounds(40, 20, 100, 50);
//	 add(boton1);
//	 boton1.addActionListener(new EscuchaPresionBoton());
//}

//class EscuchaPresionBoton implements ActionListener {
//	 public void actionPerformed(ActionEvent e) {
//		 int valor = Integer.parseInt(boton1.getText());
//		 valor++;
//		 boton1.setText(String.valueOf(valor));
//	 }
//}
