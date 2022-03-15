package com.oocode;

import org.junit.*;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class ExampleTest {
	@Test
	public void isEmptyInitilialised() {
		assertTrue(new RecentlyUsedList().getRecentlyUsedList().isEmpty());
	}

	@Test
	public void canAddItems() {
		final RecentlyUsedList recentlyUsedList = new RecentlyUsedList();
		recentlyUsedList.add("ABC");
		assertEquals(recentlyUsedList.getRecentlyUsedList(), List.of("ABC"));
	}

	@Test
	public void firstItemInList() {
		final RecentlyUsedList recentlyUsedList = new RecentlyUsedList();
		recentlyUsedList.add("ABC");
		recentlyUsedList.add("DEF");
		assertEquals(recentlyUsedList.getRecentlyUsedList().get(0), "DEF");
	}

}
