package com.oocode;

import java.util.ArrayList;
import java.util.List;

public class RecentlyUsedList {
	private final List<String> recentlyUsedList = new ArrayList<>();

	public List<String> getRecentlyUsedList() {
		return this.recentlyUsedList;
	}

	public void add(final String input) {
		this.recentlyUsedList.add(0, input);
	}
}

