import static org.junit.Assert.*;

import org.junit.Test;

public class RadioTest {

	
	/* Test para comprobar que la radio se encienda correctamente */
	@Test
	public void testDeEncendido() {
		Radio radio = new Radio();
		boolean expected = true; /* Para que la radio este encendida debe devolver true */
		boolean actual = radio.prender();
		assertEquals(expected, actual);
	}

	/* Test para comprobar que la radio se apague correctamente */
	@Test
	public void testDeApagado() {
		Radio radio = new Radio();
		boolean expected = false; /* Para que la radio este apagado debe devolver false */
		boolean actual = radio.apagar();
		assertEquals(expected, actual);
	}
	

}
