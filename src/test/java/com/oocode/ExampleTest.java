package com.oocode;

import org.junit.*;

import java.util.List;

import static org.junit.Assert.*;

public class ExampleTest {

	public static final String XYZ = "XYZ";

	@Test
	public void isEmptyInitilialised() {
		assertTrue(new RecentlyUsedList().getRecentlyUsedList().isEmpty());
	}

	@Test
	public void canAddItems() {
		final RecentlyUsedList recentlyUsedList = new RecentlyUsedList();
		recentlyUsedList.add("ABC");
		assertEquals(List.of("ABC"), recentlyUsedList.getRecentlyUsedList());
	}

	@Test
	public void firstItemInList() {
		final RecentlyUsedList recentlyUsedList = new RecentlyUsedList();
		recentlyUsedList.add("ABC");
		recentlyUsedList.add("DEF");
		assertEquals("DEF", recentlyUsedList.getRecentlyUsedList().get(0));
	}

	@Test
	public void ignoreDuplicates() {
		final RecentlyUsedList recentlyUsedList = new RecentlyUsedList();
		recentlyUsedList.add(XYZ);
		recentlyUsedList.add(XYZ);
		assertEquals(1, recentlyUsedList.getRecentlyUsedList().size());
	}

	@Test
	public void addInteger() {
		final RecentlyUsedList recentlyUsedList = new RecentlyUsedList();
		recentlyUsedList.add(5);
		assertEquals(5, recentlyUsedList.getRecentlyUsedList().get(0));
	}

	@Test
	public void addNull() {
		final RecentlyUsedList recentlyUsedList = new RecentlyUsedList();
		final IllegalArgumentException ex =
				assertThrows(IllegalArgumentException.class, () -> recentlyUsedList.add(null));
		assertEquals("Input is null.", ex.getMessage());
	}
}
