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



}
