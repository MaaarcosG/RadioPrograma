import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;

public class GUI_Radio {

	private JFrame frame;
	private JTextField txtPantalla;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI_Radio window = new GUI_Radio();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public GUI_Radio() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 474, 312);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel Radio = new JPanel();
		Radio.setBorder(new TitledBorder(null, "PROGRAMA RADIO", TitledBorder.CENTER, TitledBorder.TOP, null, null));
		Radio.setBounds(10, 0, 434, 261);
		frame.getContentPane().add(Radio);
		Radio.setLayout(null);
		
		txtPantalla = new JTextField();
		txtPantalla.setEnabled(false);
		txtPantalla.setBounds(10, 40, 302, 39);
		Radio.add(txtPantalla);
		txtPantalla.setColumns(10);
		
		JRadioButton rdEncendido = new JRadioButton("Encendido");
		rdEncendido.setEnabled(false);
		rdEncendido.setBounds(318, 56, 99, 23);
		Radio.add(rdEncendido);
		
		JButton btnEncender = new JButton("ENCENDER");
		btnEncender.setBounds(322, 27, 95, 23);
		Radio.add(btnEncender);
		
		JButton btnAtras = new JButton("Atras");
		btnAtras.setBounds(10, 90, 89, 23);
		Radio.add(btnAtras);
		
		JButton btnAdelante = new JButton("Adelante");
		btnAdelante.setBounds(109, 90, 89, 23);
		Radio.add(btnAdelante);
		
		JButton btnCambiarFrec = new JButton("Cambiar Frecuencia");
		btnCambiarFrec.setBounds(208, 90, 209, 23);
		Radio.add(btnCambiarFrec);
		
		JButton btn1 = new JButton("1");
		btn1.setBounds(10, 134, 89, 23);
		Radio.add(btn1);
		
		JButton btn2 = new JButton("2");
		btn2.setBounds(10, 168, 89, 23);
		Radio.add(btn2);
		
		JButton bnt3 = new JButton("3");
		bnt3.setBounds(10, 202, 89, 23);
		Radio.add(bnt3);
		
		JButton btn4 = new JButton("4");
		btn4.setBounds(109, 134, 89, 23);
		Radio.add(btn4);
		
		JButton bnt7 = new JButton("7");
		bnt7.setBounds(208, 134, 89, 23);
		Radio.add(bnt7);
		
		JButton btn10 = new JButton("10");
		btn10.setBounds(307, 134, 89, 23);
		Radio.add(btn10);
		
		JButton btn5 = new JButton("5");
		btn5.setBounds(109, 168, 89, 23);
		Radio.add(btn5);
		
		JButton btn6 = new JButton("6");
		btn6.setBounds(109, 202, 89, 23);
		Radio.add(btn6);
		
		JButton btn7 = new JButton("8");
		btn7.setBounds(208, 168, 89, 23);
		Radio.add(btn7);
		
		JButton btn9 = new JButton("9");
		btn9.setBounds(208, 202, 89, 23);
		Radio.add(btn9);
		
		JButton btn11 = new JButton("11");
		btn11.setBounds(307, 168, 89, 23);
		Radio.add(btn11);
		
		JButton btn12 = new JButton("12");
		btn12.setBounds(307, 202, 89, 23);
		Radio.add(btn12);
		
		JLabel lblFrecuencia = new JLabel("FRECUENCIA");
		lblFrecuencia.setBounds(10, 236, 81, 14);
		Radio.add(lblFrecuencia);
		
		JLabel lblFmOAm = new JLabel("FM O AM");
		lblFmOAm.setBounds(101, 236, 46, 14);
		Radio.add(lblFmOAm);
	}
}
