package com.oocode;

import org.junit.*;
import static org.junit.Assert.assertTrue;

public class ExampleTest {
	@Test
	public void isEmptyInitilialised() {
		assertTrue(new RecentlyUsedList().answer().isEmpty());
	}
}
