package Queue;
import javax.swing.*;
import java.awt.event.*;
import java.util.LinkedList;
import java.util.Queue;

public class Supermercado extends JFrame implements ActionListener {
	 private JButton boton1;
	 private JLabel l1, l2, l3;
	 
	 public Supermercado() {
		 setLayout(null);
		 boton1 = new JButton("Activar Simulación");
		 boton1.setBounds(10, 10, 180, 30);
		 add(boton1);
		 boton1.addActionListener(this);
		 
		 l1 = new JLabel("Clientes atendidos por caja: ");
		 l1.setBounds(10, 50, 400, 30);
		 add(l1);
		 
		 l2 = new JLabel("Se marchan sin hacer compras: ");
		 l2.setBounds(10, 90, 400, 30);
		 add(l2);
		 
		 l3 = new JLabel("Tiempo promedio en cola: ");
		 l3.setBounds(10, 130, 400, 30);
		 add(l3);
		 
	 }

	 public void actionPerformed(ActionEvent e) {
		 if (e.getSource() == boton1) {
			 simulacion();
		 }
	 }
		 
	 public void simulacion() {
		 int estado1 = 0, estado2 = 0, estado3 = 0;
		 int marchan = 0;
		 int llegada = 2 + (int) (Math.random() * 2);
		 int salida1 = -1, salida2 = -1, salida3 = -1;
		 int cantAte1 = 0, cantAte2 = 0, cantAte3 = 0;
		 int tiempoEnCola = 0;
		 int cantidadEnCola = 0;
		 
		 Queue<Integer> cola1 = new LinkedList<Integer>();
		 Queue<Integer> cola2 = new LinkedList<Integer>();
		 Queue<Integer> cola3 = new LinkedList<Integer>();
		 
		 for (int minuto = 0; minuto < 600; minuto++) {
			 
			 if (llegada == minuto) {
				 if (estado1 == 0) {
					 estado1 = 1;
					 salida1 = minuto + 7 + (int) (Math.random() * 5);
				 } else {
					 if (estado2 == 0) {
						 estado2 = 1;
						 salida2 = minuto + 7 + (int) (Math.random() * 5);
					 } else {
						 if (estado3 == 0) {
							 estado3 = 1;
							 salida3 = minuto + 7 + (int) (Math.random() * 5);
						 } else {
							 if (cola1.size() == 6 && cola2.size() == 6 && cola3.size() == 6) {
								 marchan++;
							 } else {
								 if (cola1.size() <= cola2.size() && cola1.size() <= cola3.size()) {
									 cola1.add(minuto);
								 } else {
									 if (cola2.size() <= cola3.size()) {
										 cola2.add(minuto);
									 } else {
										 cola3.add(minuto);
									 }
								 }
							 }
						 }
					 }
				 }
				 llegada = minuto + 2 + (int) (Math.random() * 2);
			 }
			 
			 if (salida1 == minuto) {
				 cantAte1++;
				 estado1 = 0;
				 if (!cola1.isEmpty()) {
					 estado1 = 1;
					 int m = cola1.poll();
					 salida1 = minuto + 7 + (int) (Math.random() * 5);
					 tiempoEnCola = tiempoEnCola + (minuto - m);
					 cantidadEnCola++;
				 }
			 }
			 
			 if (salida2 == minuto) {
				 cantAte2++;
				 estado2 = 0;
				 if (!cola2.isEmpty()) {
					 estado2 = 1;
					 int m = cola2.poll();
					 salida2 = minuto + 7 + (int) (Math.random() * 5);
					 tiempoEnCola = tiempoEnCola + (minuto - m);
					 cantidadEnCola++;
				 }
			 }
			 
			 if (salida3 == minuto) {
				 cantAte3++;
				 estado3 = 0;
				 if (!cola3.isEmpty()) {
					 estado3 = 1;
					 int m = cola3.poll();
					 salida3 = minuto + 7 + (int) (Math.random() * 5);
					 tiempoEnCola = tiempoEnCola + (minuto - m);
					 cantidadEnCola++;
				 }
			 }
		 }
		 
		 l1.setText("Clientes atendidos por caja: caja1=" + cantAte1 + " caja2=" + cantAte2 + " caja3=" + cantAte3);
		 l2.setText("Se marchan sin hacer compras:" + marchan);
		 if (cantidadEnCola > 0) {
			 int tiempoPromedio = tiempoEnCola / cantidadEnCola;
			 l3.setText("Tiempo promedio en cola:" + tiempoPromedio);
		 }
	 }
	 
	 public static void main(String[] ar) {
		 Supermercado super1 = new Supermercado();
		 super1.setBounds(0, 0, 390, 250);
		 super1.setDefaultCloseOperation(EXIT_ON_CLOSE);
		 super1.setVisible(true);
	 }
}

// Un supermercado tiene tres cajas para la atención de los clientes.
// Las cajeras tardan entre 7 y 11 minutos para la atención de cada cliente.
// Los clientes llegan a la zona de cajas cada 2 ó 3 minutos. (Cuando el cliente llega, si todas las
//   cajas tienen 6 personas, el cliente se marcha del supermercado)
// Cuando el cliente llega a la zona de cajas elige la caja con una cola menor.
// Realizar una simulación durante 8 horas y obtener la siguiente información:
//  a- Cantidad de clientes atendidos por cada caja.
//  b- Cantidad de clientes que se marcharon sin hacer compras.
//  c- Tiempo promedio en cola.