package Grafico1;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Repaint extends JFrame {
 private JPanel contentPane;

 private int columna;

 public static void main(String[] args) {
	 EventQueue.invokeLater(new Runnable() {
		 public void run() {
			 try {
				 Repaint frame = new Repaint();
				 frame.setVisible(true);
			 } catch (Exception e) {
				 e.printStackTrace();
			 }
		 }
	 });
 } 

 public Repaint() {
	 setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	 setBounds(100, 100, 450, 300);
	 contentPane = new JPanel();
	 contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
	 setContentPane(contentPane);
	 contentPane.setLayout(null);
	 
	 columna = 400;

	 JButton bi = new JButton("Izquierda");
	 bi.addActionListener(new ActionListener() {
		 public void actionPerformed(ActionEvent arg0) {
			 columna = columna-10;
			 repaint();
		 }
	 });
	 bi.setBounds(105, 482, 89, 23);
	 contentPane.add(bi);
	
	 JButton bd = new JButton("Derecha");
	 bd.addActionListener(new ActionListener() {
		 public void actionPerformed(ActionEvent e) {
			 columna = columna+10;
			 repaint();
		 }
	 });
	 bd.setBounds(556, 482, 89, 23);
	 contentPane.add(bd);
	 setBounds(0,0,800,600);
 }
	
 public void paint (Graphics g) {
	 super.paint(g);
	 g.setColor (Color.red);
	 g.fillOval (columna, 300, 100, 100);
 }
 
}

//el método repaint borra todo lo dibujado dentro del JFrame y llama al paint