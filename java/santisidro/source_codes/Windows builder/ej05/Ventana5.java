package ej05;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import javax.swing.border.EmptyBorder;

public class Ventana5 extends JFrame {

	
	private JPanel contentPane;
	private JSpinner spinner1;
	private JSpinner spinner2;
	private JSpinner spinner3;
	private JLabel l1; 

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ventana5 frame = new Ventana5();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Ventana5() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		spinner1 = new JSpinner();
		spinner1.setModel(new SpinnerNumberModel(0, 0, 100, 10));
		spinner1.setBounds(31, 35, 62, 20);
		contentPane.add(spinner1);

		spinner2 = new JSpinner();
		spinner2.setModel(new SpinnerNumberModel(0, 0, 100, 1));
		spinner2.setBounds(31, 85, 62, 20);
		contentPane.add(spinner2);

		spinner3 = new JSpinner();
		spinner3.setModel(new SpinnerNumberModel(0, 0, 100, 1));
		spinner3.setBounds(31, 134, 62, 20);
		contentPane.add(spinner3);

		JLabel lblCompuerta = new JLabel("compuerta 1");
		lblCompuerta.setBounds(106, 38, 82, 14);
		contentPane.add(lblCompuerta);

		JLabel lblCompuerta_1 = new JLabel("compuerta 2");
		lblCompuerta_1.setBounds(106, 88, 82, 14);
		contentPane.add(lblCompuerta_1);

		JLabel lblCompuerta_2 = new JLabel("compuerta 3");
		lblCompuerta_2.setBounds(106, 137, 82, 14);
		contentPane.add(lblCompuerta_2);

		JButton btnNewButton = new JButton("Actualizar caudal");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int v1=Integer.parseInt(spinner1.getValue().toString());
				int v2=Integer.parseInt(spinner2.getValue().toString());
				int v3=Integer.parseInt(spinner3.getValue().toString());
				int suma=v1+v2+v3;
				if (suma<=100)
					l1.setText("Bajo");
				else
					if (suma<=200)
						l1.setText("Medio"); 
					else
						l1.setText("Alto");
			}
		});
		btnNewButton.setBounds(31, 198, 157, 23);
		contentPane.add(btnNewButton);
	
		l1 = new JLabel("resultado");
		l1.setBounds(218, 203, 149, 14);
		contentPane.add(l1);
	} 
}
