package com.oocode;

import org.junit.*;

public class RomanNumeralGeneratorTest {

	RomanNumeralGenerator romanNumeralGenerator;

	@Before
	public void init() {
		romanNumeralGenerator = new RomanNumeralGenerator();
	}

	@Test
	public void testBaseSymbols() {
		Assert.assertEquals("I", romanNumeralGenerator.get(1));
		Assert.assertEquals("V", romanNumeralGenerator.get(5));
		Assert.assertEquals("X", romanNumeralGenerator.get(10));
		Assert.assertEquals("L", romanNumeralGenerator.get(50));
		Assert.assertEquals("C", romanNumeralGenerator.get(100));
		Assert.assertEquals("D", romanNumeralGenerator.get(500));
		Assert.assertEquals("M", romanNumeralGenerator.get(1000));
	}


}
