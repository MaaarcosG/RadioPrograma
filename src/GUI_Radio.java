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
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;

/*
 * @author Marcos Gutierrrez 
 * @author Claude Calewaert 
 * @since 18 de enero 2018
 * @version beta 2.0.1
 * @propuse Esta clase tiene como objetivo generar la interfaz grafica de usuario
 * 
*/

public class GUI_Radio {
	/*Llamamos a la clase radio*/
	Radio radio;
	
	/*Atributos de la GUI*/
	private JFrame frame;
	private JTextField txtPantalla;
	private JButton btnGuardar;
	
	/*Botones extras*/
	public JRadioButton rdEncendido;
	public JButton btnEncender;
	public JButton btnAtras;
	public JButton btnAdelante;
	public JButton btnCambiarFrec;
	public JButton btnApagar;

	/*Atributos de los botonos*/
	public JButton btn1;
	public JButton btn2;
	public JButton btn3;
	public JButton btn4;
	public JButton btn5;
	public JButton btn6;
	public JButton btn7;
	private JButton btn7_1;
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
		radio = new Radio();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 474, 328);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel Radio = new JPanel();
		Radio.setBorder(new TitledBorder(null, "PROGRAMA RADIO", TitledBorder.CENTER, TitledBorder.TOP, null, null));
		Radio.setBounds(10, 0, 434, 278);
		frame.getContentPane().add(Radio);
		Radio.setLayout(null);
		
		txtPantalla = new JTextField();
		txtPantalla.setFont(new Font("Tahoma", Font.PLAIN, 22));
		txtPantalla.setEnabled(false);
		txtPantalla.setBounds(10, 40, 302, 39);
		Radio.add(txtPantalla);
		txtPantalla.setColumns(10);
		
		rdEncendido = new JRadioButton("Encendido");
		rdEncendido.setEnabled(false);
		rdEncendido.setBounds(318, 56, 99, 23);
		Radio.add(rdEncendido);
		
		btnAtras = new JButton("<<<");
		btnAtras.setEnabled(false);
		btnAtras.setBounds(10, 90, 89, 23);
		Radio.add(btnAtras);
		btnAtras.addActionListener(new MiBoton());
		
		btnAdelante = new JButton(">>>");
		btnAdelante.setEnabled(false);
		btnAdelante.setBounds(109, 90, 89, 23);
		Radio.add(btnAdelante);
		btnAdelante.addActionListener(new MiBoton());
		
		btnCambiarFrec = new JButton("Cambiar Frecuencia");
		btnCambiarFrec.setEnabled(false);
		btnCambiarFrec.setBounds(208, 90, 209, 23);
		Radio.add(btnCambiarFrec);
		btnCambiarFrec.addActionListener(new MiBoton());
		
		btn1 = new JButton("1");
		btn1.setEnabled(false);
		btn1.setBounds(10, 134, 89, 23);
		Radio.add(btn1);
		btn1.addActionListener(new MiBoton());
		
		btn2 = new JButton("2");
		btn2.setEnabled(false);
		btn2.setBounds(10, 168, 89, 23);
		Radio.add(btn2);
		btn2.addActionListener(new MiBoton());
		
		btn3 = new JButton("3");
		btn3.setEnabled(false);
		btn3.setBounds(10, 202, 89, 23);
		Radio.add(btn3);
		btn3.addActionListener(new MiBoton());
		
		btn4 = new JButton("4");
		btn4.setEnabled(false);
		btn4.setBounds(109, 134, 89, 23);
		Radio.add(btn4);
		btn4.addActionListener(new MiBoton());
		
		btn7 = new JButton("7");
		btn7.setEnabled(false);
		btn7.setBounds(208, 134, 89, 23);
		Radio.add(btn7);
		btn4.addActionListener(new MiBoton());
		
		btn10 = new JButton("10");
		btn10.setEnabled(false);
		btn10.setBounds(307, 134, 89, 23);
		Radio.add(btn10);
		btn10.addActionListener(new MiBoton());
		
		btn5 = new JButton("5");
		btn5.setEnabled(false);
		btn5.setBounds(109, 168, 89, 23);
		Radio.add(btn5);
		btn5.addActionListener(new MiBoton());
		
		btn6 = new JButton("6");
		btn6.setEnabled(false);
		btn6.setBounds(109, 202, 89, 23);
		Radio.add(btn6);
		btn6.addActionListener(new MiBoton());
		
		btn7_1 = new JButton("8");
		btn7_1.setEnabled(false);
		btn7_1.setBounds(208, 168, 89, 23);
		Radio.add(btn7_1);
		btn7.addActionListener(new MiBoton());
		
		btn9 = new JButton("9");
		btn9.setEnabled(false);
		btn9.setBounds(208, 202, 89, 23);
		Radio.add(btn9);
		btn9.addActionListener(new MiBoton());
		
		btn11 = new JButton("11");
		btn11.setEnabled(false);
		btn11.setBounds(307, 168, 89, 23);
		Radio.add(btn11);
		btn11.addActionListener(new MiBoton());
		
		btn12 = new JButton("12");
		btn12.setEnabled(false);
		btn12.setBounds(307, 202, 89, 23);
		Radio.add(btn12);
		btn12.addActionListener(new MiBoton());
		
		btnEncender = new JButton("ENCENDER");
		btnEncender.setBounds(10, 238, 95, 23);
		Radio.add(btnEncender);
		btnEncender.addActionListener(new MiBoton());
		
		btnApagar = new JButton("APAGAR");
		btnApagar.setBounds(119, 238, 95, 23);
		Radio.add(btnApagar);
		btnApagar.addActionListener(new MiBoton());
		
		btnGuardar = new JButton("Guardar");
		btnGuardar.setBounds(224, 238, 193, 23);
		Radio.add(btnGuardar);
		btnGuardar.addActionListener(new MiBoton());
	}
	/**
	 * @return Interger.parseInt(guardar);
	 */
	public int GuardandoFM(){
		/*Manda un mensaje que sirve para que escoga donde quiere guardar la estacion*/
		String guardarFM = JOptionPane.showInputDialog("Escoga el numero de estacion que desea guardar: ");
		return Integer.parseInt(guardarFM);
	}
	/*
	 * @return 
	 */
	public int GuardandoAM() {
		/*Manda un mensaje que sirve para que escoga donde quiere guardar la estacion*/
		String guardarAM = JOptionPane.showInputDialog("Escoga el numero de estacion que desea guardar: ");
		return Integer.parseInt(guardarAM);
	}
	private class MiBoton implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			/*Codigo para el boton de encender*/
			if (e.getSource().equals(btnEncender)) {
				JOptionPane.showMessageDialog(null, "LA RADIO SE ENCENDIO");
				radio.prender();
				txtPantalla.setText("Esta escuchando " + radio.getFrecuencia());
				/*Indicara que se encuentra encendido la radio*/
				btnAtras.setEnabled(true);
				btnAdelante.setEnabled(true);
				rdEncendido.setSelected(true);
				btnCambiarFrec.setEnabled(true);
				btn1.setEnabled(true);
				btn2.setEnabled(true);
				btn3.setEnabled(true);
				btn4.setEnabled(true);
				btn5.setEnabled(true);
				btn6.setEnabled(true);
				btn7.setEnabled(true);
				btn7_1.setEnabled(true);
				btn9.setEnabled(true);
				btn10.setEnabled(true);
				btn11.setEnabled(true);
				btn12.setEnabled(true);
				btnGuardar.setEnabled(true);
			}
			/*Condicion que funciona para apagar la radio*/
			else if (e.getSource().equals(btnApagar)) {
				JOptionPane.showMessageDialog(null, "LA RADIO SE APAGO");
				radio.prender();
				txtPantalla.setText("");
				/*Indicara que se encuentra encendido la radio*/
				btnAtras.setEnabled(false);
				btnAdelante.setEnabled(false);
				rdEncendido.setSelected(false);
				btnCambiarFrec.setEnabled(false);
				btn1.setEnabled(false);
				btn2.setEnabled(false);
				btn3.setEnabled(false);
				btn4.setEnabled(false);
				btn5.setEnabled(false);
				btn6.setEnabled(false);
				btn7.setEnabled(false);
				btn7_1.setEnabled(false);
				btn9.setEnabled(false);
				btn10.setEnabled(false);
				btn11.setEnabled(false);
				btn12.setEnabled(false);
				btnGuardar.setEnabled(false);
			}
			/*Boton para cambiar la frecuencia*/
			if (e.getSource().equals(btnCambiarFrec)) {
				/*Condicion que sirve para indicar a que frecuencia esta cambiando*/
				radio.cambioFrecuencia();
				txtPantalla.setText("Esta escuchando: " + radio.mostrarEstacion());
				
			}
			/*Boton para cambiar la frecuencia*/
			if (e.getSource().equals(btnAdelante)) {
				/*Implementa el metodo de sumar a la frecuencia*/
				String nueva;
				nueva = radio.frecAdelante();
				/*cadena*/
				txtPantalla.setText("Esta escuchando " + nueva);
			}
			/*Boton para cambiar la frecuencia*/
			if(e.getSource().equals(btnAtras)) {
				/*Implementa el metodo de restar a la frecuencia*/
				String nueva;
				nueva = radio.frecAtras();
				/*cadena*/
				txtPantalla.setText("Esta escuchando " + nueva);
			}
			/*Boton 1 para mostrar los datos guardados*/
			if(e.getSource().equals(btn1)) {
				txtPantalla.setText("Esta escuchando " + radio.obtenerEstacion(1));
			}
			/*Mostrar los datos guardados*/
			if(e.getSource().equals(btnGuardar)) {
				if(radio.mostrarEstacion().equals("87.9")) {
					/*Guarda los datos*/
					radio.guardarEstacionActual(GuardandoFM());
				} else {
					/*Guarda los datos*/
					radio.guardarEstacionActual(GuardandoAM());
				}
			}
			/*Boton 1 para mostrar los datos guardados*/
			if(e.getSource().equals(btn2)) {
				txtPantalla.setText("Esta escuchando " + radio.obtenerEstacion(2));
			}
			/*Boton 3 para mostrar los datos guardados*/
			if(e.getSource().equals(btn3)) {
				txtPantalla.setText("Esta escuchando " + radio.obtenerEstacion(3));
			}
			/*Boton 4 para mostrar los datos guardados*/
			if(e.getSource().equals(btn4)) {
				txtPantalla.setText("Esta escuchando " + radio.obtenerEstacion(4));
			} 
			/*Boton 5 para mostrar los datos guardados*/
			if(e.getSource().equals(btn5)) {
				txtPantalla.setText("Esta escuchando " + radio.obtenerEstacion(5));
			}
			/*Boton 6 para mostrar los datos guardados*/
			if(e.getSource().equals(btn6)) {
				txtPantalla.setText("Esta escuchando " + radio.obtenerEstacion(6));
			}
			/*Boton 7 para mostrar los datos guardados*/
			if(e.getSource().equals(btn7)) {
				txtPantalla.setText("Esta escuchando " + radio.obtenerEstacion(7));
			}
			/*Boton 8 para mostrar los datos guardados*/
			if(e.getSource().equals(btn8)) {
				txtPantalla.setText("Esta escuchando " + radio.obtenerEstacion(8));
			}
			/*Boton 9 para mostrar los datos guardados*/
			if(e.getSource().equals(btn9)) {
				txtPantalla.setText("Esta escuchando " + radio.obtenerEstacion(9));
			}
			/*Boton 10 para mostrar los datos guardados*/
			if(e.getSource().equals(btn10)) {
				txtPantalla.setText("Esta escuchando " + radio.obtenerEstacion(10));
			}
			/*Boton 11 para mostrar los datos guardados*/
			if(e.getSource().equals(btn11)) {
				txtPantalla.setText("Esta escuchando " + radio.obtenerEstacion(12));
			}
			/*Boton 12 para mostrar los datos guardados*/
			if(e.getSource().equals(btn12)) {
				txtPantalla.setText("Esta escuchando " + radio.obtenerEstacion(12));
			}
		}
	}
}


