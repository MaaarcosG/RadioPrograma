/*
 * @author Marcos Gutierrrez 
 * @since 18 de enero 2018
 * @version beta 2.0.1
 * @propuse Esta clase tiene como objetivo tener metodos para la interfaz
*/
public interface Interfaz_Radio {
	public String frecAdelante();
	public String frecAtras();
	public boolean apagar();
	public boolean prender();
	public String cambioFrecuencia();
	public void guardarEstacionActual(int pos);
	public String obtenerEstacion(int pos);
	public String mostrarEstacion();
	public boolean estaPrendido();
	public String obtenerEstado();
}
