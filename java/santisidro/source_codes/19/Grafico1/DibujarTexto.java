package Grafico1;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class DibujarTexto extends JFrame {
 private JPanel contentPane;
 
 public static void main(String[] args) {
	 EventQueue.invokeLater(new Runnable() {
		 public void run() {
			 try {
				 DibujarTexto frame = new DibujarTexto();
				 frame.setVisible(true);
			 } catch (Exception e) {
				 e.printStackTrace();
			 }
		 } 
	 });
 }
 
 public DibujarTexto() {
	 setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	 setBounds(100, 100, 450, 300);
	 contentPane = new JPanel();
	 contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
	 contentPane.setLayout(new BorderLayout(0, 0));
	 setContentPane(contentPane);
	 setBounds(0,0,800,600);
 }

 public void paint (Graphics g) {
	 super.paint(g);
	 g.setColor (Color.blue);
	 g.drawString("Primera linea", 50, 200);
	 g.drawString("Segunda linea", 10, 300);
 }
 
} 
