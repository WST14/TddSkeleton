package com.oocode;

import java.util.ArrayList;
import java.util.List;

public class RecentlyUsedList {
	private final List<Object> recentlyUsedList = new ArrayList<>();

	public List<Object> getRecentlyUsedList() {
		return this.recentlyUsedList;
	}

	public void add(final Object input) {
		if (input == null) {
			throw new IllegalArgumentException("Input is null.");
		}
		if (!this.recentlyUsedList.contains(input)) {
			this.addAtBeginning(input);
		}
	}

	private void addAtBeginning(final Object input) {
		this.recentlyUsedList.add(0, input);
	}
}

