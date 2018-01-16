/**
 * 
 */

/**
 * Esta clase contiene los set y gets de los parametros que se encuentran 
 * dentro de la clase intefaz, tambien los inicializa.
 * 
 * @author Marcos Gutierrez 			17909
 * @since 16 enero 2018
 * @version beta 3.2
 */
public class Radio implements Interfaz_Radio {

	public Radio() {
		// TODO Auto-generated constructor stub
	}
	/**
	 * @return 
	 */
	@Override
	public String frecAdelante() {
		return null;
	}
	/**
	 * @return
	 */
	@Override
	public String frecAtras() {
		return null;
	}
	/**
	 * @return
	 */
	@Override
	public boolean apagar() {
		return false;
	}
	/**
	 * @return false
	 */
	@Override
	public boolean encender() {
		return false;
	}
	/**
	 * @return 
	 */
	@Override
	public String cambioFrecuencia() {
		return null;
	}
	
	@Override
	public void guardarFrecAm(int frec, int pos) {
		
		
	}

	@Override
	public void guardarFrecFm(float frec, int pos) {
		
		
	}
	/**
	 * @return 
	 */
	@Override
	public String mostrasEstacion() {
		return null;
	}

}
