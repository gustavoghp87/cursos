import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class Formulario extends JFrame implements ActionListener{
 JButton boton1;
 JMenuBar mb1;
 JMenu menu1;
 JMenuItem menuItem1;

	 public Formulario() {
		 setLayout(null);
		 boton1=new JButton("Salir");
		 boton1.setBounds(650, 480, 100, 30);
		 add(boton1);
		 boton1.addActionListener(this);
		
		 mb1=new JMenuBar();
		 setJMenuBar(mb1);
		 menu1=new JMenu("Opciones");
		 mb1.add(menu1);
		 menuItem1=new JMenuItem("Salir");
		 menu1.add(menuItem1);
		 menuItem1.addActionListener(this);
	 }

	 public void actionPerformed(ActionEvent e) {
		 if (boton1==e.getSource())
			 System.exit(0);
		 if (menuItem1==e.getSource())
			 System.exit(0);
	 }
	
	 public static void main(String[] args) {
		 Formulario formulario1 = new Formulario();
		 formulario1.setBounds(0, 0, 800, 600);
		 formulario1.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		 formulario1.setVisible(true);
	 }
}
