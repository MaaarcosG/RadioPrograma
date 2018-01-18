
public interface Interfaz_Radio {
	public String frecAdelante();
	public String frecAtras();
	public boolean apagar();
	public boolean encender();
	public String cambioFrecuencia();
	public void guardarFrecAm(int frec, int pos);
	public void guardarFrecFm(float frec, int pos);
	public String mostrasEstacion();
	public boolean estaPrendido();
	public String obtenerEstacion();
}
