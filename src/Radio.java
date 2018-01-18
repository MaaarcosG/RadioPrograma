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
