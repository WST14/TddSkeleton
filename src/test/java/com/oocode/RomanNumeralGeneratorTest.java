package com.oocode;

import org.junit.*;

public class RomanNumeralGeneratorTest {

	RomanNumeralGenerator romanNumeralGenerator;

	@Before
	public void init() {
		romanNumeralGenerator = new RomanNumeralGenerator();
	}
	@Test
	public void testNumber1() {
		Assert.assertEquals("I", romanNumeralGenerator.get(1));
	}
}
