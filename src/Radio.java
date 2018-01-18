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
	private String frecActual;
	private String [][] estadoGuardado;
	
	/*Constructor de la clase*/
	public Radio() {
		estadoDelRadio = false;
		estadoGuardado  = new String [12][2];
		
	}
	/**
	 * Metodo con el cual la frecuencia ira sumanndo
	 * @return frecActual
	 */
	@Override
	public String frecAdelante() {
		float FA = Float.parseFloat(frecActual); /*Convertimos de String-Float*/
		if (FA == 530) {
			/*Se dara valor a AM*/
			/*Ira sumando en 10 en 10*/
			if (FA >= 1610) {
				/*Si es mayor o igual a 1610, entonces el valor regresara al inicial*/
				frecActual = "530";
			} else {
				/*Se suman 10*/
				FA += 10;
			} 
		} else {
			if(FA == 87.9) {
				/*Suma 0.2 debido a que es frecuencia AM*/
				FA += 0.2;
			} else if (FA >= 107.9) {
				/*Si es mayor o igual a 107.9, entonces se devolverala el valor inicial	*/
				frecActual = "87.9";
			}
		}
		/*Retornamos la frecuencia actual*/
		System.out.println(frecActual);
		return frecActual;
	}
	/**
	 * Metodo con el cual se ira para atras en cada frecuencia
	 * @return frecActual
	 */
	@Override
	public String frecAtras() {
		System.out.println(frecActual);
		float FA = Float.parseFloat(frecActual); /*Convertimos de String-Float*/
		if (FA == 530) {
			/*Se dara valor a AM*/
			/*Ira restando en 10 en 10*/
			if (FA >= 1610) {
				/*Si es mayor o igual a 1610, entonces el valor regresara al inicial*/
				frecActual = "530";
			} else {
				/*Se suman 10*/
				FA -= 10;
			} 
		} else {
			if(FA == 87.9) {
				/*Suma 0.2 debido a que es frecuencia AM*/
				FA -= 0.2;
			} else if (FA >= 107.9) {
				/*Si es mayor o igual a 107.9, entonces se devolverala el valor inicial	*/
				frecActual = "87.9";
			}
		}
		return frecActual	;
	}
	/**
	 * Metodo que apaga la radio
	 * @return estadoDelRadio
	 */
	@Override
	public boolean apagar() {
		/*Verificaremos que el estado del radio este apagado*/
		estadoDelRadio = false;
		return estadoDelRadio;
	}
	/**
	 * Metodo que enciende la radio
	 * @return estadoDelRadio
	 */
	@Override
	public boolean encender() {
		/*Verifcaremos que el estado del radio este encendido*/
		estadoDelRadio = true;
		frecActual = "87.9";
		return estadoDelRadio;
	}
	/**
	 * Este método cambiaremos el estado de la frecuencia entre FM y AM
	 * @param frecActual
	 */
	@Override
	public String cambioFrecuencia() {
		/*Si es FM cambiara a AM*/
		if (frecActual.equals("fm")) {
			frecActual = "am";
			frecActual = "530";
			/*Si es AM cambiara FM*/
		} else if (frecActual.equals("am")) {
			frecActual = "fm";
			frecActual = "87.9";
		}
		return frecActual;
	}
	/**
	 * Metodo (Matriz) que guardara en cada boton la estacion deseada, guarda AM
	 * @param frec and pos
	 */
	@Override
	public void guardarFrecAm(int frec, int pos) {
		/*Compararemos los limistes de cada frecuencia para guardarlo */
		if (frec <= 1610 && frec>= 530 && frec % 10 == 0 && pos >= 0 && pos >= 12) {
			/*Guardamos en la matriz*/
			estadoGuardado[pos][0] = String.valueOf(frec);
			estadoGuardado[pos][1] = "AM";
		}
	}
	/**
	 * Metodo (Matriz) que guardara en cada boton la estacion deseado, guarda FM
	 * @param frec and pos
	 */
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
