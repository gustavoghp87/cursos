package ej05;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JSpinner;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Cajero extends JFrame {

	private JPanel contentPane;
	int moneyAvailableCC, moneyAvailableCA;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Cajero frame = new Cajero();
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
	public Cajero() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel dineroAextraer = new JLabel("Dinero a extraer:");
		dineroAextraer.setBounds(25, 35, 138, 39);
		contentPane.add(dineroAextraer);
		
		JLabel labelCuenta = new JLabel("Cuenta:");
		labelCuenta.setBounds(214, 40, 145, 29);
		contentPane.add(labelCuenta);
		
		JComboBox comboExtraer = new JComboBox();
		comboExtraer.setModel(new DefaultComboBoxModel(new String[] {"0", "50", "100", "150", "200", "250", "300", "350", "400", "500"}));
		comboExtraer.setBounds(25, 112, 91, 29);
		contentPane.add(comboExtraer);
		
		JComboBox comboCuenta = new JComboBox();
		comboCuenta.setModel(new DefaultComboBoxModel(new String[] {"CUENTA CORRIENTE", "CAJA DE AHORRO"}));
		comboCuenta.setBounds(196, 112, 138, 29);
		contentPane.add(comboCuenta);
		
		JLabel labelCorrecto = new JLabel("");
		labelCorrecto.setBounds(137, 200, 287, 27);
		contentPane.add(labelCorrecto);
		
		moneyAvailableCC = 1000;
		moneyAvailableCA = 2000;
		
		JButton btnExtraer = new JButton("EXTRAER");
		btnExtraer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int extraccion = Integer.parseInt(comboExtraer.getSelectedItem().toString());
				
				if (String.valueOf(comboCuenta.getSelectedItem().toString()) == "CAJA DE AHORRO") {
					if (extraccion <= moneyAvailableCA && extraccion <= 200 && moneyAvailableCA - extraccion >= 0) {
						moneyAvailableCA = moneyAvailableCA - extraccion;
						labelCorrecto.setText("Correcto. Dinero en caja de ahorro: " +moneyAvailableCA);
					}
					else
						labelCorrecto.setText("No se puede retirar esa suma");
				}
				
				if (String.valueOf(comboCuenta.getSelectedItem().toString()) == "CUENTA CORRIENTE") {
					if (extraccion <= moneyAvailableCC && extraccion <= 400 && moneyAvailableCC - extraccion >= 0) {
						moneyAvailableCC = moneyAvailableCC - extraccion;
						labelCorrecto.setText("Correcto. Dinero en cuenta corriente: " +moneyAvailableCC);
					}
					else
						labelCorrecto.setText("No se puede retirar esa suma");
				}
				
			}
		});
		btnExtraer.setBounds(25, 188, 91, 39);
		contentPane.add(btnExtraer);
		
	}
}
