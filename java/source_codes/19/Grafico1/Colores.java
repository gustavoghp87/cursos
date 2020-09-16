package Grafico1;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class Colores extends JFrame {

 private JPanel contentPane;
 
 public static void main(String[] args) {
	 EventQueue.invokeLater(new Runnable() {
		 public void run() {
			 try {
				 Colores frame = new Colores();
				 frame.setVisible(true);
			 } catch (Exception e) {
				 e.printStackTrace();
			 }
		 }
	 });
 }
 
 public Colores() {
	 setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	 setBounds(100, 100, 450, 300);
	 contentPane = new JPanel();
	 contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
	 contentPane.setLayout(new BorderLayout(0, 0));
	 setContentPane(contentPane);
	 setBounds(0,0,800,765);
 }

 public void paint (Graphics g) {
	 super.paint(g);
	 int fila = 0;
	 for (int rojo = 0 ; rojo <= 255 ; rojo++) {
		 Color col = new Color (rojo, 0, 0);
		 g.setColor (col);
		 g.drawLine (0, fila, 800, fila);
		 fila++;
	 }
	 for (int verde = 0 ; verde <= 255 ; verde++) {
		 Color col = new Color (0, verde, 0);
		 g.setColor (col);
		 g.drawLine (0, fila, 800, fila);
		 fila++;
	 }
	 for (int azul = 0 ; azul <= 255 ; azul++) {
		 Color col = new Color (0, 0, azul);
		 g.setColor (col);
		 g.drawLine (0, fila, 800, fila);
		 fila++;
	 }
 }
}

//En la clase Color existen constantes para colores predeterminados de uso frecuente:
// black, white, green, blue, red, yellow, magenta, cyan, orange, pink, gray, darkGray, lightGray
