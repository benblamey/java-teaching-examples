import static org.junit.Assert.*;

import org.junit.Test;


public class RomanNumeralTest {

	@Test
	public void test() {
		assertEquals(1, RomanNumeral.Parse("I"));
		
		assertEquals(2, RomanNumeral.Parse("II"));
		
		assertEquals(6, RomanNumeral.Parse("VI"));
		
		assertEquals(4, RomanNumeral.Parse("IV"));

		assertEquals(48, RomanNumeral.Parse("IIL"));
		
		
	}

}
