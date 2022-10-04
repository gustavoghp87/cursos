package segundaParte;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Laberinto extends JFrame implements ActionListener {
	 JLabel[][] l;
	 JButton b1;
	 JButton b2;
	 boolean salida;

	 Laberinto() {
		 setLayout(null);
		 l = new JLabel[10][10];
		 for(int f=0; f<10; f++) {
			 for(int c=0; c<10; c++) {
				 l[f][c]=new JLabel();
				 l[f][c].setBounds(20+c*20, 50+f*20, 20, 20);
				 add(l[f][c]);
			 }
		 }
		 b1=new JButton("Recorrer");
		 b1.setBounds(10,300,100,25);
		 add(b1);
		 b1.addActionListener(this);
		 b2=new JButton("Crear");
		 b2.setBounds(120,300,100,25);
		 add(b2);
		 b2.addActionListener(this);
		 crear();
	 }

	 public void crear() {
		 for(int f=0; f<10; f++) {
			 for(int c=0 ;c<10; c++) {
				 int a = (int)(Math.random()*4);
				 l[f][c].setForeground(Color.black);
				 if (a==0)
					 l[f][c].setText("1");
				 else
					 l[f][c].setText("0");
			 }
		 }
		 l[9][9].setText("s"); 
		 l[0][0].setText("0");
	 }

	 public void recorrer(int fil,int col) {
		 if (fil>=0 && fil<10 && col>=0 && col<10 && salida==false) {
			 if (l[fil][col].getText().equals("s"))
				 salida=true;
			 else
				 if (l[fil][col].getText().equals("0")) {
					 l[fil][col].setText("9");
					 l[fil][col].setForeground(Color.red);
					 recorrer(fil,col+1);
					 recorrer(fil+1,col);
					 recorrer(fil-1,col);
					 recorrer(fil,col-1);
				 }
		 }
	 }

	 public void actionPerformed(ActionEvent e) {
		 if (e.getSource()==b1) {
			 salida=false;
			 recorrer(0,0);
			 if (salida)
				 setTitle("tiene salida");
			 else
				 setTitle("no tiene salida");
		 }
		 if (e.getSource()==b2)
			 crear();
	 }

	 public static void main(String[] ar) {
		 Laberinto l = new Laberinto();
		 l.setBounds(0,0,300,400);
		 l.setVisible(true);
	 }
} 



// Desarrollar un programa que permita recorrer un laberinto e indique si tiene salida o no.
// Para resolver este problema al laberinto lo representaremos con una matriz de 10 x 10 JLabel. 

// "0" Representa pasillo
// "1" Representa pared
// "9" Persona
// "s" Salida 
// A la salida ubicarla en la componente de la fila 9 y columna 9 de la matriz. La persona
//  comienza a recorrer el laberinto en la fila 0 y columna 0. Los ceros y unos disponerlos en forma
//  aleatoria (con la función random) 
