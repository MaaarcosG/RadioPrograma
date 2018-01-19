/**
 * @author Marcos Gutierrrez 
 * @author Claude Calewaert 
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
	private String estacion;
	private String frecAM[];
	private String frecFM[];
	
	/*Constructor de la clase*/
	public Radio() {
		frecActual = "87.9";
		estadoDelRadio = false;
		frecAM = new String[12];
		frecFM = new String[12];
	}
	/**
	 * Metodo con el cual la frecuencia ira sumanndo
	 * @return frecActual
	 */
	@Override
	public String frecAdelante() {
		float FA = Float.parseFloat(frecActual); /*Convertimos de String-Float*/
		
		/*Condicion que nos ayuda a saber si sumar en AM o en FM*/
		
		if(FA >= 530 && FA <= 1610) {
			/*Si la estacion es mayor o igual a 1610, iniciara de nuevo el conteo*/
			if(FA >= 1610) {
				frecActual = "530.0";
			} else {
				/*Si no es igual, se sumara 10*/
				FA += 10;
				frecActual = FA + "";
			}
		} else {
			if(FA >= 87.9 && FA <= 108.1) { /*Se adaptaron los limites debido a la naturaleza de la funcion y numeros*/
				/*Si la frecuencia es mayor a 107.9 devuelve a la frec. inicial*/
				if(FA >= 107.9) {
					frecActual = "87.9";
				
				/*Si no se suma 10 */
				} else {
					FA += 0.2;
					frecActual = String.format("%.01f", FA); /* Da formato de 1 digito a la frec*/
				}
			}
		}
		return frecActual;
	}
	/**
	 * Metodo con el cual se ira para atras en cada frecuencia
	 * @return frecActual
	 */
	@Override
	public String frecAtras() {
		float FA = Float.parseFloat(frecActual); /*Convertimos de String-Float*/
		/*Condicion que nos ayuda a saber si sumar en AM o en FM*/
		if(FA >= 530 && FA <= 1610) {
		
				/*Si la estacion es menor o igual a 530 se ira a la estacion final*/
				if (FA <= 530.0) {
					frecActual = "1610.0";
				}
				/*Si no se restaran 10 */
				
				else {
				FA -= 10;
				frecActual = FA + ""; 
				}
			
		} else {
			if(FA >= 87.9 && FA <= 108.1) { /*Se adaptaron los limites debido a la naturaleza de la funcion y numeros*/
				
					/*Si la estacion es menor  a 87.9 se ira a la estacion final*/
					if (FA < 88.1) {
						frecActual = "107.9";
					}
					/*Si no se restaran 10 */
					else {
						FA -= 0.2;
						frecActual = String.format("%.01f", FA); /*Da formato de 1 digito a la frec*/
					
				}
			}
		}
		return frecActual;
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
	public boolean prender() {
		/*Verifcaremos que el estado del radio este encendido*/
		estadoDelRadio = true;
		this.frecActual = "87.9";
		
		for(int i = 0; i <12; i++) {
			this.frecAM[i] = "530";
			this.frecFM[i] = "87.9";
			System.out.println(this.frecAM[i]);
		}
		
		return estadoDelRadio;
	}
	/**
	 * Este método cambiaremos el estado de la frecuencia entre FM y AM
	 * @param frecActual
	 */
	@Override
	public String cambioFrecuencia() {
		
		float frec = Float.parseFloat(frecActual); /* Convercion de string a float*/
		String cadena = "";
		/*Si es FM cambiara a AM*/
		if (frec>=530 && frec <= 1610) {
			frecActual = "87.9";
			cadena = frecActual + " FM";
			/*Si es AM cambiara FM*/
		} else if (frec >= 87.9 && frec <= 107.9) {
			frecActual = "530.0";
			cadena = frecActual + " AM";
		}
		return cadena;
	}
	/*
	 * Metodo que muestra la estacion del radio
	 * @return estacion
	 */
	@Override
	public String mostrarEstacion() {
		return this.getFrecuencia();
	}
	/**
	 * Metodo que muestra si esta encendido o no
	 * @return estadoDelRadio
	 */
	@Override
	public boolean estaPrendido() {
		return estadoDelRadio;
	}
	/**
	 * Metodo donde obtenemos la estacion
	 * @param ""
	 */
	@Override
	public String obtenerEstacion(int pos) {
		if(pos >-1 && pos<12) {
			/*Si la frecuencia es 530*/
			if (frecActual == "530") {
				/*Guardara en la posicion la estacion*/
				frecActual = frecAM[pos];
			} else {
				/*Si la frecuencia es diferente a 530, guardara la estacion*/
				frecActual = frecFM[pos];
			}
		}
		/*Devuelve el valor de la frecuencia*/
		return frecActual;
	}
	/**
	 * @return the frecActual
	 */
	public String getFrecuencia() {
		return frecActual;
	}
	/**
	 * @param frecActual
	 */
	public void setFrecuencia(String frecActual) {
		frecActual = this.frecActual;
	}
	/**
	 * Este metodo guarda la estacion 
	 * @param int pos
	 */
	@Override
	public void guardarEstacionActual(int pos) {
		if(pos >-1 && pos <12) {
			float estacion = Float.parseFloat(this.frecActual);
			if(estacion > 520) {
				this.frecAM[pos] = this.frecActual;
			}else {
				this.frecFM[pos] = this.frecActual;
			}
		}	
	}
	/*
	 * Este metodo obtiene el estado de la radio
	 * @see Interfaz_Radio#obtenerEstado()
	 */
	@Override
	public String obtenerEstado() {
		
		float FA = Float.parseFloat(frecActual);
		
		/*Estado de la radio*/
		if (FA>= 530 && FA <= 1610) {
			/*Estado AM*/
			estacion = "AM";
		} else {
			if (FA >= 87.9 && FA <= 108.1) {
			/*Estado FM*/
			estacion = "FM";
			}
		}
		return estacion;
	}
	
}
