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

	@Test
	public void testLessThan5() {
		Assert.assertEquals("I", romanNumeralGenerator.get(1));
		Assert.assertEquals("II", romanNumeralGenerator.get(2));
		Assert.assertEquals("III", romanNumeralGenerator.get(3));
		Assert.assertEquals("IV", romanNumeralGenerator.get(4));
	}

	@Test
	public void test5to10() {
		Assert.assertEquals("VI", romanNumeralGenerator.get(6));
		Assert.assertEquals("VII", romanNumeralGenerator.get(7));
		Assert.assertEquals("VIII", romanNumeralGenerator.get(8));
		Assert.assertEquals("IX", romanNumeralGenerator.get(9));
	}
}
