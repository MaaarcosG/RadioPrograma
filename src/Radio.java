/**
 * @author Marcos Gutierrrez 
 * @since 18 de enero 2018
 * @version beta 2.0.1
 * @propuse Este programa tengra implementada la clase Interfaz_Radio, 
 *          el proposito del programa es que el usuaria pueda escoger entre 
 *          AM o FM y que pueda guardar su estación preferida. 
 */
public class Radio implements Interfaz_Radio {
	/*Atributos que se implementara en esta clase*/
	private boolean estadoDelRadio;
	private String frecAM;
	private String frecFM;
	private String [][] estadoGuardado;
	
	/*Constructor de la clase*/
	public Radio() {
		estadoDelRadio = false;
		frecAM = "530";
		frecFM = "87.9";
		estadoGuardado  = new String [12][2];
		
	}
	@Override
	public String frecAdelante() {
		return null;
	}

	@Override
	public String frecAtras() {
		return null;
	}

	@Override
	public boolean apagar() {
		return false;
	}

	@Override
	public boolean encender() {
		return false;
	}

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

	@Override
	public String mostrasEstacion() {
		return null;
	}

	@Override
	public boolean estaPrendido() {
		return false;
	}

	@Override
	public String obtenerEstacion() {
		return null;
	}

}
