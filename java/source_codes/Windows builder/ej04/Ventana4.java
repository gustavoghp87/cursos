package ej04;
import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.AbstractAction;
import java.awt.event.ActionEvent;
import javax.swing.Action;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;

public class Ventana4 extends JFrame {
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private final ButtonGroup buttonGroup_1 = new ButtonGroup();
	//private final Action action = new SwingAction();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ventana4 frame = new Ventana4();
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
	public Ventana4() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		getContentPane().setLayout(null);
		
		JRadioButton radio1 = new JRadioButton("Bebida 1");
		buttonGroup.add(radio1);
		radio1.setSelected(true);
		radio1.setBounds(6, 43, 109, 23);
		getContentPane().add(radio1);
		
		JRadioButton radio2 = new JRadioButton("Bebida 2");
		buttonGroup.add(radio2);
		radio2.setBounds(6, 67, 109, 23);
		getContentPane().add(radio2);
		
		JRadioButton radio3 = new JRadioButton("Bebida 3");
		buttonGroup.add(radio3);
		radio3.setBounds(6, 93, 109, 23);
		getContentPane().add(radio3);
		
		JComboBox comboPesos = new JComboBox();
		comboPesos.setModel(new DefaultComboBoxModel(new String[] {"0", "1", "2", "3", "4", "5"}));
		comboPesos.setBounds(193, 43, 118, 22);
		getContentPane().add(comboPesos);
		
		JComboBox comboCentavos = new JComboBox();
		comboCentavos.setModel(new DefaultComboBoxModel(new String[] {"0", "10", "20", "30", "40", "50", "60", "70", "80", "90"}));
		comboCentavos.setBounds(193, 93, 118, 22);
		getContentPane().add(comboCentavos);
		
		JLabel lblNewLabel = new JLabel("Precio: $");
		lblNewLabel.setBounds(121, 47, 62, 19);
		getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel2 = new JLabel("Precio: cent");
		lblNewLabel2.setBounds(121, 93, 62, 19);
		getContentPane().add(lblNewLabel2);
		
		JLabel l1 = new JLabel("Resultado");
		l1.setBounds(193, 180, 118, 40);
		getContentPane().add(l1);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 int pesos=Integer.parseInt((String)comboPesos.getSelectedItem());
				 int centavos=Integer.parseInt((String)comboCentavos.getSelectedItem());
				 if (radio1.isSelected() && pesos==0 && centavos==80)
					 l1.setText("Correcto");
				 else
					 if (radio2.isSelected() && pesos==1 && centavos==20)
						 l1.setText("Correcto");
					 else
						 if (radio3.isSelected() && pesos==3 && centavos==10) 
							 l1.setText("Correcto");
						 else
							 l1.setText("Incorrecto"); 
			}
		});
		btnNewButton.setBounds(39, 180, 109, 40);
		getContentPane().add(btnNewButton);
	}
}
