package com.oocode;

import org.junit.*;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

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
}
