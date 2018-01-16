/**
 * @author Marcos Gutierrez 		Carne: 17909
 * @since 16 de enero 2018
 * @version beta 2.0
 *
 */
public class Radio implements Interfaz_Radio{
	/*Atributos que seran utiles*/
	private boolean estadoRadio;
	private String tipoFrecuencia;
	private int frecAM;
	private double frecFM;
	
	public Radio() {
		/*Constructor de la clase radio*/
		setEstadoRadio(true); //True Encendido
		setTipoFrecuencia("");
		setFrecAM(530);
		setFrecFM(87.9);
		
	}
	@Override
	public String frecAdelante() {
		if (tipoFrecuencia.equals("AM")) {
			/*Si es frecuencia AM avanzara 10*/
			/*Frecuencia AM = 530 + 10*/
			frecAM =+ 10;
			/*Si la frecuencia llega a 1610 iniciara desde 530*/
			if (frecAM > 1610){
				frecAM = 530;
			}  
		} else if (tipoFrecuencia.equals("FM")){
			/*Si es frecuenca FM avanzara 0.2*/
			/*Frecuencia FM = 87.9 + 0.2*/
			frecFM =+ 0.2;
			/*Si la frecuencia llega a 107.9 iniciara de nuevo*/
			if (frecFM > 107.9) {
				frecFM = 87.9;
			}
			return String.valueOf(frecFM);
		} 
		return String.valueOf(frecAM);
	}

	@Override
	public String frecAtras() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean apagar() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean encender() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String cambioFrecuencia() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void guardarFrecAm(int frec, int pos) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void guardarFrecFm(float frec, int pos) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String mostrasEstacion() {
		// TODO Auto-generated method stub
		return null;
	}
	/**
	 * @return estadoRadio
	 */
	public boolean isEstadoRadio() {
		return estadoRadio;
	}
	/**
	 * @param estadoRadio
	 */
	public void setEstadoRadio(boolean estadoRadio) {
		this.estadoRadio = estadoRadio;
	}
	/**
	 * @return tipoFrecuencia
	 */
	public String getTipoFrecuencia() {
		return tipoFrecuencia;
	}
	/**
	 * @param tipoFrecuencia
	 */
	public void setTipoFrecuencia(String tipoFrecuencia) {
		this.tipoFrecuencia = tipoFrecuencia;
	}
	/**
	 * @return frecAM
	 */
	public int getFrecAM() {
		return frecAM;
	}
	/**
	 * @param frecAM
	 */
	public void setFrecAM(int frecAM) {
		this.frecAM = frecAM;
	}
	/**
	 * @return frecFM
	 */
	public double getFrecFM() {
		return frecFM;
	}
	/**
	 * @param frecFM
	 */
	public void setFrecFM(double frecFM) {
		this.frecFM = frecFM;
	}
}
