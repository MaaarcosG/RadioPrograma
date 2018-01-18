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
	/*Atributos de la GUI*/
	private JFrame frame;
	private JTextField txtPantalla;
	
	/*Botones extras*/
	public JRadioButton rdEncendido;
	public JButton btnEncender;
	public JButton btnAtras;
	public JButton btnAdelante;

	/*Atributos de los botonos*/
	public JButton btn1;
	public JButton btn2;
	public JButton btn3;
	public JButton btn4;
	public JButton btn5;
	public JButton btn6;
	public JButton btn7;
	public JButton btn8;
	public JButton btn9;
	public JButton btn10;
	public JButton btn11;
	public JButton btn12;
	
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
		
		rdEncendido = new JRadioButton("Encendido");
		rdEncendido.setEnabled(false);
		rdEncendido.setBounds(318, 56, 99, 23);
		Radio.add(rdEncendido);
		
		btnEncender = new JButton("ENCENDER");
		btnEncender.setBounds(322, 27, 95, 23);
		Radio.add(btnEncender);
		
		btnAtras = new JButton("<<<");
		btnAtras.setBounds(10, 90, 89, 23);
		Radio.add(btnAtras);
		
		btnAdelante = new JButton(">>>");
		btnAdelante.setBounds(109, 90, 89, 23);
		Radio.add(btnAdelante);
		
		JButton btnCambiarFrec = new JButton("Cambiar Frecuencia");
		btnCambiarFrec.setBounds(208, 90, 209, 23);
		Radio.add(btnCambiarFrec);
		
		btn1 = new JButton("1");
		btn1.setBounds(10, 134, 89, 23);
		Radio.add(btn1);
		btn1.addActionListener(new MiBoton());
		
		btn2 = new JButton("2");
		btn2.setBounds(10, 168, 89, 23);
		Radio.add(btn2);
		
		btn3 = new JButton("3");
		btn3.setBounds(10, 202, 89, 23);
		Radio.add(btn3);
		
		btn4 = new JButton("4");
		btn4.setBounds(109, 134, 89, 23);
		Radio.add(btn4);
		
		btn7 = new JButton("7");
		btn7.setBounds(208, 134, 89, 23);
		Radio.add(btn7);
		
		btn10 = new JButton("10");
		btn10.setBounds(307, 134, 89, 23);
		Radio.add(btn10);
		
		btn5 = new JButton("5");
		btn5.setBounds(109, 168, 89, 23);
		Radio.add(btn5);
		
		btn6 = new JButton("6");
		btn6.setBounds(109, 202, 89, 23);
		Radio.add(btn6);
		
		btn7 = new JButton("8");
		btn7.setBounds(208, 168, 89, 23);
		Radio.add(btn7);
		
		btn9 = new JButton("9");
		btn9.setBounds(208, 202, 89, 23);
		Radio.add(btn9);
		
		btn11 = new JButton("11");
		btn11.setBounds(307, 168, 89, 23);
		Radio.add(btn11);
		
		btn12 = new JButton("12");
		btn12.setBounds(307, 202, 89, 23);
		Radio.add(btn12);
		
		JLabel lblFrecuencia = new JLabel("FRECUENCIA");
		lblFrecuencia.setBounds(10, 236, 81, 14);
		Radio.add(lblFrecuencia);
		
		JLabel lblFmOAm = new JLabel("FM O AM");
		lblFmOAm.setBounds(101, 236, 46, 14);
		Radio.add(lblFmOAm);
	}
	private class MiBoton implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			/*Codigo para el boton de encender*/
			if (e.getSource()==btnEncender) {
			}
			
		}
		
	}
}
