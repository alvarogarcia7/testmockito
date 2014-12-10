package com.example.kata.testmockito;

import java.util.ArrayList;
import java.util.List;

public class Invoice {

	private final List<Line> lines;

	public Invoice() {
		lines = new ArrayList<Line>();
	}

	public Amount getTotal() {
		if (lines.isEmpty()) {
			return new Amount(0);
		}
		return lines.get(lines.size() - 1).getAmount();
	}

	public Invoice addLine(final Line line) {
		lines.add(line);
		return this;
	}

}