package com.example.kata.testmockito;


public class Invoice {

	private final Lines encapsulatedLines;

	public Invoice(final Lines lines) {
		encapsulatedLines = lines;
	}

	public Amount getTotal() {
		if (encapsulatedLines.isEmpty()) {
			return new Amount(0);
		}
		return encapsulatedLines.getLast().getAmount();
	}

	public Invoice addLine(final Line line) {
		encapsulatedLines.add(line);
		return this;
	}

}