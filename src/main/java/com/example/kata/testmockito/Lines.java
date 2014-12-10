package com.example.kata.testmockito;

import java.util.ArrayList;
import java.util.List;

public class Lines {

	private final List<Line> value = new ArrayList<Line>();

	public boolean isEmpty() {
		return value.isEmpty();
	}

	public void add(final Line line) {
		value.add(line);
	}

	public Line getLast() {
		return value.get(value.size() - 1);
	}

	public Amount getTotal() {
		if (value.isEmpty()) {
			return new Amount(0);
		}
		return getLast().getAmount();
	}

}
