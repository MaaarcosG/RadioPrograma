import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

/**
 * @author Claude Calewaert
 * @author Marcos Gutierrrez 
 * @since 18 de enero 2018
 * @propuse Prueba de errores, esto permite realizar pruebas de JUnit en el programa calculadora 
 */

public class RadioTest {

	private Radio radio;
	private String frecuencia;
	
	@Before
	public void before() {
		 radio = new Radio();
	}
	
	
	/* Test para comprobar que la radio se encienda correctamente */
	@Test
	public void testDeEncendido() {
		boolean expected = true; /* Para que la radio este encendida debe devolver true */
		boolean actual = radio.prender();
		assertEquals(expected, actual);
	}

	/* Test para comprobar que la radio se apague correctamente */
	@Test
	public void testDeApagado() {
		boolean expected = false; /* Para que la radio este apagado debe devolver false */
		boolean actual = radio.apagar();
		assertEquals(expected, actual);
	}
	
	@Test
	public void testDeAvanzadoDeEstacion() {
		
		String frecActual = radio.getFrecActual();
		float FA = Float.parseFloat(frecActual); /*Convertimos de String-Float el contenido de actual en formato float*/
		frecActual =  String.format("%.01f", FA);  /* Le agregamos formato 1 decimal a FrecActual haciendo uso de su valor copiado */
		FA = Float.parseFloat(frecActual); /*Convertimos de nuevo de String-Float para utilizarlo dentro de la funcion*/
		String expected = null;
		String actual;
		
		if (FA >= 530 && FA <= 1610) {
			expected =  Float.toString(FA+10);
		}
		
		else if (FA >= 87.9 && FA <= 108.1) {
			expected =  Float.toString((float) (FA+0.2));
		}
		
		actual = radio.frecAdelante(); /* Se realiza la funcion frecAdelante() para obtener el valor devuelto */
		
		assertEquals(expected, actual);
	}

}
